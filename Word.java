package com.oopm.proj;

public class Word{
    public static int uniqueCharacters(String test){
    	String temp = " ";
    	for (int i = 0; i < test.length(); i++){
    		if (temp.indexOf(test.charAt(i)) == - 1){
    			temp = temp + test.charAt(i);
    		}
    	}
    	return temp.length();
   }
}