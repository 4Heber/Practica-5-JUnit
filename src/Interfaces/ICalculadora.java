package Interfaces;

/**
 * Interfaz con 4 métodos declarados (sumar,restar,multiplicar,dividir)
 * para sobre-escribir en clases que la implementen.
 * @author Heber M.Rodriguez
 *
 */
public interface ICalculadora {
	
	/**
	 * Retorna el valor sumado de los dos enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int sumar(int arg1, int arg2);
	
	/**
	 * Retorna la sustracción de los enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int restar(int arg1, int arg2);
	
	/**
	 * Retorna el valor multiplicado de los dos enteros recibidos por parámetro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int multiplicar(int arg1, int arg2);

	/**
	 * Retorna el resto de los valores recibidos por parámetro.
	 * @param arg1 Dividendo
	 * @param arg2 Divisor
	 * @return
	 */
	public int division(int arg1, int arg2);
}
