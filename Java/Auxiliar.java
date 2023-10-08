/* @author MAYCON
 */
public class Auxiliar {

  public static void mostraVetor(double vet[]) {
    for (int i = 0; i < vet.length; i++) {
      System.out.print(vet[i]); //imprime o elemento
      if (i < vet.length - 1) {
        System.out.print(", "); //imprime uma vírgula
      }
    }
    //quebra uma linha no final
    System.out.println("");
  }
}
