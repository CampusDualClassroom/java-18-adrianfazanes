package com.campusdual.classroom;

import com.campusdual.util.Utils; // Importamos la clase Utils del paquete util

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

		int n = requestInt("Ingrese el número de elementos para el array:");


		int[] array = createAndInitializeArray(n);


		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static int requestInt(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		while (!scanner.hasNextInt()) {
			System.out.println("Por favor, ingrese un número válido.");
			scanner.next();
		}
		return scanner.nextInt();
	}
}
