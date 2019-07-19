package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Controller
{
	
	public void start()
	{
		System.out.println(camelCase("a b  c"));
	}
	
	
	public String camelCase(String str)
	{
		String returnMe = "";
		
		String[] wordArray = str.split("");
		
		for(int i = 0; i < wordArray.length; i++)
		{
			
			if(wordArray[i].contains(" ") == false)
			{
				System.out.println(wordArray[i] + " was the letter picked up");
			}
		}
		
		
		return returnMe;
		
	}
}
