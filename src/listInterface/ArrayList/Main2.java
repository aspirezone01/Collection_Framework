package listInterface.ArrayList;

import java.util.ArrayList;

class PrintElement{

    int id;
    String nickname;

    public PrintElement(String nickname, int id){
        this.nickname = nickname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "PrintElement{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

public class Main2 {

    public static void main(String[] args){

        PrintElement pl = new PrintElement("RAmoo", 01);
        PrintElement pl1 = new PrintElement("Sunil", 02);
        PrintElement pl2 = new PrintElement("Kuntu", 03);
        PrintElement pl3 = new PrintElement("Suntu", 04);

        ArrayList al = new ArrayList();

        al.add(pl);
        al.add(pl1);
        al.add(pl2);
        al.add(pl3);

        System.out.println("Before removal : " + al.size());

        System.out.println(al.contains(pl3));
        al.size();
        al.remove(0);
        al.remove(pl1);

        System.out.println("After removal : " + al.size());

        for(int i = 0; i < al.size(); i++){
            System.out.println("Index" + i + " -> " + al.get(i));
        //    System.out.println(i);

        }
    }
}
