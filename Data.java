package com.oopm.proj;
import java.io.*;
import java.util.ArrayList;

public class Data { 
	static ArrayList<String> listOfLines = new ArrayList<>();
	public static ArrayList<String> returnList() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new FileReader("src/Data.txt"));
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
