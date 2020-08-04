package lesson5;

//Задание №2 Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class Item {
    private String name;
    private double weigth;
    private double coast;

    public Item(String name, double weigth, double coast) {
        this.name = name;
        this.weigth = weigth;
        this.coast = coast;
    }
    public String getName() {
        return name;
    }
    public double getWeigth() {
        return weigth;
    }
    public double getCoast() {
        return coast;
    }
}
