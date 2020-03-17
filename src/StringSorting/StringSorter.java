package StringSorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StringSorter {

	/*
	 * Function to sorts strings. Does not change the original lists
	 * @Param - original: starting list of strings. will not be changed after running sortStrings
	 * @Param - add: list of strings to add to original list. will not be changed
	 * @Param - remove: list of strings to be removed from list. will not be changed
	 * @Returns - list of strings containing the original list of strings with the addition
	 *            of all the strings in the add list, and with any strings from the remove list
	 *            removed, and any duplicates removed (only one of each string remains in the list)
	 *            These strings are sorted according to length, from longest to shortest. Any strings
	 *            that are of the same length appear in reverse alphabetical order
	 */
	public List<String> sortStrings(List<String> original, List<String> add, List<String> remove) {
		//Everything is initially placed in a set, to automatically remove any duplicated
		HashSet<String> workingSet = new HashSet<String>(original);
		
		//add the add list strings
		Iterator<String> addIter = add.iterator();
		while(addIter.hasNext()) {
			workingSet.add(addIter.next());
		}
		
		//remove the remove list strings
		Iterator<String> removeIter = remove.iterator();
		while(removeIter.hasNext()) {
			workingSet.remove(removeIter.next());
		}
		
		//transfer the strings to a list so they can be sorted
		ArrayList<String> sorted = new ArrayList<String>(workingSet);
		sort(sorted, 0, sorted.size() - 1);
		
		return sorted;
	}
	
	/* 
	 * An implementation of QuickSort for strings. Sorts based on length. In event of a tie, the strings 
	 * are put in reverse alphabetical order
	 */
	private void sort(List<String> list, int low, int high) {
		if (low < high) {
			int partIndex = partition(list, low, high);
			
			sort(list, low, partIndex-1);
			sort(list, partIndex+1, high);
		}
	}
	
	/*
	 * Implementation of the partition part of QuickSort
	 * Handles the event of a tie, deciding that reverse alphabetical order is used if strings are the same length
	 * Does not take capitalization into account. If two strings are the same after running toLowerCase() on both of them,
	 * this algorithm will not do anything specific to sort them. They will show up in whatever order, but they will be
	 * next to each other. Does not guarantee most capitalized first/first string with a capitalized letter, etc.
	 */
	private int partition(List<String> list, int low, int high) {
		String pivot = list.get(high);
		int i = low;
		//Finding all strings longer than our pivot point, and moving them to the left
		for (int j = low; j < high; j++) {
			if (list.get(j).length() > pivot.length()) {
				swap(list, i, j);
				i++;
			}
			//If the strings are the same length, they will be sorted in reverse alphabetical order
			if (list.get(j).length() == pivot.length()) {
				if (list.get(j).compareToIgnoreCase(pivot) > 0) { //compareToIgnoreCase returns a negative number if list.get(j) comes
					            //before pivot in the alphabet, which means we must swap list.get(j) and put it on the left of pivot.
					swap(list, i, j);
					i++;
				}
			}
		}
		//Put pivot in its place; directly to the right of the last element that was moved to its left
		//pivot is located at high, and i is one to the right of the last element that was moved in the for loop
		swap(list, i, high);
		return i;
	}
	
	/*
	 * Helper method to swap items in the list
	 */
	private void swap(List<String> list, int i, int j) {
		String temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}
