package Synchronization;

import Synchronization.Student;

public class Torun {


    public static void main(String args[])throws CloneNotSupportedException{
        Student s1= new Student();
        Student s2;
        s1.roll=12;
        s1.em.id=345;
        s2=(Student)s1.clone();
        s1.roll=13;
        s1.em.salary=10000;
        s1.em.id=234;

        System.out.println("s:::"+s1.roll+" ::::s2 ::::"+s2.roll);
        System.out.println("s:::"+s1.em.id+" ::::s2 ::::"+s2.em.id);
    }
}
