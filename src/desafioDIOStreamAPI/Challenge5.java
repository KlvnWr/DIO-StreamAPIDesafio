package desafioDIOStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Challenge5 {
	public static void main(String [] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		double mediaMaioresQue5 = numeros.stream()
		        .filter(n -> n > 5)
		        .mapToDouble(n -> n)
		        .average()
		        .orElse(0.0);

		System.out.println("Média dos números maiores que 5: " + mediaMaioresQue5);
	}
}
