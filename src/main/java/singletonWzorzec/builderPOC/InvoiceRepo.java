package singletonWzorzec.builderPOC;

import java.util.List;

public interface InvoiceRepo {

    void addInvoice(Invoice invoice);
    List<Invoice> getInvoices();

}
