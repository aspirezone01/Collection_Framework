package listInterface.ArrayList;

import java.util.ArrayList;

class PrintNumber{

    int num;

    public PrintNumber(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "PrintNumber{" +
                "num=" + num +
                '}';
    }
}

public class Main1 {

    public static void main(String[] args){

      PrintNumber pn = new PrintNumber(10);
      PrintNumber pn1 = new PrintNumber(20);
      PrintNumber pn3 = new PrintNumber(30);
      PrintNumber pn4 = new PrintNumber(40);
      PrintNumber pn5 = new PrintNumber(50);

        ArrayList al = new ArrayList();

        al.add(pn);
        al.add(pn1);
        al.add(pn3);
        al.add(pn4);
        al.add(pn5);

        for(Object pntn : al){
            System.out.println(pntn);
        }

        System.out.println(al);

    }
}
