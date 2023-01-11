package org.araujo;

public class Simulacao {
    private double montante;
    private double juros;
    private double tempo;

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double calcularCapitalJurosSimples() {
        return Investimento.calcularCapitalJurosSimples(this.montante, this.juros, this.tempo);
    }
}
