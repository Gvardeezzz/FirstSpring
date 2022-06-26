package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surmane;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


//    public Person() {
//        System.out.println("Person bean is created");
//    }

//    @Autowired
//    @Qualifier("catBean")
//    public void setPet(Pet pet) {
//        System.out.println("Class person. Pet is setted!");
//        this.pet = pet;
//    }


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        System.out.println("Surname setted");
        this.surmane = surmane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age setted");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Ko mne, uebok!");
        pet.say();
    }
}
