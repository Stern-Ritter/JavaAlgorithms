package lesson3;

import java.util.EmptyStackException;

//2. Создать класс для реализации дека.
public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if(begin == end){
            begin= prevIndex(begin);
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if(begin == end){
            end= nextIndex(end);
        }
        size++;
        list[begin] = item;
        begin = prevIndex(begin);
    }

    public T removeRight() {
        T value = peekRight();
        size--;
        end = prevIndex(end);
        list[end] = null;
        return value;
    }

    public T removeLeft() {
        T value = peekLeft();
        size--;
        begin = nextIndex(begin);
        list[begin] = null;
        return value;
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[prevIndex(end)];
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[nextIndex(begin)];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {return ((list.length - 1) + index) % list.length;}

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = nextIndex(begin);
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndex(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
