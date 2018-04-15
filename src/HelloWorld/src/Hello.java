public class Hello {
    public static void main(String[] args) {
        System.out.print(String.format("Hello, %s", Constant.FIRST_NAME));
        System.out.print(Constant.kilograms + "\n");
        System.out.println(Constant.registerSymbol);
        if (Constant.remainder <= 20d) {
            System.out.println("Total was over the limit");
        }
    }
}

class Constant {
    public static final String FIRST_NAME = "Anthony";

    //017 Getting to Know Primitives
    byte variableX = 123;
    short variableY = 123;
    int variableZ = 123;
    long variableA = 50_000 + 10 * (variableX + variableY + variableZ);

    //018 Getting to Know Primitives
    static int pounds = 2;
    static double kilograms = (pounds * .45359237);

    //019 Getting to Know Primitives
    static char registerSymbol = '\u00AE';

    //022 More on Operators
    static double val1 = 20;
    static double val2 = 80;
    static double result = (val1 + val2) * 25;
    static double remainder = result % 40;

}
