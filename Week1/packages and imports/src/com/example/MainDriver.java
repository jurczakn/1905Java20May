package com.example;
/*
 * The package declaration must be in the first line
 * of the class, otherwise the class will be put in the 
 * 'default package
 * 
 * the naming convention for packages is all lower case
 * and goes from more broad to more specific or general to specific.
 * 
 * package names in the format: 'com.something.something.classname'
 * is called the Fully Qualified Name'.
 * 
 * When using a class we need to use the fully qualified name
 * in the imports, or use it when instantiating the object.
 * 
 * 
 */
import static java.util.Arrays.parallelSort;

import java.util.List;

public class MainDriver {
	public static void main(String[] args) {
		//using a static import
		parallelSort(a);
		//using an import
		List<String> list;
		//using the fully qualified name for instantiation
		java.util.List<String> list2;
	}

}
