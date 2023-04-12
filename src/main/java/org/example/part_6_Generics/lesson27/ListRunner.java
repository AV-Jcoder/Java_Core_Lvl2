package org.example.part_6_Generics.lesson27;

import org.example.part_5_OOPrinciple.lesson24.Archer;

public class ListRunner {

    public static void main(String[] args) {
        GenericList<String> genericList = new GenericList<>(10);
        genericList.add("String1");
        genericList.add("String2");
        genericList.add("String3");
//        genericList.add(25);

        for (int i = 0; i < genericList.getSize(); i++) {
            System.out.println(genericList.get(i));
        }
    }

    public static void main1(String[] args) {
        List list = new List(10);
        list.add("String1");
        list.add(25);
        list.add(new Archer("Robin Hood"));
        list.add("String2");
        list.add("String3");

        Object element = list.get(1);
        System.out.println(element);

        String string1 = (String) element;
        System.out.println(string1);
    }
}
