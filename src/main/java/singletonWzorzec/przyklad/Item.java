package singletonWzorzec.przyklad;

public class Item {
//    Odwoluje sie do Singletona i wywoluje metode count()
    public Item() {
        SingletonExample instance = SingletonExample.getInstance();
        instance.count();
        System.out.println("Singleton: " + instance);
    }

    @Override
    public String toString() {
        return "Item{}";
    }
}
