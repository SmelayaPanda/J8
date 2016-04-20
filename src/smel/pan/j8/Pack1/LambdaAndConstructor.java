package smel.pan.j8.Pack1;

/**
 * Created by SmelayaPanda on 20.04.2016.
 * see how the :: keyword works for constructors
 */

interface PersonFactory<P extends Person> {
    P create(String a, String b);

}

class Person {
    String firstname;
    String lastname;
    PersonFactory<Person> personPersonFactory = Person::new;
    Person person1 = personPersonFactory.create("Peter", "Parker");
    Person person3 = new Person("Peter", "Parker");
    Person person4 = new Person();
    //Person person2 = personPersonFactory.create(); - compile error

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

}
/**
 * Instead of implementing the factory manually,
 * we glue everything together via constructor references:
 * We create a reference to the Person constructor via Person::new.
 * The Java compiler automatically chooses the right constructor by matching the signature of PersonFactory.create.
 */

