package Easy;

import java.util.*;

public class second {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("2");
        list.add("1");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        Set<String> set=new LinkedHashSet<>(list);

        System.out.println(set);
    }

}
