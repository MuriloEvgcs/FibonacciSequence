import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean keepProgramOn = true;

        while (keepProgramOn) {
            List<Integer> FibonacciSequenceList = new ArrayList<>();
            FibonacciSequenceList.add(0);
            FibonacciSequenceList.add(1);

            System.out.println("Digite um número e veja se ele pertence à sequência de Fibonacci");
            int numberToVerify = scanner.nextInt();
            int valueOfOperation = 0;

            for (int i = 2; valueOfOperation < numberToVerify; i++) {
                valueOfOperation = FibonacciSequenceList.get(i - 1) + FibonacciSequenceList.get(i - 2);
                FibonacciSequenceList.add(valueOfOperation);
            }

            int lastNumber = FibonacciSequenceList.get(FibonacciSequenceList.size() - 1);

            if (lastNumber == numberToVerify) {
                System.out.println("O número " + numberToVerify + " está presente na sequência de Fibonacci\n" + FibonacciSequenceList);
            } else {
                System.out.println("O número " + numberToVerify + " não está presente na sequência de Fibonacci.");
            }

            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Deseja verificar mais algum número? (Digite 'S' para continuar e 'N' para encerrar o programa)");
                String answer = scanner.next();
                switch (answer) {
                    case "S":
                    case "s":
                        validResponse = true;
                        break;
                    case "N":
                    case "n":
                        validResponse = true;
                        keepProgramOn = false;
                        break;
                    default:
                        System.out.println("Resposta inválida. Digite 'S' para continuar e 'N' para encerrar o programa.");
                }
            }
        }
    }
}
