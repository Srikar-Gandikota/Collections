import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LaunchItr {
    public static void main(String[] args) {
        List<List<String>> al=new ArrayList<>();
        al.add(Arrays.asList("44","55","66"));
        al.add(Arrays.asList("4","5","6","7"));

        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
