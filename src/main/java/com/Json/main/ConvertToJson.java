package com.Json.main;


import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {

	public static void main(String[] args) throws  IOException {
		ObjectMapper  mapper=new ObjectMapper();
		Employee emp1=new Employee();
		emp1.setEmail("JBl23@gmail.com");
		emp1.setId(234);
		emp1.setName("Jithu");
mapper.writeValue(new File("Employee.json"), emp1);

System.out.println("Converted to Json format of EMPLOYEE OBJECT");

	}

}
