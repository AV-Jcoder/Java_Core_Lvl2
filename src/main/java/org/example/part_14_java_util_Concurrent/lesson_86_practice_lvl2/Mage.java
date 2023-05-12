package org.example.part_14_java_util_Concurrent.lesson_86_practice_lvl2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Mage extends Thread {

    private String name;
    private Map<Crystal, Integer> map;
    private CrystalPlanet planet;

    public Mage(String name, CrystalPlanet planet) {
        this.name = name;
        map = new HashMap<>();
        this.planet = planet;
    }

    public void sendRocket() {
        List<Crystal> list = planet.collectCrystal();
        for (Crystal crystal : list) {
            map.put(crystal, map.getOrDefault(crystal, 0) + 1);
        }
        System.out.println("Mage " + name + " collect: " + list);
    }

    public boolean checkWinner() {
        if (map.containsKey(Crystal.RED) && map.containsKey(Crystal.WHITE)) {
            if (map.get(Crystal.RED) >= 50 && map.get(Crystal.WHITE) >= 50) {
                System.out.println("Mage " + name + " collect 500 each color!");
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {

                    sendRocket();

                if (checkWinner()) {
                    interrupt();
                }

                TimeUnit.MILLISECONDS.sleep(200);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
