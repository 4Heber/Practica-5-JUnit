import Interfaces.ICalculadora;

/**
 * Clase Calculadora implementa los m�todos abstractos heredados de la interfaz ICalculadora
 * @author Heber M.Rodriguez
 *
 */
public class Calculadora implements ICalculadora{

	/**
	 * Retorna el valor sumado de los dos enteros recibidos por par�metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int sumar(int arg1, int arg2) {
		return (arg1+arg2);
	}

	/**
	 * Retorna la sustracci�n de los enteros recibidos por par�metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int restar(int arg1, int arg2) {
		return (arg1-arg2);
	}

	/**
	 * Retorna el valor multiplicado de los dos enteros recibidos por par�metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return int value
	 */
	@Override
	public int multiplicar(int arg1, int arg2) {
		return (arg1*arg2);
	}

	/**
	 * Retorna el resto de los valores recibidos por par�metro.
	 * @param arg1 Dividendo
	 * @param arg2 Divisor
	 * @return int value
	 */
	@Override
	public int division(int arg1, int arg2) {
		return (arg1/arg2);
	}
}
                  