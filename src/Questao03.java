import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        // Cria um objeto "sc" do tipo Scanner para entrada de dados.
        Scanner sc = new Scanner(System.in);

        // Entrada de dados.
        String frase = sc.nextLine();

        // Remove os espaços da frase com método split e junta novamente a frase com o método join.
        String fraseSemEspaco = String.join("",frase.split(" "));

        // Calcula o valor de t.
        int t = (int) Math.ceil(Math.sqrt(fraseSemEspaco.length()));

        // Declara uma matriz de caracteres que será usada para encriptar a frase.
        Character[][] grid = new Character[t][t];

        // A matriz é preenchida linha a linha com os caracteres da frase.
        int cont = 0;
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t && cont < fraseSemEspaco.length(); j++) {
                grid[i][j] = fraseSemEspaco.charAt(cont);
                cont++;
            }
        }

        // for usado para encriptar a frase com base nos critérios estabelecidos no exercício.
        // Basicamente a matriz será printada na tela coluna a coluna.
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t; j++) {
                if(grid[j][i] != null)
                System.out.print(grid[j][i]);
            }
            System.out.print(" ");
        }
    }
}