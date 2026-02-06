package LinkedList;

import java.util.LinkedList;

class Example{

    String name;
    int age;

    public Example(String name, int age){

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main1 {

    public static void main(String[] args){

        Example el = new Example("Sansui", 20);
        Example el1 = new Example("Kim", 25);
        Example el2 = new Example("Dekisuki", 30);
        Example el3 = new Example("Suzuki", 35);

        LinkedList ll = new LinkedList();

        ll.add(el);
        ll.add(el1);
        ll.add(el2);
        ll.add(el3);


        System.out.println("Before Removing first : ");
        System.out.println();

        for(Object o :ll){
            System.out.println(o);
        }

          ll.removeFirst();
          ll.removeLast();

        System.out.println();
        System.out.println("After removing first :");
        System.out.println();

        ll.addFirst("first Positon" +  10);
        ll.addLast("last Position" + 20);

        System.out.println(ll);

        for(int i = 0; i < ll.size(); i++){
            System.out.println(ll.get(i));
        }

        for(Object o :ll){
            System.out.println(o);
        }
    }
}
