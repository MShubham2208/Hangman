package com.oopm.proj;

import com.oopm.proj.Game;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class Game {
	public static int count(String s, int c)
	{	 
			int res = 0; 
			for (int i = 0; i < s.length(); i++) 
			{ 
				if (s.charAt(i) == c) 
				res++; 
			}  
			return res; 
	} 
	public static void main(String[] args) throws IOException {   
		Stuffs.Intro();
		Stuffs.Rules();
		ArrayList<String> readData = Data.returnList();
		ArrayList<String> readHint = Hint.returnList();
		play(readData, readHint);
	}
	static void play(ArrayList<String> listData, ArrayList<String> listHint) throws IOException{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int index  = rand.nextInt(listData.size());
		String name = listData.get(index);
		String hint = listHint.get(index);
		String temp = name;
		for(int i = 0; i < (Word.uniqueCharacters(name)-1); i++)
		{
			index = rand.nextInt(name.length());
			char ch = name.charAt(index);
			temp = temp.replace(ch, '-');
		}
		System.out.println("                           --------------------------     ");
		System.out.print("                                    ");
		System.out.println(temp);
        System.out.println("                           --------------------------     ");
        System.out.println("Hint: "+hint);
        System.out.println("\n Please enter a Letter: ");
       	Hangman.xyz(1);
       	System.out.print("Input >>");
		int dashCount = 0;
		int wrong = 1;
		
       	for(int i = 0; i < name.length(); i++)
       	{
       		char input = scan.next().charAt(0);
       		input = Character.toUpperCase(input);
       		int occur = count(name, input);
       		if(name.indexOf(input) == -1)
       		{
       			System.out.println("Wrong entry, please try again.\n");
       			wrong++;
       			Hangman.xyz(wrong);
       			if(wrong == 6)
       			{
       				System.out.println("Game Over.");
       		       	Stuffs.playAgain();
       		       	listData.remove(name);
       		       	listHint.remove(hint);
       		       	play(listData, listHint);
       			}
       		}
       		else
       		{
       			int posOfInputChar = 0;
       			for(int j = 0; j < occur; j++)
       			{
       				posOfInputChar = name.indexOf(input, posOfInputChar);
       				temp = temp.substring(0, posOfInputChar) + input + temp.substring(posOfInputChar + 1);
       				posOfInputChar++;
       				dashCount = count(temp, 45);
       			}
       			System.out.println("--------------------------     ");
       			System.out.println("       "+temp);
       			System.out.println("--------------------------     ");
       			System.out.println("Right choice, guess next character.\n");
       			Hangman.xyz(wrong);
       			if(dashCount == 0)
           		{
           			System.out.println("Congratulations, you've won the game.");
           			Stuffs.playAgain();
           			listData.remove(name);
       		       	listHint.remove(hint);
       		       	play(listData, listHint);
           		}
       		}
       	}
	}
}