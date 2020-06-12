package com.xiaozh.Thread.TestCallable;


import java.util.concurrent.*;

public class CallableFutureTest implements Callable {
    private int i;

    @Override
    public Integer call() throws Exception {
        for (i=0; i<2; i++){
            System.out.println("实现Callable接口创建线程："+ Thread.currentThread().getName()+" : " + i);
        }
        return i;
    }

    /**
     * 1. 创建Callable接口的实现类，并实现call()方法，该call()方法即为线程执行体，且该call()方法有返回值，再创建Callable实现类的实例
     * **/
    public static void main(String[] args) {
        System.out.println("main线程： " + Thread.currentThread().getName());

        long begin = System.currentTimeMillis();

        // 创建一个根据需要自动创建新线程的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        CallableFutureTest callableFutureTest1 = new CallableFutureTest();
        CallableFutureTest callableFutureTest2 = new CallableFutureTest();

        FutureTask futureTask1 = new FutureTask<>(callableFutureTest1);
        FutureTask futureTask2 = new FutureTask<>(callableFutureTest2);

        executorService.submit(futureTask1);  // 向Executor提交一个Callable任务，并返回一个Future；
        executorService.submit(futureTask2);

        try {
            //get()获取任务执行的结果，如果任务还没完成则会阻塞等待直到任务执行完成
            System.out.println("futureTask1: "+futureTask1.get() +" -futureTask2: " + futureTask2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println("executor pool: " + executorService.isShutdown());
        System.out.println("time: "+ (System.currentTimeMillis() - begin));

    }
}
