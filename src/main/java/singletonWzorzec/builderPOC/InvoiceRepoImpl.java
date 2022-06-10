package singletonWzorzec.builderPOC;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepoImpl implements InvoiceRepo {

    private List<Invoice> invoices = new ArrayList<>();

    @Override
    public void addInvoice(Invoice invoice) {
//        Zalozenie biznesowe - nadajemy numer faktury w repo.
        Invoice newInvoice = new Invoice(invoice,
                NumberGeneratorSingleton.getInstance().getNextInvoiceNumber());
        invoices.add(newInvoice);
    }

    @Override
    public List<Invoice> getInvoices() {
        return new ArrayList<>(invoices);
    }
}
