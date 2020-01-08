package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp1 {
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore1.xml");
	Student1 s=(Student1) ctx.getBean("std");
	Address a=(Address) ctx.getBean("adr");
	System.out.println(s.getRegno()+" "+s.getStdname()+s.getAddress().getStreet()+
			" "+s.getAddress().getCity());
	
	
	
}
}

	
