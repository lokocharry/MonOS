package logica;

/**
 * Clase supervisora de sincronizaci�n de hilos
 * @author Jorge Lozano
 *
 */
public class Lock {
	
	private static final class Bloqueo { }
	/**
	 * Objeto supervisor de sincronizaci�n de los hilos de ejecuci�n y bloqueo
	 */
	public static final Object lock = new Bloqueo();

}
