package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	
	static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	
	
	/**	 
	 * Para ejecutar el método main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
	
		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		
		informacion(lista1, 10);
		
		// EJERCICIO 4.2: corregir el metodo
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());
		
		// EJERCICIO 4.3: implementar
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());
		
		// EJERCICIO 4.4: implementar
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);
		
		// EJERCICIO 4.5: implementar
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la implementacion
		
		
		// CUENTA LA CANTIDAD DE NUMEROS PARES DE LA LISTA1
		int pares = 0;
		
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			}
		}
		
		System.out.println("Cantidad de numeros pares de la lista: " + pares);
		
		
		// DEVUELVE LOS NUMEROS IMPARES DE LA LISTA1
		
		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n: lista1) {
			if (n % 2 != 0) {
				impares.add(n);
			}
		}
		
		System.out.println("Elementos impares de la lista: " + impares.toString());
		
		
		// DIVIDIDE LA CANTIDAD TOTAL DE ELEMENTOS DE LA LISTA EN 2
		//   10/2=5, p=5
		
		
		int p = lista1.size() / 2;
		
		// DEVUELVE EL INDICE DE LA PRIMERA APARICION DEL ELEMENTO INDICADO , OSEA p
		// EN ESTE CASO DEVUELVE 2, YA QUE SERIA , 0,1,"2" ,DONDE SE ENCUENTRA EL NUMERO 5, EN LA LISTA1.
		
		System.out.println("Indice de la primera aparicion del elemento indicado " + lista1.indexOf(p));
		
		
		
		// COMPARA TODOS LOS ELEMENTOS DE LA LISTA1 SI SON MAYOR QUE EL SEGUNDO PARAMETRO INGRESADO EN EL METODO "numero"
		
		// EN EL CASO QUE SEAN MAYOR SE INCREMENTA LA VARIABLE "c"
		
		// COMO EN ESTE CASO EXISTEN 2 NUMEROS MAYORES A numero=10, QUE SON 30 Y 20(elementos de la lista1), ENTONCES, c=2
		
		int c = 0;
		for (Integer n: lista1) {
			if (n > numero) {
				c = c + 1;
			}
		}
		
		
		// EN ESTE CASO DIVIDE LA CANTIDAD TOTAL DE ELEMENTOS DE LA LISTA1 EN 2, OSEA 10/2= 5
		
		// COMO c=2 , 2>10 , LA CONDICION NO SE CUMPLE POR LO TANTO NO IMPRIME LA PRIMERA SALIDA
	
		if (c > lista1.size() / 2) {
			System.out.println("PRIMERA SALIDA");
		
		
	// COMO 2>0 , SI SE CUMPLE LA CONDICION POR LO TANTO IMPRIME LA SEGUNDA SALIDA
			
		} else if (c > 0) {
			System.out.println("SEGUNDA SALIDA");
		} else {
			System.out.println("TERCERA SALIDA");
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		

		// TODO: corregir el metodo para que funcione correctamente 
		
		//  List<Integer> union = null;
	
		 List<Integer> union = new ArrayList<Integer>();
		
		union.addAll(lista1);

		
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}
		}
		
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
	
		
		// IMPRIME LA UNION DE LISTA 1 Y 2 SIN ELEMENTOS REPETIDOS
		
		Set<Integer> listacombinada = new HashSet<>(lista1);
		listacombinada.addAll(lista2);
		 



		
		return new ArrayList<Integer>(listacombinada);
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO
		
		  
		
		Collections.sort(lista1);
		

		
		return new ArrayList<Integer>(lista1);
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
		
		Comparator<Integer> comparador = Collections.reverseOrder();
		
		Collections.sort(lista2,comparador);
		
	
		
		return new ArrayList<Integer>(lista2);
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	@SuppressWarnings("unused")
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO:		
		
		if (lista1.size() != lista2.size() || lista1==null && lista2 !=null || lista1 !=null && lista2==null) {
			
			return false;
			
		}
		
		if(lista1 == null && lista2==null) {
			
			return true;
		
		}
			
			Collections.sort(lista1);
			Collections.sort(lista2);
			
			return lista1.equals(lista2);
			
	}

}
