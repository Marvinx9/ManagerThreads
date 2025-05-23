package org.example.monitor;

public class NovaTarefa implements Runnable {
    private MonitorExemplo monitor;

    public NovaTarefa (MonitorExemplo monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run () {
        monitor.incrementar();
    }
}
