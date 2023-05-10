package org.example.part_14_java_util_Concurrent.lesson_85_semaphore;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashBoxRunner {

    public static void main(String[] args) throws InterruptedException {
        Queue<CashBox> cashBoxes = new LinkedList<>(List.of(new CashBox(), new CashBox()));
        Semaphore semaphore = new Semaphore(2);

        List<Thread> listThread = Stream.of(
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore),
                        new BuyerThread(cashBoxes, semaphore)
                )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : listThread) {
            thread.join();
        }

        System.out.println("Main finish.");
    }
}
