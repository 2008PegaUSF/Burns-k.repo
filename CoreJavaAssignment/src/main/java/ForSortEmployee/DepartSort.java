package ForSortEmployee;

import java.util.Comparator;

import Assignments.SortEmployee;

public class DepartSort implements Comparator<SortEmployee> {
	
	// compares two employees by their department
		public int compare(SortEmployee o, SortEmployee k) {
			return o.department.compareTo(k.department);
			}
}
