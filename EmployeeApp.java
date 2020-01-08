package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
Employee e1=(Employee)ctx.getBean("emp");
//s.setEmpname("deloitte");
//s.setSalary(60000);
System.out.println(e1.getEmpname()+" "+e1.getSalary());
Employee e2=(Employee)ctx.getBean("emp");
e2.setEmpname("sai");
e2.setSalary(54000);
System.out.println(e2.getEmpname()+" "+e2.getSalary());
System.out.println(e1.getEmpname()+" "+e1.getSalary());
System.out.println("Skills"+e2.getSkills());
}

}


