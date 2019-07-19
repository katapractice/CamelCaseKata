package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Controller
{
	
	public void start()
	{
		System.out.println(camelCase("a b  c hello world"));
	}
	
	
	public String camelCase(String str)
	{
		String returnMe = "";
		String[] wordArray = str.split("");
		int spaceIndex = 0;
		
		
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
}
