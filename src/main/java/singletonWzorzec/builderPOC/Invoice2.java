package singletonWzorzec.builderPOC;

public class Invoice2 {

    private String sender;
    private String customer;
    private String description;
    private int amount;
    private int number;

    public Invoice2() {
    }

    public Invoice2(String sender) {
        this.sender = sender;
    }

    public Invoice2(String sender, String customer) {
        this.sender = sender;
        this.customer = customer;
    }

    public Invoice2(int number) {
        this.number = number;
    }

    public Invoice2(String sender, String customer, String description, int amount, int number) {
        this.sender = sender;
        this.customer = customer;
        this.description = description;
        this.amount = amount;
        this.number = number;
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

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNumber(int number) {
        this.number = number;
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
//    Jaka bedzie odpowiedzialnosc tej klasy
//    Tworzenie obiektow klasy Invoice

    public static class Builder {

        private String sender;
        private String customer;
        private String description;
        private int amount;
        private int number;

//      Metoda ktora zwraca referencje do obiektu, na ktorym zostala wywolana
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

        public Invoice2 build() {

            Invoice2 invoice2 = new Invoice2();

            invoice2.amount = this.amount;
            invoice2.customer = this.customer;
            invoice2.description = this.description;
            invoice2.sender = this.sender;
            invoice2.number = this.number;

            return invoice2;
        }

        public Builder buildTemplateTransaction() {
            Builder template = new Builder();// builder z szablonem konfguracji
            template.customer("default value")
                    .amount(100)
                    .sender("default sender");
            return template;
        }
    }
}
