package com.capgemini.service;

import java.util.function.Function;

import com.capgemini.bean.CharactersCount;

public class Mapper {
	public static Function<String, CharactersCount> getDistinctCharactersCount(){
	
		return name->{
			int characterCount = (int)name.chars().distinct().count();
			return new CharactersCount(name,characterCount);
			
		};
		
	}

}
