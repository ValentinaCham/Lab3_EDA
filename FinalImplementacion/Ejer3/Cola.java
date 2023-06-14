public class Cola<T> {
    private Node<T> frente;
    private Node<T> fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public Cola<T> push(T elemento) {
        Node<T> nuevoNodo = new Node<>(elemento);
        if (isEmpty()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setNext(nuevoNodo);
            fin = nuevoNodo;
        }
        return this;
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.getData();
    }

    public Cola<T> pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        frente = frente.getNext();
        if (frente == null) {
            fin = null;
        }
        return this;
    }

    public boolean isEmpty() {
        return frente == null;
    }
}
