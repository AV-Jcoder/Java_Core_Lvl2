package org.example.part_13_Multi_Threading.lesson_75_dead_lock;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }


    /**
     * Dead lock:
     *
     * thread 1 ---------> monitor1 --------> monitor2 -----> blocked !
     *                                                              -------> Dead Lock!
     * thread 2 ---------> monitor2 --------> monitor1 -----> blocked !
     *
     */
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.takeOff(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}
