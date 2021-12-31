package com.greatlearning;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int transactionArray[] = new int[size]; 
		
		System.out.println("Enter the values of array");
		for(int i = 0; i<size; i++) {
			transactionArray[i]=sc.nextInt();
		}
		
		Sort sort = new Sort();
		sort.bubbleSort(transactionArray, size);

		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		Service service = new Service();
		for(int i = 0; i<noOfTargets; i++) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			service.targetAchievement(transactionArray, size, targetValue);
		}
	}
	
}
