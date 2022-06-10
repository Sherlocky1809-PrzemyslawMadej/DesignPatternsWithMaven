package singletonWzorzec.builderPOC;

public class BuilderDemo {

    public static void main(String[] args) {

        Invoice invoice = new Invoice.Builder()
                .customer("Rambo")
                .sender("Super firma")
                .description("Dokladny opis")
                .number(12345)
                .build();

        Invoice invoice1 = new Invoice.Builder(123123)
                .customer("Terminator")
                .build();

        System.out.println(invoice1);

        System.out.println(invoice);

        StringBuilder stringBuilder = new StringBuilder()
                .append("sddadsad")
                .append(89933)
                .append("terte");
    }
}
