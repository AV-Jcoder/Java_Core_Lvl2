package org.example.part_14_java_util_Concurrent.lesson_80_thread_pool_future_callable;

import java.util.Optional;
import java.util.Queue;

public class PoolThread extends Thread {

    private final Queue<Runnable> tasks;

    public PoolThread(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }
    @Override
    public void run() {
        while (true) {
            Optional<Runnable> task = Optional.empty();
            synchronized (task) {
                if (!tasks.isEmpty()) {
                    task = Optional.of(tasks.remove());
                }
            }
            task.ifPresent(Runnable::run);
        }
    }
}
