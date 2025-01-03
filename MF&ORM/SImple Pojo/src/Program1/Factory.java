package Program1;

import java.util.ResourceBundle;

public class Factory {
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	private Factory() {
		
	}
	//function for getting object of the class given in file config.properties
	static Producer getObject() {
		Object object = null;
		//fetching the class name from key value pair given in getString method
		String className = rb.getString("classname");
		try {
			//creating the object for the class name value
			object = Class.forName(className).getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}//object creation required exception handling
		return (Producer)object;// Type casting is done
	}

}
