package Synchronization;

public class Employee implements Cloneable  {
    int id;
    int salary;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
