package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.BubbleSort;
import com.greatlearning.service.CountTheNotes;

public class CurrencyDenomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int denominationsArray[] = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<size; i++) {
			denominationsArray[i]=sc.nextInt();
		}
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(denominationsArray, size);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		CountTheNotes noteCount = new CountTheNotes();
		noteCount.countNotes(denominationsArray, amount);

	}

}
