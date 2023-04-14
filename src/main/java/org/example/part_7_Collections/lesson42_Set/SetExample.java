package org.example.part_7_Collections.lesson42_Set;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(StringReversedComparator::compare);
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ddd"));
        System.out.println(set.add("aaa"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("bbb"));

        System.out.println(set);

        set.forEach(System.out::println);
    }
}

class StringReversedComparator {

    public static int compare(String o1, String o2) {
        int len = Math.min(o1.length(), o2.length());
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch1 = o1.charAt(i);
            char ch2 = o2.charAt(i);
            if (ch1 > ch2) {
                result = -1;
                break;
            }
            if (ch1 < ch2) {
                result = 1;
                break;
            }
        }
        return result;
    }
}