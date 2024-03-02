package Synchronization;

public class Student implements Cloneable {
    int roll;
    String say; char c;
    Integer rall=Integer.valueOf(roll);
    int re=rall.intValue();
    Boolean bool=Boolean.valueOf(say);
    boolean bo=bool.booleanValue();
    Character ch=Character.valueOf(c);
    char chh= ch.charValue();

    Employee em= new Employee();
    @Override
    protected Object clone() throws CloneNotSupportedException {
       Student student = (Student) super.clone();
        System.out.println("rall::::"+rall);
        // em.clone();
         student.em=(Employee) em.clone();

        return student;
    }



}
