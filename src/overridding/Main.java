package overridding;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println("Mammal say: " + "\n" + mammal.sayHello() + "\n");

        Human human = new Human();
        System.out.println("Human say: " + "\n" + human.sayHello() + "\n");

        Cat cat = new Cat();
        System.out.println("Cat say: " + "\n" + cat.sayHello() + "\n");

        // Правила для перезаписи методов
        //1. У метода должно быть такое же имя как и в родительском классе.
        //2. Аргументы должны быть таким же как и у метода в родительском классе.
        //3. Возвращаемый тип должен быть таким же или должен быть подтипом вовзращаемого типа декларированного в методе суперкласса.
        //4. Модификатор доступа должен быть таким же или более открытым чем у перезаписываемого метода.
        //5.
    }
}