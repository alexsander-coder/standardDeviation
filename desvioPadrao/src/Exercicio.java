
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Qtd Alunos: " + numAlunos);
        System.out.println("Média das notas: " + Estatistica.media(notas));
        System.out.println("Desvio Padrão das notas: " + Estatistica.desvioPadrao(notas));
    }
}
