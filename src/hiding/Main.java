package hiding;
import overriddingandoverloading.SubClass;
import overriddingandoverloading.SuperClass;

public class Main {
    public static void main(String[] args) {
        SuperClass.staticMethod();
        new SuperClass().staticMethod();

        SubClass.staticMethod();
        new SubClass().staticMethod();

        SuperClass ss = new SubClass();
        ss.staticMethod(); // отсылает к родительскому классу
        // потому что static (статичный) метод принадлежит классу, но
        // не экземпляру (например Scanner scanner = new Scanner(System.in);
        // здесь экземпляр класса это scanner)
        //
    }
}
