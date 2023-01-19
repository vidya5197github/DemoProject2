package com.velocity;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
  hm.put(1, "java");
  hm.put(2, "Sbringboot");
  hm.put(1, "String");
System.out.println(hm);
  
	}

}
