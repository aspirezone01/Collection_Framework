package LinkedList;

import java.util.LinkedList;

class Mobile{

    String name;
    int androidVersion;

   public Mobile(String name, int androidVersion){
       this.name = name;
       this.androidVersion = androidVersion;
   }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", androidVersion=" + androidVersion +
                '}';
    }
}

public class Main2 {

    public static void main(String[] args){

        Mobile m = new Mobile("VIRTUE", 15);
        Mobile m1 = new Mobile("SAMSUNG", 16);
        Mobile m2 = new Mobile("VIRTUE", 15);

        LinkedList ll = new LinkedList();

        ll.add(m);
        ll.add(m1);
        ll.add(m2);
        ll.add(null);

        for(int i = 0; i < ll.size(); i++){
            Object obj = ll.get(i);

            if(ll == null){
                System.out.println("Print NUll");

            }else{
                System.out.println("Index " + i + " -> " +  obj);
            }
        }
    }
}
