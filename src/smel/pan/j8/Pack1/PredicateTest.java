package smel.pan.j8.Pack1;import java.util.ArrayList;import java.util.List;import java.util.Objects;import java.util.function.Predicate;/** * Created by SmelayaPanda on 20.04.2016. * Predicates are boolean-valued functions of one argument. * and Java's Predicate is functional interface * The interface contains various default methods * for composing predicates to complex logical terms (and, or, negate) */public class PredicateTest {    static Predicate<Integer> adult = age -> age >= 20;    static Predicate<Integer> young = age -> age < 18;    private int age;    private String name;    public PredicateTest(int age, String name) {        this.age = age;        this.name = name;    }    public static void main(String[] args) {        System.out.println(adult.test(44)); //true        System.out.println(young.test(44)); //false        System.out.println(adult.and(young).negate().test(19)); //true        List<PredicateTest> person = new ArrayList<>();        person.add(new PredicateTest(22, "Lena"));        young.test(person.get(0).getAge()); //false//------------------------------------------------------------------------------        Predicate<String> predicate = s -> s.length() >= 5;        predicate.test("Tool");   //false        predicate.test("Evening");  //true//------------------------------------------------------------------------------        Predicate<String> isEmpty = String::isEmpty;        Predicate<String> isnonEmpty = isEmpty.negate();        Predicate<Boolean> nonNull = Objects::nonNull;        Predicate<Integer> isNull = Objects::isNull;        System.out.println(isEmpty.test(person.get(0).getName())); //false        System.out.println(isnonEmpty.test(person.get(0).getName())); //true        System.out.println(isNull.test(person.get(0).getAge())); //false    }    public int getAge() {        return age;    }    public String getName() {        return name;    }}