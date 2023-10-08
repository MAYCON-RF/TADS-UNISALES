/* @author MAYCON */
public class calculaMedia {

  //método recursivo
  public static int multiReq(int a, int b) {
    if (b == 1) return a;
    return a + multiReq(a, b - 1);
  }

  public static void main(String[] args) {
    //chamada ao método
    System.out.println(multiReq(3, 4));
  }
}
