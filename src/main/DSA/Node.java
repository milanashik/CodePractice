package main.DSA;

class Node<T> {

    public final T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
