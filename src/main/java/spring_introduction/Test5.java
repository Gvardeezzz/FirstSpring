package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog myDog2 = context.getBean("myPet", Dog.class);
        myDog2.say();

        context.close();
    }
}
