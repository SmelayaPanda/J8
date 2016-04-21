package smel.pan.pack2_interfaces;

/**
 * Functional interface can not have more than one abstract method
 */

@FunctionalInterface
public interface FunclInterface {
    void method1();

    //void method2(); - get compile error
    default void method2() {
    }

    default void method3() {
    }


}
