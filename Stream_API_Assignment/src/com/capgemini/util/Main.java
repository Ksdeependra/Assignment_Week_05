package com.capgemini.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.capgemini.service.Filter;
import com.capgemini.service.Mapper;

public class Main {
	public static void name(String[] args) {
		Filter filter=new Filter();
		Mapper mapper=new Mapper();
		
		 Scanner sc = new Scanner(System.in);  
		    System.out.println("Enter prefix");
		List<String> listOfNames = Arrays.asList("aaryanna", "aayanna",
				 "airianna", "alassandra", "allanna", "allannah",
				 "allessandra", "allianna", "allyanna", "anastaisa",
				 "anastashia", "anastasia", "annabella", "annabelle",
				 "annebelle"); 
		listOfNames.stream().filter(filter.nameStartingWithPrefix(sc.next())).map(mapper.getDistinctCharactersCount()).forEach(System.out::println);
		
				 
	}
	

}
