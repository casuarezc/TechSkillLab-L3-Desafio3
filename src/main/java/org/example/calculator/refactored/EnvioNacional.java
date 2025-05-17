package org.example.calculator.refactored;

public class EnvioNacional implements ImpEnvio{

    private static final double ENVIO_RATE = 0.20;
    @Override
    public double calcularEnv(double amount) {
        return amount * ENVIO_RATE;
    }
}
