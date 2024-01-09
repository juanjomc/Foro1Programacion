
public class Pregunta1 {

	public static void main(String[] args) {

		String password = "12345";
		
		if (password == "12345") {
			System.out.println("Contraseña correcta.");
			
		} else {
			System.out.println("Contraseña incorrecta.");
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
//		Bucle for que nos dira los años bisiestos del 2000 al 2100
		for (int i = 2000; i < 2100; i++) {
			
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				System.out.println("El año " + i + " es bisiesto");
			}
			
		}
		
	}

}
