package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaTest {

    ImpEstrategia impEstrategia;
    double ammount;

    @BeforeEach
    void setUp() {
        ammount = 100.0;
    }

    @Test
    void calcularImpuestoIVA_debeCalcularEl15PorCiento() {
        impEstrategia = new ImpuestoIVA();
        assertEquals(15.0, impEstrategia.calcular(ammount));
    }

    @Test
    void calcularImpuestoIVA_debeCalcularEl10PorCiento() {
        impEstrategia = new ImpuestoExtra();
        assertEquals(10.0, impEstrategia.calcular(ammount));
    }
}