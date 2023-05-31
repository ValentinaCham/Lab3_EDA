public class Pila<T> {
  // T stands for "Type"
  private T t;
  private T head;
  
  public Pila(){   
  }

  public void set(T t) { this.t = t; }

  public T get() { return t; }
}
