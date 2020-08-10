package lesson7;

import java.util.LinkedList;

//Задание № 2 *. Сделать рефакторинг кода, унаследовав от одного лкасса классы обхода в глубину и ширину.
public class Path {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public Path (Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
