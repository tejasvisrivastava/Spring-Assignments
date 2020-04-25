package com.capg.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;
import com.capg.spring.beans.SBU;

public class AppTester {
	
	public static void main(String args[])
	{
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring-config.xml");
		
	    Employee employee =iocContainer.getBean("employee",Employee.class);
	    SBU sbu=iocContainer.getBean("sbu",SBU.class);
	    System.out.println(employee);
	    System.out.println(sbu);
	    
		/*System.out.println("Employee details");
		System.out.println("--------------------");
		//System.out.println(employee.getEmployeeId()+"  "+employee.getEmployeeName()+" "+employee.getSalary()+" "+employee.getUnit()+" "+employee.getAge());
		System.out.println("Employee Id:"+employee.getEmployeeId());
		System.out.println("Employee Name:"+employee.getEmployeeName());
		System.out.println("Salary:"+employee.getSalary());
		System.out.println("BU:"+employee.getUnit());
		System.out.println("Age:"+employee.getAge());*/
		
		
		
	}

}

