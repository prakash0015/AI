package Aiexam;
package AI;
import java.util.*;
public class FirstGraph {

    static class Edge {
        int src;
        int dest;
        public Edge(int s,int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void bfs(ArrayList<Edge> graph[],int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(vis[curr]==false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(Edge e:graph[curr]) {
                    q.add(e.dest);
                }
            }
           
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for(Edge e:graph[curr]) {
            if(vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
           
        }
    }

    public static void main(String[] args) {
       int v = 4;
       ArrayList<Edge> graph[] = new ArrayList[v];
       createGraph(graph);
        boolean vis[] = new boolean[v];
       //bfs
    //    bfs(graph, v);
        dfs(graph, 0, vis);


       
    }
}