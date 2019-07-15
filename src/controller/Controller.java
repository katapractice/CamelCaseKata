package controller;

import java.util.Iterator;

public class Controller
{
	
	public void start()
	{
		System.out.println(camelCase("hello case    "));
	}
	
	
	public String camelCase(String str)
	{
		String returnMe = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				returnMe += (String.valueOf(str.charAt(i)));
			}
			else
			{
				if(i < str.length() -1 )
				{
					returnMe+=(String.valueOf(str.charAt(i+=1)).toUpperCase());
				}
			}
		}
		
		return returnMe;
	}
}
