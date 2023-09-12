
import java.util.List;

public class Estatistica {

    public static double media(List<Double> notas) {
        double soma = 0.0;

        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public static double desvioPadrao(List<Double> notas) {
        double media = media(notas);
        double somaDosQuadradosDasDiferencas = 0.0;

        for (Double nota : notas) {
            double diferenca = nota - media;
            somaDosQuadradosDasDiferencas += diferenca * diferenca;
        }

        double variancia = somaDosQuadradosDasDiferencas / notas.size();
        return Math.sqrt(variancia);
    }
}
