package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulacaoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Simulacao simulacao = new Simulacao();
        simulacao.setMontante(1000.0);
        simulacao.setJuros(1.0);
        simulacao.setTempo(9.0);

        assertEquals(10000.0, simulacao.calcularCapitalJurosSimples());
    }

}