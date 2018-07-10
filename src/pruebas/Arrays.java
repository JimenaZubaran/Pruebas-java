package pruebas;

public class Arrays {
	public static void main(String[] args) {
		String[] array = {"L","M","N" };
		for (String letras : array) {
		System.out.println(letras);	
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println ("las letras son: " + array[i]);
		}
	}
}
