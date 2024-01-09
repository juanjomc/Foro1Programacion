import java.util.Scanner;

public class Pregunta3for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		
		
		System.out.println("Introduce tu nueva contraseña con al menos 8 caracteres.");
		password=sc.next();
		
		while (password.length()<8) {
			System.out.println("Contraseña demasiado corta, vuelva a introducirla.");
			password=sc.next();
		}
		
		System.out.println("Contraseña correcta puede continuar");
		sc.close();
	}

}
