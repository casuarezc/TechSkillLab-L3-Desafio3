package org.example.calculator.refactored;

public class EnvioInternacional implements ImpEnvio{

    private static final double ENVIO_RATE = 0.30;
    @Override
    public double calcularEnv(double amount) {
        return amount * ENVIO_RATE;
    }
}
