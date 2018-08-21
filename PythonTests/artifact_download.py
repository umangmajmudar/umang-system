import urllib.request
import base64
import os, ssl
from pathlib import Path


def download_artifact(url, dest, uid, token):
    print('url is %s dest is %s uid is %s token is %s' % (url,dest,uid,token))

	# create dest if does not exist
    if dest:
        if os.path.exists(dest):
            print('dest exists: ', dest)
        else:
            print('dest does not exist, creating now : ', dest)
            os.mkdir(dest)
    else:
        dest = str(Path.home())

    splittedurl = url.rsplit('/', 1).pop()
    dest = dest + '/' + splittedurl

	# https security handler
    if (not os.environ.get('PYTHONHTTPSVERIFY', '') and getattr(ssl, '_create_unverified_context', None)):
        ssl._create_default_https_context = ssl._create_unverified_context

    request = urllib.request.Request(url)

    if uid and token:

        credentials = ('%s:%s' % (uid, token))
        encoded_credentials = base64.b64encode(credentials.encode('ascii'))
        request.add_header('Authorization', 'Basic %s' % encoded_credentials.decode("ascii"))

    try:
        with urllib.request.urlopen(request, timeout=2) as response, open(dest, 'wb') as out_file:
            data = response.read()
            out_file.write(data)
            print("Success!")
    except urllib.error.URLError:
        print("Artifactory connection timed out, please check URL, UID and Token.")

def main():
    url = 'https://<artifactory_url>/<artifact_name>'
    uid = '<userid>'
    token = '<artifactory_token>'
    dest = '<artifact_download_location>'

    if url and uid and token:
        print("all good")
        download_artifact(url, dest, uid, token)
    elif uid is "" or token is "" or url is "":
        print("uid, token and url - all values are required to proceed")
    else:
        if url or dest:
            if url:
                print("Please provide destination")
            elif dest:
                print("Please provide URL")
            else:
                print("Please provide URL and destination")


main()

