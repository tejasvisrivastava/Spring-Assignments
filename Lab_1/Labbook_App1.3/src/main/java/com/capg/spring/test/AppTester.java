
package com.capg.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.bean.Employee;
import com.capg.spring.bean.SBU;

public class AppTester {
	
	public static void main(String args[])
	{
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring-config.xml");
		
	    //Employee employee =iocContainer.getBean("employee",Employee.class);
	    SBU sbu=iocContainer.getBean("sbu",SBU.class);
	    
	    
	    System.out.println(sbu);
	    Employee emp1 =iocContainer.getBean("emp1",Employee.class);
	    System.out.println(emp1);
	    Employee emp2 =iocContainer.getBean("emp2",Employee.class);
	    System.out.println(emp2);
	}
}
