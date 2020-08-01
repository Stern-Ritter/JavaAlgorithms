package lesson4;

public class Main {
    public static void main(String[] args) {
    //Задание 2. Реализовать LinkedQueue (очередь, на базе связанных списков.)
        MyLinkedQueue <String> myLinQue = new MyLinkedQueue<>();
        myLinQue.insert("Cat");
        myLinQue.insert("Dog");
        myLinQue.insert("Bird");
        System.out.println(myLinQue.peek());
        System.out.println(myLinQue.peek());
        System.out.println(myLinQue.peek());
        System.out.println(myLinQue.size());
        System.out.println(myLinQue.isEmpty());
        System.out.println(myLinQue.toString());
        System.out.println(myLinQue.remove());
        System.out.println(myLinQue.remove());
        System.out.println(myLinQue.remove());
        System.out.println(myLinQue.size());
        System.out.println(myLinQue.isEmpty());
        System.out.println(myLinQue.toString());

    }
}
