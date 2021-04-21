package com.oopm.proj;
import java.io.*;
import java.util.Scanner;
public class Stuffs {
	public static void Rules() {
		System.out.println("	--------------------------------------------------------------------");
		System.out.println("		1) You'll have to guess the name of the object            ");
		System.out.println("		2) You'll hava to enter a letter according to your guess  ");
		System.out.println("		3) You'll have 5 chances                               ");
		System.out.println("          		  CHILL AND PLAY THE GAME !                   ");
		System.out.println("	--------------------------------------------------------------------");
	}
	public static void Intro()
	{
		System.out.println("                           --------------------------     ");
		System.out.println("                           |  WELCOME TO THE GAME ! |     ");
		System.out.println("                           --------------------------     ");
	}
	public static void playAgain() throws IOException {
		System.out.println("Play again? 1/0");
		Scanner sc = new Scanner(System.in); 
      	int bool = sc.nextInt();
      	if(bool == 1)
      	{
      		return ;
      	}
      	else
      	{
      		System.exit(-1);
      	}
	}
}