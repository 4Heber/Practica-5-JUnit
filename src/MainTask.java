
/**
 * Clase Main
 * @author Heber M.Rodriguez
 *
 */
public class MainTask {

	public static void main(String[] args) {
		
		int num1 = 16;
		int num2 = 4;
		
		Calculadora operation = new Calculadora();
		
		int result = operation.sumar(num1, num2);
		System.out.println(result);
		
		result = operation.restar(num1, num2);
		System.out.println(result);
		
		result = operation.multiplicar(num1, num2);
		System.out.println(result);
		
		result = operation.division(num1, num2);
		System.out.println(result);
	}
}
