package fp.dam.java;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio02 {
//	Modifica las clases Product , ProductLine , Order , OrderDetails del paquete fp.dam.java.model para definir un
//	orden natural para sus instancias que sea consistente con el método equals definido en ellas.
	
//	Crea una clase llamada Ejercicio02 e implementa en ella el método main para que ponga a prueba estos criterios
//	de ordenación almacenando en un TreeSet los elementos de las listas referenciadas por las variables estáticas
//	Ejercicio03. products , Ejercicio03 .productLines , Ejercicio03.orders y Ejercicio03.orderDetails . 
	public static void main(String[] args) {
		Set<String> TreeSet = new TreeSet<>();
		TreeSet.add(Ejercicio03.products.toString());
		TreeSet.add(Ejercicio03.productLines.toString());
		TreeSet.add(Ejercicio03.orders.toString());
		TreeSet.add(Ejercicio03.orderDetails.toString());

	}

}
