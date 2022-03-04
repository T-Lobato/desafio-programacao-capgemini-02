import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        // Cria um objeto "sc" do tipo Scanner para entrada de dados.
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5]; // Criação do vetor.

        // Preenche o vetor com os valores de entrada
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um valor para a posição " + i + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        int cont = 0; // Contador que irá armazenar o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
        System.out.print("Digite um valor para x: ");
        int x = sc.nextInt(); // Recebe um valor para x.

        // Cada valor do vetor será comparado com todos os valores a sua frente no intuito de encontrar os pares
        // de valores cujo a diferença é igual a "x".
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++) {
                if(Math.abs(vetor[i] - vetor[j]) == x){ // Utilizei o Math.abs para retornar o valor absoluto da subtração.
                    cont++; // O contador será encrementado cada vez que a condição do if for atendida.
                }
            }
        }
        System.out.println("\nResultado: " + cont); // Imprime o valor do contador.
    }
}