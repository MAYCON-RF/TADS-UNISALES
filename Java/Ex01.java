/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class Ex01 {
    public static double retornaMedia(double vet[]) {
  double soma = 0;
  for (int i = 0; i < vet.length; i++) {
 soma += vet[i];
  }
  return soma / vet.length;
 }

}
