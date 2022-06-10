package singletonWzorzec.numberGeneratorWithSingleton;

import singletonWzorzec.numberGeneratorWithSingleton.InvoiceNbrGeneratorSingleton;

import java.util.ArrayList;
import java.util.List;

public class InvoiceSignatureRepo {

    private List<String> signatures = new ArrayList<>();

    public String addSignature(String signature) {
        InvoiceNbrGeneratorSingleton generator = InvoiceNbrGeneratorSingleton.getInstance();
        String invoiceSignature = signature + generator.getInvoiceNumber();
        signatures.add(invoiceSignature);
        return invoiceSignature;
    }
}
