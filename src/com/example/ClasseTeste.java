package com.example;

public class ClasseTeste {
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		//Imprime os 10 primiro termos da sequência de fibonacci
		for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
	}
	
	public static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
