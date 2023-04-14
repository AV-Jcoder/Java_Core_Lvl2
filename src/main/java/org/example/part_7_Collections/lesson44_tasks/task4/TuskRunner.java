package org.example.part_7_Collections.lesson44_tasks.task4;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки:
 * ax^6 + bx^4 + cx^3 + dx + 8
 */
public class TuskRunner {

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = Map.of(
                0,5,
                1,3,
                3,2,
                5,4,
                6,7
        );

        Map<Integer, Integer> map2 = Map.of(
                0,5,
                3,4,
                5,5,
                6,1
        );

        // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
//        Map<Integer, Integer> resultMap = mergeTwoMap(map1, map2);
        Map<Integer, Integer> resultMap = mergeJava8TwoMap(map1, map2);
        String result = correctFormatLine(resultMap);
        System.out.println(result);

    }

    /**
     * Как не нужно форматировать строку.
     * @param resultMap
     * @return
     */
    private static String formatLine(Map<Integer, Integer> resultMap) {
        StringBuilder s = new StringBuilder();
        Set<Integer> set = new TreeSet<>(resultMap.keySet());
        for (Integer integer : set) {
            s.insert(0, integer);
            s.insert(0, "x^");
            s.insert(0, resultMap.get(integer));
            s.insert(0, ' ');
            s.insert(0, '+');
            s.insert(0, ' ');
        }
        return s.toString();
    }

    /**
     * Как можно отформатировать строку.
     * @param resultMap
     * @return
     */
    private static String correctFormatLine(Map<Integer, Integer> resultMap) {
        StringBuilder s = new StringBuilder();
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.putAll(resultMap);
        List<String> list = new ArrayList<>(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            String line = entry.getKey() == 0 ? entry.getValue().toString() : entry.getValue() + "x^" + entry.getKey();
            list.add(line);
        }
        return String.join(" + ", list); // class StringJoiner - крутая штука
    }

    private static Map<Integer, Integer> mergeTwoMap(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Map<Integer, Integer> resultMap = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer sumValue = entry.getValue() + resultMap.getOrDefault(entry.getKey(), 0);
            resultMap.put(entry.getKey(), sumValue);
        }
        return resultMap;
    }

    private static Map<Integer, Integer> mergeJava8TwoMap(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Map<Integer, Integer> resultMap = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            resultMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return resultMap;
    }
}
