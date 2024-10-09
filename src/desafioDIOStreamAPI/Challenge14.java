package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Challenge14 {
	public static void main (String []args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		int maiorPrimo = numeros.stream().filter(n -> n % 2 != 0 && n % 3 != 0 ).max(Integer::compare).orElse(0);
		
		System.out.println("Maior número primo: " + maiorPrimo);
		}
}
