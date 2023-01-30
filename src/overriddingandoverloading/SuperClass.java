package overriddingandoverloading;

public class SuperClass {
    // Перезаписываем и перегружаем
    public void invokeInstanceMethod() {
        System.out.println("SuperClass: invokeInstanceMethod");
    }
    public static String staticMethod() {
        System.out.println("");
        return null;
    }
}
