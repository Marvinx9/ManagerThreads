package org.example.semafaro;

import java.util.concurrent.Semaphore;

public class Tarefa implements Runnable {
    private Semaphore semafaro;

    public Tarefa (Semaphore semafaro) {
        this.semafaro = semafaro;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " tentando acessar o recurso...");
            semafaro.acquire();

            System.out.println(Thread.currentThread().getName() + " acessou o recurso.");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " liberou o recurso.");
            semafaro.release();
        } catch (InterruptedException e) {
            System.out.println("Error -> " + e.getMessage());;
        }
    }
}