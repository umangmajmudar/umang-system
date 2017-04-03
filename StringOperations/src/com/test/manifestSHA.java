package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.Attributes.Name;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

import javax.naming.directory.Attributes;

public class manifestSHA {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		java.util.jar.Attributes m = new JarFile("/Users/umangmajmudar/Downloads/my-app-1.0-SNAPSHOT-sha-12e470ceb83b34e39791d1628655ddac98310956.jar").getManifest().getMainAttributes();
		System.out.println("value str ::: "+m.getValue("abc"));
		//final Attributes mattr = (Attributes) m.getMainAttributes();
		//System.out.println("Attributes ::: "+mattr);
		
		//JarFile jarfile = new JarFile("/Users/umangmajmudar/Documents/maven-git-plugin-test/blackboard/target/blackboard-1.0-SNAPSHOT-sha-ce48ed51e4c51866f1d8427b7777d38446f57aa4.war");
		
		JarFile jarfile = new JarFile("/Users/umangmajmudar/Downloads/my-app-1.0-SNAPSHOT-sha-12e470ceb83b34e39791d1628655ddac98310956.jar");
		
	    Manifest manifest = jarfile.getManifest();

	    //java.util.jar.Attributes attrs = (java.util.jar.Attributes) manifest.getMainAttributes();
	    Map<Object, Object> attrs = manifest.getMainAttributes();
	    System.out.println("attrs :::: "+attrs.toString());

	    Iterator itr = attrs.keySet().iterator();
	    
	    Iterator itrVal = attrs.values().iterator();
	    
	    while(itrVal.hasNext()){
	    	System.out.println("value is ::: "+itrVal.next());
	    }
	    
	    
	 /*   for (Iterator it = ((java.util.jar.Attributes) attrs).keySet().iterator(); it.hasNext();) {
		     // Attributes.class. attrName =  it.next();
		    	java.util.jar.Attributes.Name attrName = (Name) it.next();

		      String attrValue = ((java.util.jar.Attributes) attrs).getValue(attrName);
		      System.out.println("attrName ::: "+attrName+" ::: attrValue ::: "+attrValue);
		    }  */
	    
	    
	    
	 //   System.out.println("11111");
	    JarFile jarfile1 = new JarFile("/Users/umangmajmudar/Downloads/my-app-1.0-SNAPSHOT-sha-12e470ceb83b34e39791d1628655ddac98310956.jar");

	    Manifest manifest1 = jarfile1.getManifest();
	//    System.out.println("manifest1 ::: "+manifest1.toString());
	 //   System.out.println("manifest1 params ::: "+manifest1.getEntries().toString());

	    Map map = manifest1.getEntries();
	//    System.out.println("1 ::: " +map.toString());
	    Iterator it = map.keySet().iterator();
	    while (it.hasNext()) {
	  //  	System.out.println("111");
	      String entryName = (String) it.next();
	  //    System.out.println("2");
	      Attributes attrs1 = (Attributes) map.get(entryName);

	      for (Iterator it2 = ((java.util.jar.Attributes) attrs1).keySet().iterator(); it2.hasNext();) {
	    	  java.util.jar.Attributes.Name attrName = (Name) it2.next();
	 //   	  System.out.println("3");
	        String attrValue = ((java.util.jar.Attributes) attrs).getValue(attrName);
	       System.out.println("name ::: "+attrName+" ::: value ::: "+attrValue);
	      }
	    }
	
	}

}
