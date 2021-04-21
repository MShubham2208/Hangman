package com.oopm.proj;

public class Hangman {
	public static void xyz(int x) {
		switch (x) {
			case 1:  one();
				 	break;
			case 2:  two();
		 		 	break;
			case 3:  three();
		 		 	break;
			case 4:  four();
		 		 	break;
			case 5:  five();
		 		 	break;
			case 6:  gameOver();
		 		 	break;
			default : System.out.println("Wrong entry");
		}
	}

	public static void one() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 5]");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
	public static void two() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 4]");
		System.out.println("|     O   ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
	public static void three() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 3]");
		System.out.println("|     O   ");
		System.out.println("|    /| ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
	public static void four() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 2]");
		System.out.println("|     O   ");
		System.out.println("|    /|\\ ");
		System.out.println("|     |   ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
	public static void five() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 1]");
		System.out.println("|     O   ");
		System.out.println("|    /|\\ ");
		System.out.println("|     |   ");
		System.out.println("|    /");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
	public static void gameOver() {
		System.out.println("|------------");
		System.out.println("|     |      [Life: 0]");
		System.out.println("|     O   ");
		System.out.println("|    /|\\ ");
		System.out.println("|     |   ");
		System.out.println("|    / \\ ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("*******************");
	}
}
