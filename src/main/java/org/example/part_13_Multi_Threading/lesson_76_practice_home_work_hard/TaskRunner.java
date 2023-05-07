package org.example.part_13_Multi_Threading.lesson_76_practice_home_work_hard;

/**
 * Существует две постоянно соревнующиеся расы: маги огня и маги воздуха.
 * Их задача - как можно быстрее набрать 500 красных и 500 белых кристаллов.
 *
 * Кристаллы растут на другой планете с рандомной скоростью от 2 до 5 рандомных кристаллов в сутки
 * (может быть 1 красный и 2 белых, а может и вовсе все 4 кристалла красного цвета).
 *
 * Маги огня и маги воздуха отправляют раз в сутки по ракете за добычей кристаллов.
 * Каждая ракета может погрузить на борт от 2 до 5 рандомных кристаллов.
 * Если кристаллов нет - ракета улетает пустой.
 *
 * Написать программу, которая симулирует процесс заполнения кристаллов у магов огня и воздуха.
 * Для симуляции принять, что и кристаллы создаются, и ракеты прилетают в одно и то же время - полночь.
 *
 * Соревнование заканчивается, когда какая-то раса соберет необходимые кристаллы.
 */
public class TaskRunner {

    public static void main(String[] args) throws InterruptedException {
        CrystalPlanet planet = new CrystalPlanet();

        Mage mage1 = new Mage("Black", planet);
        Mage mage2 = new Mage("White", planet);

        planet.start();
        mage1.start();
        mage2.start();

        planet.join();
        mage1.join();
        mage2.join();




    }
}

