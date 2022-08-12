package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("LotsOfBeans.xml");
        Student david = (Student)context.getBean("Student");
        david.studentInfo();
    }
}
