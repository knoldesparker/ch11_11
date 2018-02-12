import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer elements[]={1,4,7,9};
        Integer elements2[]={2,4,5,6,7};
        Set<Integer> list1 = new HashSet<>(Arrays.asList(elements));
        Set<Integer> list2 = new HashSet<>(Arrays.asList(elements2));

        symmetricSetDifference(list1,list2);

    }
    public static void symmetricSetDifference(Set<Integer> set1, Set<Integer> set2){
       //Stolen from the internet, was going insane on how to make this. Comments will explain how it is done.
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        System.out.println(newSet);
        Set<Integer> temp = new HashSet<>(set1);
        System.out.println(temp);
        temp.retainAll(set2);
        System.out.println(temp);
        newSet.retainAll(temp);
        System.out.println(newSet);

    }

}
