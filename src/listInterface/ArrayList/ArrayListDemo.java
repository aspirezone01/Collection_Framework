package listInterface.ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        List list = Arrays.asList(1, 2, 4, 6, 7, "Raju", "Kaju");
        System.out.println(list);

        al.add(1);
        al.add("Raju");
        al.add("kaju");
        al.add(4);
        al.add('C');
        al.add(7.3);

        System.out.println(al.contains("Raju"));   // 1

        System.out.println(al);
        System.out.println(al.isEmpty());

        al.remove(5);

        System.out.println(al);

        al.clear();
        System.out.println(al);

        System.out.println(al.isEmpty());

//        for(int i = 0; i < al.size(); i++) {
//            System.out.print(al.get(i) + " ");
//        }
    }
}
