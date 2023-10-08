/* @author MAYCON */
public class Ex01 {

  public static double retornaMedia(double vet[]) {
    double soma = 0;
    for (int i = 0; i < vet.length; i++) {
      soma += vet[i];
    }
    return soma / vet.length;
  }
}
