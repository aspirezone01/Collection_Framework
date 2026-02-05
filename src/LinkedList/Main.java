package LinkedList;

import java.util.LinkedList;

class car{

    String nam;
    int year;
    String colour;

public car(String nam, int year,String colour){
    this.nam = nam;
    this.year = year;
    this.colour = colour;
}

    @Override
    public String toString() {
        return "car{" +
                "nam='" + nam + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args){

        car c = new car("Volvo", 2026, "white");
        car c1 = new car("Toyota", 2025, "White");
        car c2 = new car("BMW", 2024, "Olive Green");

        LinkedList ll = new LinkedList();

        ll.add(c);
        ll.add(c1);
        ll.add(c2);

        for(int i = 0; i < ll.size(); i++ ) {
            System.out.println(ll.get(i));
        }
    }
}
