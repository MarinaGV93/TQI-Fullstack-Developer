/*Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos gostarem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja, nem sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um programa para ele que determine se é possível ou não devolver o troco exato utilizando duas notas.

As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

Entrada
A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A entrada termina com N = M = 0.

Saída
Seu programa deverá imprimir "possible" se for possível devolver o troco exato ou "impossible" se não for possível.*/

import java.util.*;

public class DIO {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  String x1y1 = scan.nextLine();
  String x2y2 = scan.nextLine();
  String[] aux = x1y1.split(" ");
  String[] aux1 = x2y2.split(" ");
  
  float x1 = Float.parseFloat(aux[0]);
  float y1 = Float.parseFloat(aux[1]);
  float x2 = Float.parseFloat(aux1[0]);
  float y2 = Float.parseFloat(aux1[1]);

  System.out.printf("%.4f", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
 }
}  