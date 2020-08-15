package lesson8;

public class MainClass {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();
        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        chm.put(4, "four");
        chm.put(5, "five");

        System.out.println(chm);
        chm.delete(3);
        chm.delete(4);
        System.out.println("После удаления элементов:");
        System.out.println(chm);
    }
}
