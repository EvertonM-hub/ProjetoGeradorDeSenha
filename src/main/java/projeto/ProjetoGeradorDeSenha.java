package projeto;
import java.security.SecureRandom;
import java.util.Scanner;

public class ProjetoGeradorDeSenha {
    private static final String CARACTERES = "abcdefghijklmnopqrstuvxzwyABCDEFGHIJKLMNOPQRSTUVXZWY0123456789!@#$%&*()_+-=[],.?<>";
        public static String gerarSenha(int comprimento) { //Metodo separado apenas para gerar as senhas
            SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
            StringBuilder senha = new StringBuilder(comprimento);

            for (int i = 0; i < comprimento; i++) { // roda todos os carecteres declrados para gerar uma senha segura
                int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
                senha.append(CARACTERES.charAt(indice));
            }
            return senha.toString(); // conerte a senha em uma String

        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
             System.out.print("Digite o comprimento da Senha desejada:");
                 int comprimentoSenha = scanner.nextInt();
       // int comprimentoSenha = 12; //Define o comprimento da senhas, sem a implementação da Classe Scanner.
            String senha = gerarSenha(comprimentoSenha);
        System.out.println("Senha Gerada: " + senha);
    }
}

/*
Melhoria para uso e testes, implementacao da classe Scanner, Para Facilitar os testes e uso via terminal

        Scanner scanner = new Scanner (System in); // Cria um Scanner para ler o teclado
        System.out.print("Digite o comprimento da Senha desejada:");
        int comprimentoSenha = scanner.nextInt(); //Lê o comprimento da senha digitado.
 */
