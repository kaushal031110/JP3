class Person {
    void eat() {
        System.out.println("The person eats rice.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("The Student studies in CU");
    }
}

public class JP3 {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Student myStudent = new Student();


        // Call methods from both the parent and child class
        myStudent.eat();   // Inherited method from Animal class
        myStudent.study();  // Method from Dog class
    }
}
