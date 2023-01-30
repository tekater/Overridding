package overridding;

public class Human extends Mammal{
    @Override
    public String sayHello() {
        return "Hello";
    }
}
