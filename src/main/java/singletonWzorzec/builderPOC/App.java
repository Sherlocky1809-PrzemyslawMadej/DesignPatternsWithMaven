package singletonWzorzec.builderPOC;

public class App {

    public static void main(String[] args) {

//    Invoice2 invoiceWithOnlySender = new Invoice2();
//    invoiceWithOnlySender.setSender("Firma Okno");

        Invoice2 getInvoiceWithOnlySender = new Invoice2("Firma Okno");

        Invoice2 invoiceWithOnlyCustomer = new Invoice2();
        invoiceWithOnlyCustomer.setCustomer("Tesla");

        Invoice2 invoiceWithOnlyNumber = new Invoice2(111);

        Invoice2.Builder builder = new Invoice2.Builder();

        builder.sender("dane sender")
                .customer("pole customer")
                .amount(423423)
                .customer("xxxxx");

        Invoice2 invoice3 = new Invoice2.Builder()
                .sender("Fabryka okien")
                .customer("Jan Kowalski")
                .amount(9999)
                .number(234234)
                .build();

        System.out.println(invoice3);

        Invoice2 invoice4 = new Invoice2.Builder().buildTemplateTransaction()
                .customer("Fabryka okien")
                .build();
    }
}
