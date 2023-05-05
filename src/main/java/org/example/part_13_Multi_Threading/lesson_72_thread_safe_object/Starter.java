package org.example.part_13_Multi_Threading.lesson_72_thread_safe_object;

import java.util.ArrayList;
import java.util.List;

public class Starter {

    public static void main(String[] args) {
        Example example = new Example(new ArrayList<Integer>());
        List<Integer> list = example.getList();
        list.add(56);

        System.out.println(example.getList());
    }
}
