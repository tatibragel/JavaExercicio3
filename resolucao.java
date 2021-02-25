package exercio3;
// Desenvolva um pequeno programa de login e senha. 
//Para isso, peça ao usuário para digitar o seu login e armazene o que o usuário digitou em uma variável. 
//Em seguida, peça para o usuário digitar a sua senha e armazena em uma outra variável. 
//Por fim, verifique se o login e a senha são iguais àquele definido por você.

import java.util.Scanner;

public class resolucao {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu usuário:");
	String usuario = sc.nextLine();
	
	if(usuario.equals("Tatiane")) {
		System.out.println("Ok!");
		System.out.println("Agora digite sua senha:");
		String senha = sc.nextLine();
		if(senha.equals("0123456")) {
			System.out.println("Bem vindo ao nosso servidor!");
		}else {
			System.out.println("Senha inválida!");
		}
	}else{
        System.out.println("Usuario incorreto!");
    }
	
	sc.close();

	}

	
}
