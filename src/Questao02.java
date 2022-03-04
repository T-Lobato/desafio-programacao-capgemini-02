
public class Questao02 {
    public static void main(String[] args) {

        int[] vetor = {1,5,3,4,2,6}; // Criação do vetor.
        int cont = 0; // Contador que irá armazenar o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
        int x = 2; // Um inteiro qualquer x.

        // Cada valor do vetor será comparado com todos os valores a sua frente no intuito de encontrar os pares
        // de valores cujo a diferença é igual a "x".
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++) {
                if(Math.abs(vetor[i] - vetor[j]) == x){ // Utilizei o Math.abs para retornar o valor absoluto da subtração.
                    cont++; // O contador será encrementado cada vez que a condição do if for atendida.
                }
            }
        }
        System.out.println(cont); // Imprime o valor do contador.
    }
}