public class Hello {
    public static void main(String [] args) {
        System.out.print(String.format("Hello, %s", Constant.FIRST_NAME));
    }
}
class Constant {
    public static final String FIRST_NAME = "Anthony";

    //017 Getting to Know Primitives
    byte variableX = 123;
    short variableY = 123;
    int variableZ = 123;
    long variableA = 50000 + 10 * (variableX + variableY + variableZ);
}
