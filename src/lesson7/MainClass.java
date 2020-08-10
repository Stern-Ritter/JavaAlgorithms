package lesson7;

import java.util.LinkedList;

public class MainClass {

    public static void main(String[] args) {

        //Задание №1.Реализовать программу, в которой задается граф из 10 вершин. Задать ребра и найти кратчайший путь
        // с помощью поиска в ширину. так же укажите длину пути.
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,7);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(7,8);
        graph.addEdge(7,9);

        printShortcut(graph, 0, 9);
        printShortcut(graph, 8, 1);
        printShortcut(graph, 5, 2);
        printShortcut(graph, 4, 7);
    }

    public static void printShortcut (Graph g, int start, int end){
        BreadthFirstPath bfp = new BreadthFirstPath(g, start);
        if (!bfp.hasPathTo(end)){
            System.out.printf("Из точки %d нельзя попасть в точку %d. \n", start, end);
        } else {
            LinkedList <Integer> link = bfp.pathTo(end);
            System.out.printf("Кратчайший путь из точки %d в точку %d: \n", start, end);
            System.out.println(link);
            System.out.printf("Длина пути составляет: %d. \n", link.size());
        }
    }
}
