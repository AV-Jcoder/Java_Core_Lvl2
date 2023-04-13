package org.example.part_7_Collections.lesson40homework.task2;

import java.util.ArrayList;
import java.util.List;

public final class UserUtils {

    private static int idSequence = 0;

    private UserUtils() {}

    public static List<User> getRandomUserList(int countUsers) {
        List<User> list = new ArrayList<>(countUsers);
        for (int i = 0; i < countUsers; i++) {
            list.add(new User(idSequence++, getRandomName(), (int) (Math.random()*30+5)));
        }


        return list;
    }

    private static String getRandomName() {
        String name = null;
        int random = (int) (Math.random()*12);
        switch (random) {
            case 0: return "Anastasia";
            case 1: return "Aleksej";
            case 2: return "Stanislav";
            case 3: return "Bronislav";
            case 4: return "Sergey";
            case 5: return "Angelina";
            case 6: return "Mikhail";
            case 7: return "Nikolaj";
            case 8: return "Nadezda";
            case 9: return "Valentina";
            case 10: return "Fekla";
            case 11: return "Ippolit";
            default: return "Anonymous";
        }
    }
}
