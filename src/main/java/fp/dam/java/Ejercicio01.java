package fp.dam.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Ejercicio01 {
	
//	Crea en una clase llamada Ejercicio 01 un método de clase llamado colapsar que acepte, usando una referencia
//	polimórfica, una pila de números enteros y modifique su contenido reemplazando cada par de números
//	consecutivos por la suma de ambos.
//	• No está permitido usar ningún método de iteración.
//	• No está permitido el uso de streams.
//	• Sólo se permiten pilas o colas como estructuras de datos auxiliares.
//	• Sólo se permite el uso de las operaciones propias de pilas y colas.
	
	static Deque<Integer> colapsar(Deque<Integer> pila){
		Deque<Integer> pilaAuxiliar = new ArrayDeque<Integer>();
		Queue<Integer> colaAuxiliar = new ArrayDeque<Integer>();

		if(pila.isEmpty())
			return null;
		pila.iterator();
		if(pila.size() % 2 == 0) {			
			pilaAuxiliar.add(pila.poll() + pila.poll());
		}			
		return pilaAuxiliar; // T
	}

}
