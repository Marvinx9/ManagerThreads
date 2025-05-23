package org.example.semafaro;

import java.util.concurrent.Semaphore;

public class Executable {
    public static Semaphore semaforo = new Semaphore(1);

    public static void main(String[] args) {
        Thread t1 = new Thread(new Tarefa(semaforo), "Thread 1");
        Thread t2 = new Thread(new Tarefa(semaforo), "Thread 2");

        t1.start();
        t2.start();
    }
}
