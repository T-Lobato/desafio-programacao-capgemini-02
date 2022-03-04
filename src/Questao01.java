import java.util.*;

public class Questao01 {
    public static void main(String[] args) {
        // Cria um objeto "sc" do tipo Scanner para entrada de dados.
        Scanner sc = new Scanner(System.in);

        // Cria uma lista de valores inteiros em ordem aleatória.
        List<Integer> lista = new ArrayList<>();

        // Preenche a lista com os valores de entrada.
        for(int i = 0; i < 5; i++){
            lista.add(Integer.parseInt(sc.nextLine()));
        }

        // Ordena os valores dentro da lista.
        Collections.sort(lista);

        // Imprime os valores da lista após a ordenação.
        System.out.println(lista);

        // Divide o tamanho da lista por 2 e acrescenta o resultado a variável Mediana.
        int mediana = lista.size() / 2;

        // Imprime o valor central da lista utilizando a variavel mediana como indíce.
        System.out.println(lista.get(mediana));
    }
}