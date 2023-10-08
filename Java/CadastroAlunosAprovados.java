
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class CadastroAlunosAprovados {
public static double funcaoMedia(double nota1, double nota2) { //calcula a media
        return (nota1 + nota2) / 2;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] medias = new double[5];
        int totalAlunos = 0;
        int opcao=0;
        do {
            System.out.println("Menu:");
            System.out.println("___________________________________");
            System.out.println("\n 1. Cadastrar aluno e sua média");
            System.out.println("2. Exibir dados de todos os alunos");
            System.out.println("3. Exibir dados dos alunos aprovados");
            System.out.println("4. Exibir dados dos alunos reprovados");
            System.out.println("5. Sair do sistema");
            System.out.println("___________________________________");
            System.out.print("Escolha uma opção: ");
            opcao = Scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (totalAlunos <= 5) {
                        System.out.print("\nDigite o nome do aluno: ");
                        String nomeAluno = Scanner.next();

                        System.out.print("Digite a primeira nota: ");
                        double nota1 = Scanner.nextDouble();

                        System.out.print("Digite a segunda nota: ");
                        double nota2 = Scanner.nextDouble();

                        nomes[totalAlunos] = nomeAluno;
                        medias[totalAlunos] = funcaoMedia(nota1,nota2);

                        totalAlunos++;

                        System.out.println("Aluno cadastrado com sucesso!");
                    } 
                   
                    else {
                        System.out.println("Número máximo de alunos atingido!");
                    }
                    break;
                case 2:
                    System.out.println("\nDados de todos os alunos:");
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            System.out.println("Aluno: " + nomes[i] + ", Média: " + medias[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDados dos alunos aprovados:");
                    boolean nenhumAprovado = true;
                    for (int i = 0; i < totalAlunos; i++) {
                        if (medias[i] >= 6) {
                            System.out.println("Aluno: " + nomes[i] + ", Média: " + medias[i]);
                            nenhumAprovado = false;
                        }
                    }
                    if (nenhumAprovado) {
                        System.out.println("Nenhum aluno aprovado.");
                    }
                    break;
                case 4:
                    System.out.println("\nDados dos alunos reprovados:");
                    boolean nenhumReprovado = true;
                    for (int i = 0; i < totalAlunos; i++) {
                        if (medias[i] < 6) {
                            System.out.println("Aluno: " + nomes[i] + ", Média: " + medias[i]);
                            nenhumReprovado = false;
                        }
                    }
                    if (nenhumReprovado) {
                        System.out.println("Nenhum aluno reprovado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 5.");
                    break;
            }

        } while (opcao != 5);

        Scanner.close();
    }
}