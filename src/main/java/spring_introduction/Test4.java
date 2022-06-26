package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml");

//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Zhuchka");
//
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Bobik");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        context.close();
    }
}
