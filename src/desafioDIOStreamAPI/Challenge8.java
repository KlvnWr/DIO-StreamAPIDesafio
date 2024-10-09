package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Challenge8 {
	public static void main(String [] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		int somaDigitos = numeros.stream()
		        .map(n -> String.valueOf(n))
		        .mapToInt(s -> s.chars().sum() - '0' * s.length())
		        .sum();

		System.out.println("Soma dos dígitos: " + somaDigitos);
	}
}
