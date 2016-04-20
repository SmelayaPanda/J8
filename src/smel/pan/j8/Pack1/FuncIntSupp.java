package smel.pan.j8.Pack1;

/**
 * Created by SmelayaPanda on 20.04.2016.
 * Each lambda corresponds to a given type, specified by an interface.
 * A so called functional interface must contain exactly one abstract method declaration.
 * Each lambda expression of that type will be matched to this abstract method.
 * Since default methods are not abstract you're free to add default methods to your functional interface.
 * We can use arbitrary interfaces as lambda expressions as long as the interface only contains one abstract method.
 * To ensure that your interface meet the requirements, you should add the @FunctionalInterface annotation.
 * The compiler is aware of this annotation and throws a compiler error as soon as you try to add a second abstract method declaration to the interface.
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F slovo);
}

class ConverterTest {
    public static void main(String[] args) {

        /**Converter<String,Integer> converter = (slovo -> Integer.valueOf(slovo));
         *Java 8 enables you to pass references of methods or constructors via the :: keyword
         *and more simple:
         */
        Converter<String, Integer> converter = Integer::valueOf;

        Integer number = converter.convert("123");
        System.out.println("Now, we have the number: " + number);
    }


    /**
     * --------------------------------------------------------------------------
     * The above example shows how to reference a static method.
     * But we can also reference object methods:
     */
    class Something {
        Converter<String, String> converter = this::startWith;
        String connverted = converter.convert("Lambda is magic");

        String startWith(String s) {
            return String.valueOf(s.charAt(10));
        }
    }
}

