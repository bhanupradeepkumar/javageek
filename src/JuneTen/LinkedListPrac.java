package JuneTen;

import java.util.LinkedList;

public class LinkedListPrac {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        System.out.println(list1.contains(30));
        list1.add(1,15);
        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1);
        list1.remove();
        System.out.println(list1.element());
        System.out.println(list1.lastIndexOf(20));

//add offer both are same both add at end
        //remove poll both  both remove from front
        //element peek both tell first element
        //differnce is second one will returns null or boolean

        //get and set index are slow in linked list
        //not cache friendly process cant pre fectch items


    }
}
