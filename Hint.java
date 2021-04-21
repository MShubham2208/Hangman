package com.oopm.proj;
import java.io.*;
import java.util.ArrayList;

public class Hint { 
	static ArrayList<String> listOfLines = new ArrayList<>(); 
    static ArrayList<String> returnList() throws IOException{
    	BufferedReader bufferReader = new BufferedReader(new FileReader("src/Hint.txt"));
    	String line = bufferReader.readLine(); 
    	while (line != null) 
    	{
    		listOfLines.add(line); 
         	line = bufferReader.readLine(); 
    	} 
    	bufferReader.close();
        return listOfLines;
    }
}