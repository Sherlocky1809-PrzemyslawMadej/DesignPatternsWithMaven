package singletonWzorzec.builderPOC;

public class RepoApp {

    public static void main(String[] args) {

        InvoiceRepo repo = new InvoiceRepoImpl();

        Invoice invoice1 = new Invoice("Firma Krzak", "ZlotyKlient",
                "super produkt", 33);
        Invoice invoice2 = new Invoice("Firma Krzak", "SrebrnyKlient",
                "zelazko", 70);

        repo.addInvoice(invoice1);
        repo.addInvoice(invoice2);

        System.out.println(repo.getInvoices());

        repo.getInvoices().clear();

        System.out.println(repo.getInvoices());



    }
}
