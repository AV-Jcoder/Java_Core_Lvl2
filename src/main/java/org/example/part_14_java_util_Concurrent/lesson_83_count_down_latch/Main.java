package org.example.part_14_java_util_Concurrent.lesson_83_count_down_latch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(RocketDetail.values().length);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Rocket(latch));

        Arrays.stream(RocketDetail.values()).map(detail -> new RocketDetailCreator(latch, detail))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

    }
}
