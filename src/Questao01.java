import java.util.*;

public class Questao01 {
    public static void main(String[] args) {
        // Cria um objeto "sc" do tipo Scanner para entrada de dados.
        Scanner sc = new Scanner(System.in);

        // Cria uma lista de valores inteiros.
        List<Integer> lista = new ArrayList<>();

        // Preenche a lista com os valores de entrada.
        System.out.println("Digite 5 valores inteiros para preencher a lista:");
        for(int i = 0; i < 5; i++){
            lista.add(Integer.parseInt(sc.nextLine()));
        }

        // Ordena os valores dentro da lista.
        Collections.sort(lista);

        // Imprime os valores da lista após a ordenação.
        System.out.println("\nLista = " + lista);

        // Divide o tamanho da lista por 2 e acrescenta o resultado a variável Mediana.
        int mediana = lista.size() / 2;

        // Imprime o valor central da lista utilizando a variavel mediana como indíce.
        System.out.println("Mediana = " + lista.get(mediana));
    }
}