package com.demo2;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student1>{


	@Override
	public int compare(Student1 obj1, Student1 obj2) {
		
		if(obj1.getMarks()>obj2.getMarks())
		{
			return 1;
		}
		else if(obj1.getMarks()<obj2.getMarks())
		{
			return -1;
		}
			
		return 0;
	}

}
