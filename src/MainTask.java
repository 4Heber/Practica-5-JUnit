
/**
 * Clase Main
 * @author Heber M.Rodriguez
 *
 */
public class MainTask {

	public static void main(String[] args) {
		
		
		Calculadora operation = new Calculadora(16,4);
		
		int result = operation.sumar();
		System.out.println(result);
		
		result = operation.restar();
		System.out.println(result);
		
		result = operation.multiplicar();
		System.out.println(result);
		
		result = operation.dividir();
		System.out.println(result);
	}
}
