package tutorials.tutorials.basic;

public class ReferenceAndValueTypes {
    public static void main( String[] args ) {
         int x=5;
         addOaneto(5);
        System.out.println(x);
        Person john;
        john= new Person("John");
        john.setAge(20);
        celebrateBirthday(john);
        System.out.println(john.getAge());



    }

    private static void celebrateBirthday( Person person ) {
        person.setAge(person.getAge()+1);
    }

    static void addOaneto(int number){
        number=number+1;
    }
}
