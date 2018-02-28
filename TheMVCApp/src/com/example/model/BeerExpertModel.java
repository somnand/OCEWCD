package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpertModel {

	public List<String> getBrands(String color)
	{
		List<String> brands=new ArrayList<String>();
		if(color.equals("amber"))
		{
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else
		{
			brands.add("Jail's pal Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
	
}
