package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEnvioTest {

    ImpEnvio impEnvio;
    double amount;

    @BeforeEach
    void setUp() {
        amount = 100.0;
    }

    @Test
    void calcularEnvInternacional() {
        impEnvio = new EnvioInternacional() {
        };
        assertEquals(30.0, impEnvio.calcularEnv(amount));
    }

    @Test
    void calcularEnvNacional() {
        impEnvio = new EnvioNacional();
        assertEquals(20.0, impEnvio.calcularEnv(amount));
    }

}