package org.example.part_7_Collections.lesson40practice.task1;

import java.util.List;
import java.util.ListIterator;

public final class MarkLengthUtil {

    private MarkLengthUtil() {
    }

    public static void markLength4(List<String> list) {
        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String line = iter.next();
            if (line.length() == 4) {
                iter.set("****"); // set at last return
                iter.add(line);   // add to cursor
            }
        }
    }
}
