package lesson5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        //Задание №1. Написать программу по возведению числа в степень с помощью рекурсии.
        long start = System.currentTimeMillis();
        System.out.println(reсExp(2,31)-1);
        System.out.println(expSimple(2,31)-1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Время вычисления: " + (System.currentTimeMillis() - start));

        //Задание №2 Написать программу «Задача о рюкзаке» с помощью рекурсии.
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Ноутбук",4,1000));
        items.add(new Item("Принтер", 12, 400));
        items.add(new Item("Фотоаппарат", 2, 200));
        items.add(new Item("Наушники", 2, 100));
        items.add(new Item("Мышь", 1, 100));

        BackPack bp = new BackPack(15);
        bp.makeNewCollection(items);
        System.out.println(bp.showBestComb());
    }

    //Задание №1. Написать программу по возведению числа в степень с помощью рекурсии.
    public static int reсExp (int num, int exp){
        if ( exp == 0) {
            return 1;
        }
        if (exp == 1){
            return num;
        }
        if ( exp % 2 == 1) {
            int y = reсExp(num, exp/2 );
            return y * y * num;
        } else {
            int y = reсExp(num, exp/2);
            return y * y;
        }
    }

    public static int expSimple (int num, int exp){
        if ( exp == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < exp ; i++) {
            result *= num;
        }
        return result;
    }

}
