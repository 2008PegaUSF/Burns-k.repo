package ForSortEmployee;

import java.util.Comparator;

import Assignments.SortEmployee;

public class AgeSort implements Comparator<SortEmployee>{
	
	
	// compares two employees by their age
		public int compare(SortEmployee o, SortEmployee k) {
			return o.age - k.age;
			}
}
