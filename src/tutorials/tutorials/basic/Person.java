package tutorials.tutorials.basic;

public class Person {
    String  name;
     int age;
     public Person(String name){
        this.name= name;
         System.out.println("person created");
     }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public void sayHelloTo( Person person) {
        System.out.println(getName()+" say hello to "+getName());

    }
}
