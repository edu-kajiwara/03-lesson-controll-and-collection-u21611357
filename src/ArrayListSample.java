import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ArrayListSample{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        for (String arg : args) {
            list.add(arg);
            set.add(arg);
        }
        System.out.println("ArrayList :" + list);
        System.out.println("HashSet :" + set);
    }
}