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
    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> setIntersect = new HashSet<>(set1);
        setIntersect.removeAll(set2);
        set2.removeAll(set1);
        setIntersect.addAll(set2);

        System.out.println(setIntersect);
        return setIntersect;



    }

}
