import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_7
{
    public List<Integer> countCommon  (List<Integer>list1, List<Integer> list2)
    {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();
        List<Integer> listToBeReturned = new ArrayList<>();

        hashSet1.addAll(list1);
        hashSet2.addAll(list2);

        hashSet1.retainAll(hashSet2);

        listToBeReturned.addAll(hashSet1);

        return listToBeReturned;
    }



    public static void main(String[] args)
    {
        Exercise_7 exercise_7 = new Exercise_7();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(42);
        list1.add(5);
        list1.add(61);
        list1.add(10);

        list2.add(1);
        list2.add(2);
        list2.add(15);
        list2.add(17);
        list2.add(52);
        list2.add(11);
        list2.add(3);


        System.out.println(exercise_7.countCommon(list1, list2));

    }
}
