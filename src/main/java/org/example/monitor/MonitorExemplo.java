package org.example.monitor;

public class MonitorExemplo {
    private int contador = 0;

    public synchronized void incrementar () {
        contador++;
        System.out.println("Contador incrementado para: " + contador);
    }
}
