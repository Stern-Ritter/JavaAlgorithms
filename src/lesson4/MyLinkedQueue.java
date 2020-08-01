package lesson4;
//Задание 2. Реализовать LinkedQueue (очередь, на базе связанных списков.)
public class MyLinkedQueue <T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public void insert(T item) {
        queue.insertLast(item);
    }
    public T remove() {
        return queue.deleteFirst();
    }
    public T peek() {
        return queue.getFirst();
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public String toString() {
        return queue.toString();
    }
    }