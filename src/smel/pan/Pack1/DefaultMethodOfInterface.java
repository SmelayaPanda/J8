package smel.pan.Pack1;

/**
 * Created by SmelayaPanda on 20.04.2016.
 */
public interface DefaultMethodOfInterface {
    /**
     * Java 8 anable new non-abstract method!
     * KEYWORD - default.
     * Not required to override to provide an implementation for sqrt()
     */

//-------------------------------------------------------------------
    interface NewDefMetodFoInterface {

        NewDefMetodFoInterface formula = new NewDefMetodFoInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        static void main(String[] args) {

            System.out.println(formula.calculate(100));
            System.out.println(formula.sqrt(100));

            //not override sqrt(), but I can use this method!

        }

        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);

        }

    }

}
