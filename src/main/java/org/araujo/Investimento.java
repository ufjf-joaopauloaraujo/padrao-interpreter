package org.araujo;

public class Investimento {

    public static String formula = "tempo * juros + 1 * montante";

    public static double calcularCapitalJurosSimples(double montante, double juros, double tempo) {
        String expressao;
        expressao = formula.replace("montante", Double.toString(montante));
        expressao = expressao.replace("juros", Double.toString(juros));
        expressao = expressao.replace("tempo", Double.toString(tempo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

