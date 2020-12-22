package ua.khpi.oop.demianenko06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {
    public boolean serialization(Container s) {
    	boolean flag = false;
    	
    	File file = new File("C:\\Users\\d1mad\\java\\lab6.data");
    	
    	ObjectOutputStream oos = null;
    	try {
    	   FileOutputStream fos = new FileOutputStream(file); 
    	   if (fos!=null) {
    	   oos = new ObjectOutputStream(fos);
    	   oos.writeObject(s);
    	   flag = true;
    	   }
    	} catch (FileNotFoundException e){
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		if(oos!=null) {
    			try {
    		    oos.close();
    			}catch (IOException e) {
    	    		e.printStackTrace();
    	    	}
    	}
    }
    	return flag; 
  } 
    public Container deserialization() throws InvalidObjectException{
    	File file = new File("C:\\Users\\d1mad\\java\\lab6.data");
    	ObjectInputStream ois = null;
    	try {
			FileInputStream fis = new FileInputStream(file); 
	        if (fis!=null) {
	        ois = new ObjectInputStream(fis);
	        Container s = (Container) ois.readObject();
	        return s;
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
    			try {
    		    ois.close();
    			}catch (IOException e) {
    	    		e.printStackTrace();
    	    	}
   }
    	throw new InvalidObjectException("Object fail");
}
}


