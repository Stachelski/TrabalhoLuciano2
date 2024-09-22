import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(100) + 1;
        
        int maxTentativas = 7;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Adivinhe o número sorteado pela máquina de 1-100");
        
        while (tentativas < maxTentativas) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numRandom) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                acertou = true;
                break;
            } else if (palpite < numRandom) {
                System.out.println("O número sorteado é maior que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("O número sorteado é menor que " + palpite + ". Tente novamente.");
            }
        }
        
        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número sorteado era: " + numRandom);
        }
        
        scanner.close();
    }
}

