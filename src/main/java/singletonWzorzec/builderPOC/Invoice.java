package singletonWzorzec.builderPOC;

public class Invoice {

    private String sender;
    private String customer;
    private String description;
    private int amount;
    private int number;

    private Invoice() {
    }

    public Invoice(String sender, String customer, String description, int amount, int number) {
        this.sender = sender;
        this.customer = customer;
        this.description = description;
        this.amount = amount;
        this.number = number;
    }

    public Invoice(String sender, String customer, String description, int amount) {
        this.sender = sender;
        this.customer = customer;
        this.description = description;
        this.amount = amount;
    }

    public Invoice(Invoice invoice, int newInvoiceNumber) {
        this.sender = invoice.getSender();
        this.customer = invoice.getCustomer();
        this.description = invoice.getDescription();
        this.amount = invoice.getAmount();
        this.number = newInvoiceNumber;
    }


    public String getSender() {
        return sender;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "sender='" + sender + '\'' + '\n' +
                ", customer='" + customer + '\'' + '\n' +
                ", description='" + description + '\'' + '\n' +
                ", amount=" + amount + '\n' +
                ", number=" + number +
                '}' + '\n';
    }

    public static class Builder {

        private String sender;
        private String customer;
        private String description;
        private int amount;
        private int number;

        public Builder(int number) {
            this.number = number;
        }

        public Builder() {
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder customer(String customer) {
            this.customer = customer;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Invoice build() {

            Invoice invoice = new Invoice();

            invoice.sender = this.sender; // invoice."pole klasy Invoice" = this(obiekt invoice)."pole klasy Builder.
            invoice.customer = this.customer;
            invoice.description = this.description;
            invoice.amount = this.amount;
            invoice.number = this.number;

            return invoice;
        }
    }
}
