package com.codegym.another;

import com.codegym.access_modifier.Instructor;

public class AnotherInstructor extends Instructor {

    public AnotherInstructor(int id, String name, String skills, String address2) {
        super(id, name, skills, address2);
    }

    public static void main(String[] args) {
//        System.out.println(Instructor.skills);//cannot access method with default level
//        System.out.println(Instructor.experience);
//        System.out.println(Instructor.address);

        Instructor feInstructor = new Instructor(2, "Ân", "FullBugs", "21K NVT 456");
        System.out.println(feInstructor.getAddress2());
    }
}
