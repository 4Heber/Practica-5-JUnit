import Interfaces.ICalculadora;

/**
 * Clase Calculadora implementa los métodos abstractos heredados de la interfaz ICalculadora
 * @author Heber M.Rodriguez
 *
 */
public class Calculadora implements ICalculadora{
	
	private int input1;
	private int input2;
	
	/**
	 * Constructor clase Calculadora, instancia objeto con dos enteros.
	 * @param input1
	 * @param input2
	 */
	public Calculadora(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
	};

	/**
	 * Retorna el valor sumado de los dos enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int sumar() {
		return (input1 + input2);
	}

	/**
	 * Retorna la sustracción de los enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int restar() {
		return (input1 - input2);
	}

	/**
	 * Retorna el valor multiplicado de los dos enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int multiplicar() {
		return (input1 * input2);
	}

	/**
	 * Retorna el resto de los valores recibidos por parámetro.
	 * @param arg1 Dividendo
	 * @param arg2 Divisor
	 * @return int value
	 */
	@Override
	public int dividir() {
		return (input1 / input2);
	}
}
                  