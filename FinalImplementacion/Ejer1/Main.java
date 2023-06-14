//import java.Pila;

public class Main {
    public static void main(String[] args) {
		int[] h1 = {1, 2, 1, 1};
        int[] h2 = {1, 1, 2};
        int[] h3 = {1, 1};
        int resultado = equalStacks(h1, h2, h3);
        System.out.println("Altura máxima posible: " + resultado);
    }

    public static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Pila<Integer> pila1 = construirPila(h1);
        Pila<Integer> pila2 = construirPila(h2);
        Pila<Integer> pila3 = construirPila(h3);

        while (!sonAlturasIguales(pila1, pila2, pila3)) {
            int alturaMaxima = obtenerAlturaMaxima(pila1, pila2, pila3);
            if (!pila1.isEmpty() && pila1.top() > alturaMaxima) {
                pila1 = pila1.pop();
            }
            if (!pila2.isEmpty() && pila2.top() > alturaMaxima) {
                pila2 = pila2.pop();
            }
            if (!pila3.isEmpty() && pila3.top() > alturaMaxima) {
                pila3 = pila3.pop();
            }
        }

        return pila1.top();
    }

    private static Pila<Integer> construirPila(int[] arr) {
        Pila<Integer> pila = new Pila<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            pila = pila.push(arr[i]);
        }
        return pila;
    }

    private static boolean sonAlturasIguales(Pila<Integer> pila1, Pila<Integer> pila2, Pila<Integer> pila3) {
        return pila1.top() == pila2.top() && pila2.top() == pila3.top();
    }

    private static int obtenerAlturaMaxima(Pila<Integer> pila1, Pila<Integer> pila2, Pila<Integer> pila3) {
        return Math.max(Math.max(pila1.top(), pila2.top()), pila3.top());
    }
}
