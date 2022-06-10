package singletonWzorzec.numberGeneratorWithSingleton;

// Singleton to wzorzec ktory zapewnia jedna instancje obiektu
public class InvoiceNbrGeneratorSingleton {

    //    private static InvoiceNbrGeneratorSingleton instance = new InvoiceNbrGeneratorSingleton();
    private static InvoiceNbrGeneratorSingleton instance;
    //logika biznesowa
    private int invoiceNumber = 0;
    //cel konstruktora prywatnego, brak mozliwosci utworzenia obiektu poza klasa
    private InvoiceNbrGeneratorSingleton() {
    }
    //tworzymy metode publiczna statyczna, ktora bedzie zwracala nam obiekt singleton
    //zwyczajowa metoda nazywa sie getInstance
    public static InvoiceNbrGeneratorSingleton getInstance() {
        //lazy initialization
        if (instance == null) {
            instance = new InvoiceNbrGeneratorSingleton();
        }
        return instance;
    }
    //logika biznesowa
    public int getInvoiceNumber() {
        return ++invoiceNumber;
    }

}
