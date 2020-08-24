package ForSortEmployee;

import java.util.Comparator;

import Assignments.SortEmployee;

public class NameSort implements Comparator<SortEmployee>{
	
	// compares two employees by their name
	//fyi all they all use int for a datatype
		public int compare(SortEmployee o,SortEmployee k) {
			return o.name.compareTo(k.name);
			}
}
