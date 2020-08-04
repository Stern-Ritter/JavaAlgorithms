package lesson5;

import java.util.ArrayList;
import java.util.List;

//Задание №2 Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class BackPack {
    private List<Item> bestComb;
    private double maxWeigth;
    private double calcCoast;

    public BackPack(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public double calculateWeith(List<Item> items){
        double result = 0;
        for (Item i: items ) {
            result += i.getWeigth();
        }
        return result;
    }

    public double calculateCoast(List<Item> items){
        double result = 0;
        for (Item i: items) {
            result += i.getCoast();
        }
        return result;
    }

    private void checkCollection(List<Item> items){
        if (bestComb == null){
            if(calculateWeith(items)<= maxWeigth){
                bestComb = items;
                calcCoast = calculateCoast(items);
            }
        } else {
            if (calculateWeith(items) <= maxWeigth && calculateCoast(items) > calcCoast) {
                bestComb = items;
                calcCoast = calculateCoast(items);
            }
        }
    }

    public void makeNewCollection(List<Item> items){
        if (items.size() > 0){
            checkCollection(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newCollection = new ArrayList<Item>(items);
            newCollection.remove(i);
            makeNewCollection(newCollection);
        }
    }

    public String showBestComb() {
        if(bestComb == null){
            return "Нет решения";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for (Item i : bestComb) {
                sb.append(i.getName()).append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            sb.append(" ]");
            return sb.toString();
        }
    }
}
