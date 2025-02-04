package Java_Code;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // adding elements to the hashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // printing the hashSet
        System.out.println("HashSet is : " + set);

        // checking size
        System.out.println("Size is : " + set.size());

        // searching if the element is present or not
        System.out.println("Is 3 present: " + set.contains(3));
        System.out.println(("Is 6 present : " + set.contains(6)));

        // deletion
        set.remove(3);
        System.out.println("After deletion : " + set);

        // isEmpty
        System.out.println("Is empty : " + set.isEmpty());

        // iterating over the hashSet
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
