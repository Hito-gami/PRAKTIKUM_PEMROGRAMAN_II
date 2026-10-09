package MODULE02.Problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 7000, 0.4, 40);
        Fruit mango = new Fruit("mangga", 3500, 0.2, 15);
        Fruit avocado = new Fruit("alpukat", 10000, 0.25, 12);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}