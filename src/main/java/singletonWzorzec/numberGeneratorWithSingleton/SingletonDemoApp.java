package singletonWzorzec.numberGeneratorWithSingleton;

import singletonWzorzec.numberGeneratorWithSingleton.InvoiceNbrGeneratorSingleton;

public class SingletonDemoApp {

    public static void main(String[] args) {

        //UWAGA nie tworze obiektu z uzyciem konstruktora, ale zwraca mi go
        //metoda getInstance
        InvoiceNbrGeneratorSingleton generator = InvoiceNbrGeneratorSingleton.getInstance();
        //tworze jakas fakture
        int invoiceNumber = generator.getInvoiceNumber();
        System.out.println(invoiceNumber);

        int invoiceNumber2 = generator.getInvoiceNumber();
        System.out.println(invoiceNumber2);

        String invoiceSignature = generateInvoiceSignature("FKA");
        System.out.println(invoiceSignature);
    }

    public static String generateInvoiceSignature(String signature) {
        InvoiceNbrGeneratorSingleton generator = InvoiceNbrGeneratorSingleton.getInstance();
        return signature + generator.getInvoiceNumber();
    }
}
