package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge7 {
	public static void main(String [] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> ordenados = numeros.stream()
		        .distinct()
		        .sorted(Comparator.reverseOrder())
		        .collect(Collectors.toList());

		int segundoMaior = ordenados.size() > 1 ? ordenados.get(1) : null;

		System.out.println("Segundo número maior: " + segundoMaior);
	}
}
