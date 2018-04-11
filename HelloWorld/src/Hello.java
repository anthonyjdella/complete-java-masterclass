public class Hello {
    public static void main(String [] args) {
        System.out.print(String.format("Hello, %s", Constant.FIRST_NAME));
    }
}
class Constant {
    public static final String FIRST_NAME = "Anthony";
}
