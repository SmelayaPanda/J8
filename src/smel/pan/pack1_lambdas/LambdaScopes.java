package smel.pan.pack1_lambdas;/** * Created by SmelayaPanda on 20.04.2016. * Accessing outer scope variables from lambda expressions is very similar to anonymous objects. * You can access final variables from the local outer scope as well as instance fields and static variables. * In constrast to local variables we have both read and write access to instance fields and static variables from within lambda expressions. * This behaviour is well known from anonymous objects. */public class LambdaScopes {    static int outerStativNum;    int outerNum;    void testScoppe() {        Converter<Integer, String> stringConverter1 =                slovo -> {                    outerNum = 24;                    return String.valueOf(slovo);                };        Converter<Integer, String> stringConverter2 =                slovo -> {                    outerStativNum = 22;                    return String.valueOf(slovo);                };    }    /**     * (!)Default methods cannot be accessed from within lambda expressions.     */}