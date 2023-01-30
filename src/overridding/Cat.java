package overridding;

public class Cat extends Mammal{
    @Override
    public String sayHello() {
        return "Meow";
    }
}
