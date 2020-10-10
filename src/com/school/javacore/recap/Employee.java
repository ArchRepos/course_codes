package com.school.javacore.recap;

public class Employee {
    private String name;
    private long salary;
    private static int lastEmployeeId;
    private int id;

    {
        System.out.println("Instance Initializer");
    }

    //static initializer
    //static variable is called only once when the First object is craeted from Employee class.
    //next time you create objects form Employee class, static initializer doesnt get executed.
    static {
        System.out.println("Static Initializer");
        lastEmployeeId = 1;
    }

    public Employee(String name, long salary, int id) {
        System.out.println("Constructor");
        this.name=name;
        this.salary = salary;
        this.id = id;
    }


    //All employees should have a method which returns salary same as the initial salary.
    public long employeeSalary(){
        return this.salary;
    }

    public String getEmployeeName(){
        return this.name;
    }

    public int getLastEmployeeId(){
        return lastEmployeeId;
    }

    public void setLastEmployeeId(int id){
        lastEmployeeId = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


class Demo {

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 20000,1);
        Employee e2 = new Employee("Alex", 30000,2);

        //instance
        System.out.println(e1.getId());
        System.out.println(e2.getId());

        //static values
        System.out.println(e1.getLastEmployeeId());
        System.out.println(e2.getLastEmployeeId());
        e1.setLastEmployeeId(12);
        System.out.println(e1.getLastEmployeeId());
        System.out.println(e2.getLastEmployeeId());

        e1.setId(5);
        System.out.println(e1.getId());
        System.out.println(e2.getId());
    }


}
