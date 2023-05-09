import java.util.HashSet;
import java.util.Iterator;

//set is a data structure only unique numbers are set

//time complexity ->
//insert->o(1)
//search->o(1)
//delete->o(1)

public class hashset_intro {

    public static void main(String[] args) {
        // creating

        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // search

        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contains 6");
        }

        // delete

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("we deleted 1");
        }

        // print size
        System.out.println(set.size());

        System.out.println(set);



        //iterator
    Iterator it=set.iterator();
    }
}