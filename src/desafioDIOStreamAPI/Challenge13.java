package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge13 {
	public static void main (String []args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> dentroIntervalo = numeros.stream()
		        .filter(n -> n >= 5 && n <= 10)
		        .collect(Collectors.toList());

		System.out.println("Números dentro do intervalo [5, 10]: " + dentroIntervalo);
		}
}
