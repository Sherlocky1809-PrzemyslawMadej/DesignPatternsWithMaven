package singletonWzorzec.przyklad;

public class SingletonDemo {

    public static void main(String[] args) {

//        SingletonExample s = new SingletonExample();
//        SingletonExample s2 = new SingletonExample();

        SingletonExample example = SingletonExample.getInstance();
        example.count();
        example.count();
        example.count();
        System.out.println(example.getCounter());
        System.out.println(new Item());
        System.out.println(new Item());
        System.out.println(new Item());
        System.out.println(example.getCounter());
    }
}
