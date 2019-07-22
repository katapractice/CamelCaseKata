package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Controller
{
	
	public void start()
	{
		System.out.println(camelCase("Hello case method"));
		System.out.println(neatSolution("Hello case method"));
	}
	
	
	public String camelCase(String str)
	{
		String returnMe = "";
		String[] wordArray = str.split("");
		
		int spaceIndex = Arrays.asList(wordArray).indexOf(" ");
		
		for(int i = 0; i < wordArray.length; i++)
		{
			if(i == 0)
			{
				wordArray[i] = wordArray[i].toUpperCase();
			}
			if(wordArray[i].contains(" "))
			{
				
				spaceIndex = i;
			}
			else
			{
				if(i == spaceIndex + 1)
				{
					wordArray[i] = wordArray[i].toUpperCase();
				}
				returnMe = returnMe.concat(wordArray[i]);
			}
		}
		
		
		return returnMe;
		
	}
	
	
	private String neatSolution(String str)
	{
		// your code here
        String[] strings = str.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String string : strings) 
		{
        	if (string.length()>0)
        	{
            stringBuilder.append(string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
		    }

		 }
        return new String(stringBuilder);

	}
}
