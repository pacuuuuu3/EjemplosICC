/**
 * Clase de Operaciones para números en java.
 * @author Víctor Zamora Gutiérrez
 * @version 1.0
 */
public class Operaciones{

    /**
     * Opera dos números.
     * @param d1 - Primer número a operar
     * @param d2 - Segundo número a operar
     * @param f - Función que toma dos dobles y regresa un doble
     * @return El resultado de aplicar f a d1 y d2.
     */
    public static double opera(double d1, double d2, Funcion f){
	return f.f(d1, d2);
    }

    /**
     * Interfaz de función para definir Lambdas
     */
    public interface Funcion{

	/**
	 * Función sobre dos dobles 
	 * @param d1 - Primer doble a operar
	 * @param d2 - Segundo doble a operar
	 * @return El resultado de la operación
	 */
	public double f(double d1, double d2);
    }


    /**
     * Método principal para probar distintas operaciones. 
     */
    public static void main(String args[]){

	Funcion suma = (d1, d2) -> d1 + d2; /* Suma dos números */
	Funcion resta = (d1, d2) -> d1 - d2; /* Resta dos números */
	Funcion multiplicacion = (d1, d2) -> d1 * d2; /* Multiplica dos números */
	Funcion division = (d1, d2) -> d2 != 0 ? d1 / d2 : 0; /* Función división con 0 como valor por default */

	/* PRUEBAS */
	double d1 = 3.0;
	double d2 = 5.0;

	System.out.printf("Suma: %f\n", opera(d1, d2, suma));	
	System.out.printf("Resta: %f\n", opera(d1, d2, resta));
	System.out.printf("Multiplicación: %f\n", opera(d1, d2, multiplicacion));
	System.out.printf("División: %f\n", opera(d1, d2, division));

	/* CON CLASES INTERNAS ANÓNIMAS */
	System.out.printf("Suma: %f\n", opera(d1,d2, new Funcion(){
		@Override
		public double f(double n1, double n2){
		    return n1 + n2;
		}
	    }));

    }

    
}
