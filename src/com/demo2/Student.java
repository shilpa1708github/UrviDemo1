package com.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(101,"Urvi hubale","pune",96));
		list.add(new Student1(102,"Aradhya hubale","Barsi",86));
		list.add(new Student1(103,"Asmi waghmode","Latur",91));
		
		System.out.println(" Before sorting"+list);
		
		Collections.sort(list, new MarksComparator());
		System.out.println("Sorting based on marks"+list );
	}

}
