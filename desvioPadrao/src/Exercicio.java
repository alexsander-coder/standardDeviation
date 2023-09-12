import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Exercicio {

    private final static int MAX_ALUNOS = 50;
    private final static byte[] SEED = {-127, 127};

    public static void main(String[] args) {
        SecureRandom randNum = new SecureRandom(SEED);
        double notaRand;
        int numAlunos = randNum.nextInt(MAX_ALUNOS);

        List<Double> notas = new ArrayList<>();

        for (int i = 0; i < numAlunos; i++) {
            notaRand = randNum.nextFloat() * 100;
            notas.add(notaRand);
        }

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", otherSymbols);

        System.out.println("Qtd Alunos: " + numAlunos);
        System.out.println("Media das notas: " + df.format(Estatistica.media(notas))); 
        System.out.println("Desvio Padrao das notas: " + df.format(Estatistica.desvioPadrao(notas)));
    }
}
