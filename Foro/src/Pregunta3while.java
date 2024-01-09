import java.util.Scanner;

// Juego de Nones y Pares, donde tu eres Nones y la computadora Pares. Nos pide introducir un numero y gana el mejor de 5 rondas.

public class Pregunta3while {

	public static void main(String[] args) {

		int jugador, computadora, marcador=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Juego de Nones y Pares, al mejor de 5 rondas. Tu eres Nones (Impar) y el ordenador Pares (Par)");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ronda "+ (i+1) +" e introduce un numero:");
			jugador = sc.nextInt();
			
//			El numero de la computador sera un numero random del 1 al 10.
			computadora = (int) (Math.random()*10)+1;
			
//			Comprobamos si es none o par la suma de los dos numeros.
			
			if (((jugador+computadora)%2)==0) {
				System.out.println("Gana el ordenador.\nEl ordenador saca " + computadora + " y tu " + jugador);
			}
			else {
				System.out.println("Ganas tu.\nEl ordenador saca " + computadora + " y tu " + jugador);
				marcador++;
			}
			
			System.out.println("Marcador ==> Tu:" + marcador + " - Ordenador:" + (i+1 - marcador));
			
		}
		
		if (marcador >2) {
			System.out.println("Enhorabuenas has ganado " + marcador + " - " + (5 - marcador));
		} else {
			System.out.println("Ha ganado el ordenador " + marcador + " - " + (5 - marcador));
		}
		
		sc.close();
				
		
	}

}
