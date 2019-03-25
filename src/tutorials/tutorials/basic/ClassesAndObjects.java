package tutorials.tutorials.basic;

public class ClassesAndObjects {
    public static void main( String[] args ) {

        Person john = new Person("John");
        john.setName("John");
        john.setAge(20);
        Person bob = new Person("Bob");
        bob.setName("Bob");
        bob.setAge(25);
        john.sayHelloTo(bob);
        bob.sayHelloTo(john);
        System.out.println("John is "+ john.getAge()+" years old");
        System.out.println("Bob is "+ bob.getAge()+" years old");
    }
}
