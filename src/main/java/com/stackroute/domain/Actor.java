package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:property.properties")
public class Actor {
    private String name;
    private  String gender;
    private int age;

    public Actor() {
    }

    public String getName() {
        return name;
    }
    @Value("${Actor.name}")
    //@Value("Yashawant")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${Actor.gender}")
   //@Value("Yashawant")
    public void setGender(String gender) {
        this.gender = gender;
    }
     @Value("${Actor.age}")
    //@Value("22")
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
