package Interfaces;

/**
 * Interfaz con 4 m?todos declarados (sumar,restar,multiplicar,dividir)
 * para sobre-escribir en clases que la implementen.
 * @author Heber M.Rodriguez
 *
 */
public interface ICalculadora {
	
	/**
	 * Retorna el valor sumado de los dos enteros recibidos por par?metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int sumar();
	
	/**
	 * Retorna la sustracci?n de los enteros recibidos por par?metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int restar();
	
	/**
	 * Retorna el valor multiplicado de los dos enteros recibidos por par?metro.
	 * @param arg1 Primer argumento
	 * @param arg2 Segundo argumento
	 * @return
	 */
	public int multiplicar();

	/**
	 * Retorna el resto de los valores recibidos por par?metro.
	 * @param arg1 Dividendo
	 * @param arg2 Divisor
	 * @return
	 */
	public int dividir();
}
