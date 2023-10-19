package SenhaSecreta;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaSecreta = "kurenai123";

        System.out.println("Bem vindo ao sistema de senha secreta");

        while (true) {
            System.out.print("Digite a senha: ");
            String tentativaSenha = scanner.nextLine();

            if (tentativaSenha.equals(senhaSecreta)) {
                System.out.println("Senha correta Acesso permitido.");
                break;
            } else {
                System.out.println("Tentativa invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
