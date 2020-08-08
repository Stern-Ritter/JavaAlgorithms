package lesson6;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List <MyTreeMap> map = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            map.add(MyTreeMap.genTree(6,-100,100));
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Дерево №" + (i + 1) +": размер - " + map.get(i).size() + ", сбалансированность - " + map.get(i).isBalanced());
        }
    }
}
