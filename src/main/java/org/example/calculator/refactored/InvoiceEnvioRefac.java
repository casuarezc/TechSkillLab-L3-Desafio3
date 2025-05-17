package org.example.calculator.refactored;

public class InvoiceEnvioRefac {
    private ImpEnvio envio;

    public InvoiceEnvioRefac(ImpEnvio envio) {
        this.envio = envio;
    }

    public double calcularTotal(double amount) {
        return amount + envio.calcularEnv(amount);
    }
}
