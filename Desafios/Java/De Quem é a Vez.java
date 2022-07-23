/*O jogo PAR ou ÍMPAR vem decidindo o destino de pessoas ao longo de décadas. As regras são simples: dois jogadores informam um número e se a soma desses números for par o jogador que escolheu PAR ganha e vice-versa. Em um jogo que as crianças do bairro estão jogando, eles não conseguem decidir quem será o próximo a escolher as regras da brincadeira. Para solucionar esse problema, você foi chamado.

Basicamente a brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador uma das  crianças pediu sua ajuda para desenvolver um programa que, dado o nome dos jogadores, suas respectivas escolhas PAR ou IMPAR e os números, informe quem foi o vencedor.

Entrada
A primeira linha de entrada contém um número inteiro QT (1 ≤ QT ≤ 100), indicando a quantidade de casos de teste que vem a seguir. Cada caso de teste contém duas linhas. Na primeira linha será informado o nome do jogador 1 seguido de sua escolha, “PAR” ou “IMPAR” e logo após, o nome do jogador 2 seguido de sua escolha, “PAR” ou “IMPAR”. Na segunda linha de entrada, contém 2 números inteiros N (1 ≤ N ≤ 10⁹) e M (1 ≤ M ≤ 10⁹), representando respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2. É garantido que a escolha (PAR ou IMPAR) do jogador 1 será diferente da escolha (PAR ou IMPAR) do jogador 2 e que o nome dos jogares são formados somente por letras e não ultrapassarão 100 caracteres.

Saída
Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.*/

// TODO: complete os espaços em branco com sua solução para o problema
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

public class DIO{
	 
     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qtdTestes = Integer.parseInt(leitor.nextLine());

        String linha1[], linha2[], j1, escolha1, j2, escolha2;
        int NUM1, NUM2;
        String vencedor;

        for (int i = 0; i < qtdTestes; i++) {

            //quebra string em várias substrings a partir de um caracter
            linha1 = leitor.nextLine().split(" ");
            linha2 = leitor.nextLine().split(" ");

            //pegar numeros
            NUM1 = Integer.parseInt(linha2[0]);
            NUM2 = Integer.parseInt(linha2[1]);

            j1 = linha1[0];
            escolha1 = linha1[1];

            j2 = linha1[2];
            escolha2 = linha1[3];

            if((NUM1 + NUM2) % 2 == 0){
                 vencedor = (escolha1.equalsIgnoreCase("PAR"))? j1 : j2;
            }
            else{
                 vencedor = (escolha1.equalsIgnoreCase("IMPAR"))? j1 : j2;
            }

            System.out.println(vencedor);
        }
    }
	
}