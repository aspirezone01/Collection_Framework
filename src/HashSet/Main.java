package HashSet;

import java.util.HashSet;

class Example{

    String name;
    int age;

    public Example(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args){
        Example el = new Example("Sony", 20);
        Example el1 = new Example("Lenovo", 25);
        Example el2 = new Example("HP",30);

        HashSet hs = new HashSet();

        hs.add(el);
        hs.add(el1);
        hs.add(el2);
    }
}
