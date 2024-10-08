package br.com;

public class Main {
    //Explicações de cada função no README
    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) return true;

        int a = 0, b = 1, next = a + b;

        while (next <= n) {
            if (next == n) return true;
            a = b;
            b = next;
            next = a + b;
        }
        return false;
    }

    public static int countA(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static int sumIntUpToIndice() {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        return SOMA;
    }

    public static void main(String[] args) {
        int testFibonacci = 13;
        System.out.println(testFibonacci + " é fibonacci? " + isFibonacci(testFibonacci));

        String quantosATem = "Aloha";
        System.out.println("A palavra (" + quantosATem + ") tem " + countA(quantosATem) + " A's");

        System.out.println("A resposta da 3 é " + sumIntUpToIndice());
    }
}