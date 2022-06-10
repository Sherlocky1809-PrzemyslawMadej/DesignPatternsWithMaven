package singletonWzorzec.builderPOC;

public class NumberGeneratorSingleton {

//    pole statyczne przechowujace instancje
    private static NumberGeneratorSingleton instance = new NumberGeneratorSingleton();

    private int sequence;

//    prywatny konstruktor
    private NumberGeneratorSingleton() {
    }

    public static NumberGeneratorSingleton getInstance() {
        return instance;
    }

//    Logika biznesowa
    public int getNextInvoiceNumber() {
        return ++sequence;
    }

}
