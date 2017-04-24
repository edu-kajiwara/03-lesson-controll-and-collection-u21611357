import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CollectionSample{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        for (String arg : args) {
            list.add(arg);
            set.add(arg);
        }
        System.out.print("ArrayList :");
        for (String str : list) {
           System.out.print(str);
        }
        System.out.println();
        System.out.print("HashSet :");
        for (String str : set) {
           System.out.print(str);
        }
    }
}