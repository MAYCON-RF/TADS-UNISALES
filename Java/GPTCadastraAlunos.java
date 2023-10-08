import java.util.Scanner;

/*@author MAYCON */
public class GPTCadastraAlunos {

  public static double funcaoMedia(double nota1, double nota2) { //calcula a media
    return (nota1 + nota2) / 2;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String[] nomesDosAlunos = new String[5];
    double[] mediasDosAlunos = new double[5];
    int totalDeAlunos = 0;
    int situacao[] = { 0, 0, 0, 0, 0 };
    int opcao;
    do {
      System.out.println("Menu:");
      System.out.println("___________________________________");
      System.out.println("\n1. Cadastrar aluno e sua média");
      System.out.println("2. Exibir dados de todos os alunos");
      System.out.println("3. Exibir dados dos alunos aprovados");
      System.out.println("4. Exibir dados dos alunos reprovados");
      System.out.println("0. Sair do sistema");
      System.out.println("___________________________________");
      System.out.print("Escolha uma opção: ");
      opcao = scn.nextInt();

      switch (opcao) {
        case 1:
          if (totalDeAlunos < 5) {
            System.out.print("\nDigite o nome do aluno: ");
            String nome = scn.next();

            System.out.print("Digite a primeira nota: ");
            double nota1 = scn.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scn.nextDouble();

            nomesDosAlunos[totalDeAlunos] = nome;
            mediasDosAlunos[totalDeAlunos] = funcaoMedia(nota1, nota2);
            if (mediasDosAlunos[totalDeAlunos] >= 6) {
              situacao[totalDeAlunos] = 1;
            }
            totalDeAlunos++;
          } else {
            System.out.println("A turma já atingiu o número máximo de alunos!");
          }
          break;
        case 2:
          System.out.println("\nDados de todos os alunos:");
          for (int i = 0; i < totalDeAlunos; i++) {
            System.out.println(
              "Aluno: " +
              nomesDosAlunos[i] +
              "\n      Média das notas: " +
              mediasDosAlunos[i]
            );
            if (situacao[i] == 1) {
              System.out.println("      Situação:Aprovado ");
            } else {
              System.out.println("      Situação:Reprovado ");
            }
          }
          break;
        case 3:
          System.out.println("\nDados dos alunos aprovados:");
          for (int i = 0; i < totalDeAlunos; i++) {
            if (mediasDosAlunos[i] >= 6) {
              System.out.println(
                "Aluno: " +
                nomesDosAlunos[i] +
                ", \nMédia: " +
                mediasDosAlunos[i] +
                "\n"
              );
            }
          }
          break;
        case 4:
          System.out.println("\nDados dos alunos reprovados:");
          for (int i = 0; i < totalDeAlunos; i++) {
            if (mediasDosAlunos[i] < 6) {
              System.out.println(
                "Aluno: " +
                nomesDosAlunos[i] +
                ", \nMédia: " +
                mediasDosAlunos[i] +
                "\n"
              );
            }
          }
          break;
        case 0:
          System.out.println("Programa finalizado");
          break;
        default:
          System.out.println(
            "Opção inválida. Digite um número de 1 a 4 e 0 para sair."
          );
          break;
      }
    } while (opcao != 0);

    scn.close();
  }
}
