package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorTest {

    private ImpEnvio impEnvio;
    private InvoiceEnvioRefac invoiceEnvio;
    double amount;

    @BeforeEach
    void setUp() {
        impEnvio = Mockito.mock(ImpEnvio.class);
        invoiceEnvio = new InvoiceEnvioRefac(impEnvio);
        amount = 100.0;
    }

    @Test
    void calcularEnvioInternacional() {
        Mockito.when(impEnvio.calcularEnv(amount)).thenReturn(30.0);
        double total = invoiceEnvio.calcularTotal(amount);
        assertEquals(130.0, total);
        Mockito.verify(impEnvio, Mockito.times(1))
                .calcularEnv(amount);
    }

    @Test
    void calcularEnvioNacional() {
        Mockito.when(impEnvio.calcularEnv(amount)).thenReturn(20.0);
        double total = invoiceEnvio.calcularTotal(amount);
        assertEquals(120.0, total);
        Mockito.verify(impEnvio, Mockito.times(1))
                .calcularEnv(amount);
    }

}