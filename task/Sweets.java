package com.xworkz.task;

public class Sweets {
	private String[] sweetNames=new String[7];
	private int index=0;
	
	public void store(String sweetName)
	{
		sweetNames[index]=sweetName;
		index++;
	}
	
	public void display()
	{
		for(String ref: sweetNames)
		{
			System.out.println("Sweet Name :"+ref);
			
		}
	}

}
