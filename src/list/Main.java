package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Employee{

    int id;
    String name;
    int age;
    double salary;


  public Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Main {

    public static void main(String[] args){

         Employee e = new Employee(01, "Imdad", 25, 200000);
         Employee e1 = new Employee(02,"Firdousi", 30, 300000);
         Employee e2 = new Employee(03, "Saud", 35, 400000);
         Employee e3 = new Employee(04, "Tarique", 40, 500000);




        List list = Arrays.asList(e1, e2, e3, e);
        System.out.println(list);

        LinkedList ll = new LinkedList();

        ll.add(e);
        ll.add(e1);
        ll.add(e3);

        System.out.println(ll);

        ArrayList al = new ArrayList();

        al.add(e);
        al.add(e1);
        al.add(e2);
        al.add(e3);

        for(Object emp : al){
            System.out.println(emp);
        }

        int[] arr = {5,6,5,7};

        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}
