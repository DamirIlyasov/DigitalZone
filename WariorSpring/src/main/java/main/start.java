package main;

import interfaces.impl.warrior.Antosha;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class start {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Antosha warrior = (Antosha) context.getBean("antosha");
        warrior.attack();
    }
}
