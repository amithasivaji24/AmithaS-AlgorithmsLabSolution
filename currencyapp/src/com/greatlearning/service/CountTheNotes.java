package com.greatlearning.service;

public class CountTheNotes {
	
	public void countNotes(int notes[], int amount) {
		
		if(amount == 0)
			return;
		
		int[] noteCounter = new int[notes.length];
		
		try {
			for(int i = 0;i < notes.length; i++) {
				if(amount == 0) {
					System.out.println();
				}
				
				if(amount>=notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
				
				if(amount > 0) {
					System.out.println("Exact amount cannot be given with the highest denomination");
				}
				else {
					System.out.println("Your payment approach in order to give min no of notes will be");
					for(int i1 = 0; i1< notes.length; i1++) {
						if(noteCounter[i1] != 0) {
							System.out.println(notes[i1] + ":" + noteCounter[i1]);
						}
					}
				}
		}catch (ArithmeticException e) {
		System.out.println("Currency denomination is zero hence an exception");
	}
}
}
