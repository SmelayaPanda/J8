package adnap.ayalems;

/**
 * Created by SmelayaPanda on 20.04.2016.
 * see how the :: keyword works for constructors
 */

interface PersonFactory<P extends Person> {
    P create(String firstname, String lastname);
}

public class Person {

}
