package gl.dsa2_driver;

import java.util.Scanner;

import gl.dsa2_service.MergeSortImplementation;

import gl.dsa2_service.NotesCount;


public class Main {
	
	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations.");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value.");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the amount you want to pay.");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		
		for (int i = 0; i < size; i++) {
			
		}
		
		sc.close();
		notesCount.notesCountImplementation(notes, amount);
		
		System.out.println();
		System.out.println("THANK YOU.");
	}

}
