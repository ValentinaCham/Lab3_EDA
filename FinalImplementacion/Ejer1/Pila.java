public class Pila<T> {
    private T elemento;
    private Pila<T> pilaAnterior;

    public Pila() {
        this.elemento = null;
        this.pilaAnterior = null;
    }

    private Pila(T elemento, Pila<T> pilaAnterior) {
        this.elemento = elemento;
        this.pilaAnterior = pilaAnterior;
    }

    public Pila<T> push(T elemento) {
        return new Pila<>(elemento, this);
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemento;
    }

    public Pila<T> pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pilaAnterior;
    }

    public boolean isEmpty() {
        return elemento == null && pilaAnterior==null;
    }
}
