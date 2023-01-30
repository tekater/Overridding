package overriddingandoverloading;

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // Перезаписываем метод invokeInstanceMethod
        subClass.invokeInstanceMethod();
        //
        subClass.invokeInstanceMethod("Hello");
        subClass.invokeInstanceMethod(Math.PI);
        subClass.invokeInstanceMethod(2);
        SuperClass superClass = new SuperClass(); System.out.println("\n");

        superClass.invokeInstanceMethod();
    }
}
