package singletonWzorzec.numberGeneratorWithSingleton;

import singletonWzorzec.numberGeneratorWithSingleton.InvoiceNbrGeneratorSingleton;
import singletonWzorzec.numberGeneratorWithSingleton.InvoiceSignatureRepo;

public class SignatureRepoDemo {

    public static void main(String[] args) {

        InvoiceSignatureRepo repo = new InvoiceSignatureRepo();
        String signature = repo.addSignature("GHA");
        System.out.println(signature);

        String signature2 = repo.addSignature("GHA");
        System.out.println(signature2);

        InvoiceNbrGeneratorSingleton generator = InvoiceNbrGeneratorSingleton.getInstance();
        System.out.println(generator.getInvoiceNumber());
    }
}
