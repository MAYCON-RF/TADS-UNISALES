/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class ExecucaoLida {
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("digite quantidade");
  int t = scan.nextInt();
  double v[] = new double[t];
  for (int i = 0; i < v.length; i++) {
 v[i] = scan.nextDouble();
  }
  Auxiliar.mostraVetor(v);
  System.out.println("média = " + Ex01.retornaMedia(v));
  System.out.println("menor = " + Ex02.retornaMenor(v));
  Ex03.qNegSPos(v);
  Auxiliar.mostraVetor(Ex04.inverte(v));
  Ex04.inverteProprio(v);
  Auxiliar.mostraVetor(v);
  scan.close();
 }

}
