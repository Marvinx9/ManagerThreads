package org.example.monitor;

public class Executable {
    public static void main(String[] args) {
    MonitorExemplo monitor = new MonitorExemplo();

    Thread t1 = new Thread(new NovaTarefa(monitor), "Thread 1");
    Thread t2 = new Thread(new NovaTarefa(monitor), "Thread 2");

    t1.start();
    t2.start();
    }
}
