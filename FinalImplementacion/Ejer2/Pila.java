public class Pila<T> {
    private Node<T> top;

    public Pila() {
        this.top = null;
    }

    public void push(T elemento) {
        Node<T> nuevoNodo = new Node<>(elemento);
        nuevoNodo.setNext(top);
        top = nuevoNodo;
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return top.getData();
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        top = top.getNext();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
