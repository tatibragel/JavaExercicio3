package exercio3;
// Desenvolva um pequeno programa de login e senha. 
//Para isso, pe�a ao usu�rio para digitar o seu login e armazene o que o usu�rio digitou em uma vari�vel. 
//Em seguida, pe�a para o usu�rio digitar a sua senha e armazena em uma outra vari�vel. 
//Por fim, verifique se o login e a senha s�o iguais �quele definido por voc�.

import java.util.Scanner;

public class resolucao {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu usu�rio:");
	String usuario = sc.nextLine();
	
	if(usuario.equals("Tatiane")) {
		System.out.println("Ok!");
		System.out.println("Agora digite sua senha:");
		String senha = sc.nextLine();
		if(senha.equals("0123456")) {
			System.out.println("Bem vindo ao nosso servidor!");
		}else {
			System.out.println("Senha inv�lida!");
		}
	}else{
        System.out.println("Usuario incorreto!");
    }
	
	sc.close();

	}

	
}
