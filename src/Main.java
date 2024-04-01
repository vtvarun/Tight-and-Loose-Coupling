public class Main {
    public static void main(String[] args) {

        // Topics covered:
        //1.  Tight couping and loose coupling
        //2. Dependency inversion principle (last principle of Solid Principles in JAVA)


        // Tight coupling
        // When the high level module is dependent on low-level module, rather than an interface, it is called
        // tight coupling...in other words, if a class is dependent on a concrter class with implementation,
        // rather than interface, it is called tight coupling.
        // In below example
        // Employee is a high level module which is dependent on Laptop and Computer classes which have thier own implementions


        // If employee is dependent on an interface Computer rather than concrete classes, we call that phenomenon
        // loose coupling

        // Dependency inversion principle means
        // that the high level module is not dependent on the low level module



        Laptop laptop = new Laptop();
        Employee employee = new Employee();
        employee.code(laptop);





    }
}

interface Computer{
    public void work();
}

class Desktop implements Computer{
    @Override
    public void work(){
        System.out.println("Working on Desktop");
    }
}

class Laptop implements Computer{

    @Override
    public void work(){
        System.out.println("Working on Laptop");
    }

}

class Employee{

    public void code(Computer computer){
        computer.work();
    }

}

