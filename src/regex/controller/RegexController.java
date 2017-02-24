package regex.controller;

import java.util.regex.Pattern;

import regex.view.RegexFrame;

public class RegexController
{
	private RegexFrame regexFrame;
	
	public RegexController()
	{
		regexFrame = new RegexFrame(this);
	}
	
	public boolean checkFirstName(String input)
	{
		boolean isValid = false;
		if (input.matches("[a-zA-Z]{2,30}"))
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	public boolean checkLastName(String input)
	{
		boolean isValid = false;
		if (input.matches("[a-zA-Z.,'-]{2,40}"))
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	public boolean checkPhoneNumber(String input)
	{
		boolean isValid = false;
		
		if (input.matches("[0-9]{10}"))
		{
			isValid = true;
		}
		return isValid;
	}
	
	public boolean checkEmail(String input)
	{
		boolean isValid = false;
		
		// Has only one @, at least one character before the @, one character 
		// before the period and one character after the period:
		if (input.matches("^[^@]+@[^@]+.[^@]+$"))
		{
			isValid = true;
		}
		return isValid;
	}
}
