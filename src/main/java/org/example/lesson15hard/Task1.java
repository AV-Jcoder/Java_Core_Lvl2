package org.example.lesson15hard;

/**
 * Задание 1
 *
 * Создать класс, описывающий банкомат.
 *
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 *
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 *
 * Сделать методы для добавления денег в банкомат.
 *
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 *
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат будет пытаться рассчитаться 50,
 * далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class Task1 {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        terminal.cashOut(560);
    }
}

class Terminal {

    private int count50;
    private int count20;
    private int count10;

    public Terminal() {
        count50 = 6;
        count20 = 5;
        count10 = 17; // итого: 570
    }

    public boolean cashOut(int sum) {
        int toOut50 = 0;
        int toOut20 = 0;
        int toOut10 = 0;
        if (sum > getTotalCash()) {
            System.out.println("Недостаточно купюр для выдачи.");
            return false;
        }
        while (toOut50 < count50  && sum >= 50) {
            toOut50++;
            sum -= 50;
        }
        while (toOut20 < count20 && sum >=20) {
            toOut20++;
            sum -= 20;
        }
        while (toOut10 < count10 && sum >= 10) {
            toOut10++;
            sum -= 10;
        }
        int calcSum = toOut50 * 50 + toOut20 * 20 + toOut10 * 10;
        if (calcSum < sum) {
            System.out.println("Ошибка, недостаточно купюр для выдачи.");
            return false;
        }
        System.out.printf("Сумма к выдачи: %d$\n", calcSum);
        System.out.printf("Будет выдано купюр: \n50$- %d шт. \n20$ - %d шт. \n10$ - %d шт.",toOut50, toOut20, toOut10);
        count50 -= toOut50;
        count20 -= toOut20;
        count10 -= toOut10;
        return true;
    }

    private int getTotalCash() {
        return count50 * 50 + count20 * 20 + count10 * 10;

    }

}
