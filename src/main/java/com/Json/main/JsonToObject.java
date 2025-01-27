package com.Json.main;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
ObjectMapper mapper=new ObjectMapper();
Employee emp=(Employee)mapper.readValue(new File("Employee.json"), Employee.class);
System.out.println("Json to Java object:"+emp);


	}

}
