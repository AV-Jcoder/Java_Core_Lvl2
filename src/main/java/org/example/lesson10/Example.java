package org.example.lesson10;

/**
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами.
 * Создать метод для получения полного количесва секунд в объекте.
 * Создать два конструктора: первый принимает общее количество секунд,
 * второй часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 */
/**
 1. Находим секунды. Берем общее количество секунд пусть будет 3750 и делим по модулю на 60, так как в минуте только 60 секунд. т.е:
 this.seconds = totalSeconds % 60;
 Элементарно Ватсон, не правда ли?
 2. Находим минуты. Переводим общее количество секунд в минуты -> 3750 / 60 , получаем общее количество минут, но, т.к.
 в часе их всего 60, то нужно еще и разделить по модулю на 60. т.е.
 this.minutes = (totalSeconds / 60) % 60;
 Пока что всё элементарно.
 3. находим часы. Аналогично, переводим общее количество секунд в часы 3750 / 3600 <- т.к. в одном часе 3600 секунд.
 Можно еще разделить по модулю на 24, т.к. в сутках 24 часа, получаем:
 this.hours = (totalSeconds / 3600) % 24;
 4. Аналогично можно продолжжать искать количество дней
 this.days = (tatalSeconds/3600/24) % 30 (30 или 31 или 28 или 29 если год високосный)
 Смысл в том, что сперва мы переводим в нужную нам велечину, а затем делим по модулю в соответствии с системой исчисления.
 */
public class Example {

    public static void main(String[] args) {
        Timer timer = createTimer();
        timer.printTime();
        System.out.println(timer.getTotalSeconds());

        Timer timer2 = new Timer(30,2,1);
        System.out.println(timer2.getTotalSeconds());

        Timer timer3 = timer.sumTwoTimers(timer2);
        timer3.printTime();
    }

    private static Timer createTimer() {
        Timer timer = new Timer(3750);
        return timer;
    }
}

class Timer {

    int seconds;
    int minutes;
    int hours;

    Timer(int secondsTotal) {
        seconds = secondsTotal % 60;
        minutes = (secondsTotal / 60) % 60;
        hours = (secondsTotal / 3600) % 24;
    }

    Timer(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    void printTime() {
        System.out.printf("%d:%d:%d\n",hours,minutes,seconds);
    }

    int getTotalSeconds() {
        int totalSeconds = seconds;
        totalSeconds += minutes * 60;
        totalSeconds += hours * 3600;
        return totalSeconds;
    }

    Timer sumTwoTimers(Timer timer) {
        return new Timer(this.getTotalSeconds() + timer.getTotalSeconds());
    }
}

