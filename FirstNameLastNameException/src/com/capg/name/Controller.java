package com.capg.name;

public class Controller {
public String controls(String first,String last)throws NameException
{
	if(first.isEmpty()||last.isEmpty())
	{
		throw new NameException("Exception raised");
	}
	else
	{
		return first+last;
	}

}
}
