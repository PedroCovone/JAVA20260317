package fp.dam.java;

import static java.util.stream.Collectors.averagingInt;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.dam.java.model.Order;
import fp.dam.java.model.OrderDetail;
import fp.dam.java.model.Product;
import fp.dam.java.model.ProductLine;

public class Ejercicio03 {
	
	static final List<Product> products;
	static final List<ProductLine> productLines;
	static final List<Order> orders;
	static final List<OrderDetail> orderDetails;
	
	static {
		try (Stream<String> lines = Files.lines(Path.of(Ejercicio03.class.getResource("/classicmodels/products.csv").toURI()))) {
			products = lines.collect(Collectors.mapping(Product::new, Collectors.toCollection(LinkedList::new)));
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
		try (Stream<String> lines = Files.lines(Path.of(Ejercicio03.class.getResource("/classicmodels/productlines.csv").toURI()))) {
			productLines = lines.collect(Collectors.mapping(ProductLine::new, Collectors.toCollection(LinkedList::new)));
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
		try (Stream<String> lines = Files.lines(Path.of(Ejercicio03.class.getResource("/classicmodels/orders.csv").toURI()))) {
			orders = lines.collect(Collectors.mapping(Order::new, Collectors.toCollection(LinkedList::new)));
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
		try (Stream<String> lines = Files.lines(Path.of(Ejercicio03.class.getResource("/classicmodels/orderdetails.csv").toURI()))) {
			orderDetails = lines.collect(Collectors.mapping(OrderDetail::new, Collectors.toCollection(LinkedList::new)));
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}
	
//	1) Método que retorne la media de los precios de venta recomendados de cada línea de producto.
	static double mediaPrecios(Stream<String> secuencia) {

		return secuencia.collect(averagingInt(String::length));
	}
//	2) Método que retorne la media de los importes totales de todos los pedidos.
	static double mediaImportes(Stream<String> secuencia) {
		
		return 0;
	}
	
//	3) Método que retorne el proveedor (vendor) que suministra la mayor cantidad de productos.
	
//	4) Método que retorne el importe total que han generado las ventas de productos de cada proveedor.
	
//	5) Método que retorne una LinkedList que contenga todas las líneas de detalle en las que la línea
//	de producto del producto pedido sea “Trains” o “Ships”, ordenadas por número de proveedor como primer
//	criterio de ordenación y por cantidad pedida (quantity ordered) como segundo criterio de ordenación.
	
//	6) Método que retorne una lista que contenga el resultado de efectuar una operación equivalente a
//	la operación join del lenguaje SQL entre la lista products y la lista orderDetails . Los elementos de la lista
//	retornada serán instancias de una clase que tendrás que definir
	
	
	public static void main(String[] args) {
		
	}
	
}
