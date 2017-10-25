package ru.n1.t9;

public class BlockedMethodCaller implements Runnable{
    private final BlockedSetExample ref;
    private final int i;

    public BlockedMethodCaller(BlockedSetExample ref, int i) {
        this.ref = ref;
        this.i = i;
    }


    @Override
    public void run() {
        try {
            ref.f(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
