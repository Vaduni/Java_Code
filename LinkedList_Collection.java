package Java_Code;

import java.util.LinkedList;

public class LinkedList_Collection {
    public static void main(String[] args) {    
    LinkedList<String>list=new LinkedList<>();

    list.addFirst("is");
    list.addFirst("This");
    System.out.println(list);

    list.addLast("a");
    list.addLast("LinkedList");
    System.out.println(list);

    for(int i=0;i<list.size();i++){
        System.out.println(list+"->");
    }
    System.out.println("null");

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    list.remove(1);
    System.out.println(list);

    System.out.println(list.size());

    System.out.println(list.contains("is"));
    }
}
