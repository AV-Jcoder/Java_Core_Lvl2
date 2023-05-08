package org.example.part_14_java_util_Concurrent.lesson_79_lock;

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
            try {
                lockAccounts();
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            } finally {
                unlockAccounts();
            }
        }
    }

    private void unlockAccounts() {
            accountFrom.getLock().unlock();
            accountTo.getLock().unlock();
    }

    /**
     * Если не удалось захватить обе блокировки, то это
     * означает, что одну блокировку захватил другой поток.
     * Поэтому цикл будет бесконечным, если поток, захвативший
     * блокировку не отпустит ее.
     */
    private void lockAccounts() {
        while(true) {
            boolean lockFromResult = accountFrom.getLock().tryLock();
            boolean lockToResult = accountTo.getLock().tryLock();
            if (lockToResult && lockFromResult) {
                break;
            }
            if (lockFromResult) {
                accountFrom.getLock().unlock();
            }
            if (lockToResult) {
                accountTo.getLock().unlock();
            }
        }
    }
}
