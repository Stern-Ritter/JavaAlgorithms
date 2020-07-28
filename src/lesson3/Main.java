package lesson3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("тевирП"));

        MyPriorityQueue<Integer> myQu= new MyPriorityQueue<Integer>(10, Comparator.reverseOrder());
        myQu.insert(1);
        myQu.insert(2);
        myQu.insert(3);
        myQu.insert(4);
        myQu.insert(5);
        System.out.println(myQu);

        MyStack<Integer> mySt =  new MyStack<>();
        System.out.println("Размер стека до увеличения " + mySt.capacity());
        for (int i = 0; i < 11; i++) {
            mySt.push(i);
        }
        System.out.println("Размер стека после увеличения " + mySt.capacity());

        MyDeque <Integer> myDeq = new MyDeque<>();
        myDeq.insertLeft(1);
        myDeq.insertLeft(2);
        myDeq.insertRight(3);
        myDeq.insertRight(4);
        System.out.println(myDeq);
        System.out.println(myDeq.removeRight());
        System.out.println(myDeq.removeLeft());
        System.out.println(myDeq.removeRight());
        System.out.println(myDeq.removeLeft());
        System.out.println(myDeq);
    }

    //Задание 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
    public static String reverse(String str){
        MyStack<Character> tempStack = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            tempStack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!tempStack.isEmpty()){
            sb.append(tempStack.pop());
        }
        return sb.toString();
    }
}