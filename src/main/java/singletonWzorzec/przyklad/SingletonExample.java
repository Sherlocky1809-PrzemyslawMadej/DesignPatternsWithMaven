package singletonWzorzec.przyklad;

public class SingletonExample {

//    private static SingletonExample instance = new SingletonExample();
    private static SingletonExample instance;
    private int counter = 0;

    private SingletonExample() {
    }

//    Metoda statyczna, przymiot klasy nie instancji.
    public static SingletonExample getInstance() {
//        return new SingletonExample(); w tym przypadky byloby wiele
//        instancji
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

//    Metoda instancji - logika biznesowa
    public int getCounter() {
        return counter;
    }

//    Metoda instancji - logika biznesowa
    public void count() {
        counter++;
    }
}
