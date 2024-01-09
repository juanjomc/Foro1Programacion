import java.util.Scanner;

public class Pregunta4 {

	public static void main(String[] args) {
		int opcion;
		int password=00000;
		Scanner sc = new Scanner(System.in);
		
//		En este do while mostramos el menu con la opcion de salir y solo saldra si pulsa cero.
		do {
			System.out.println("Menu:\n1==> Añadir usuario\n2==> Modificar usuario\n3==>Borrar usuario\n0==>Salir");
			opcion = sc.nextInt();
			
		} while (opcion != 0);
		
//		Entramos en el while y hasta que no se cumple la contraseña no nos deja continuar.
		
		while (password!=12345) {
			System.out.println("Introduzca la contraseña");
			password = sc.nextInt();
		}
		
		sc.close();
	}
	
}
