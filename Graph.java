import java.util.*;
import java.util.Queue;

public class Graph {
    static Map<Integer,List<Integer>> mp = new HashMap<>();
    static Map<Integer,Boolean> visited1 = new HashMap<>();
    static Map<Integer,Boolean> visited2 = new HashMap<>();

    static void addGr(int x, int y, Boolean z){
        if (!mp.containsKey(x)) {
            mp.put(x,new ArrayList<>());
        }
        mp.get(x).add(y);

        if (!z) {
            if (!mp.containsKey(y)) {
            mp.put(y,new ArrayList<>());
            }
        mp.get(y).add(x);
        }
    }   

    static void bfs(int x){
        Queue<Integer> q = new LinkedList<>(); 

        q.add(x);
        visited1.put(x,true);

        while (!q.isEmpty()) {
            int fs=q.poll();
            System.out.print(fs+",");
            for (Integer n : mp.get(fs)) {
                if (!visited1.getOrDefault(n, false)) {
                    q.add(n);
                    visited1.put(n, true);
                }
            }
        }
    }

    static void dfs(int x){
        visited2.put(x,true);
        System.out.print(x+",");
        for (int n : mp.getOrDefault(x, new ArrayList<>())) {
            if (!visited2.getOrDefault(n, false)) {
                dfs(n);
            }
        }

    }


    public static void main(String[] args) {
        addGr(0, 1, false);
        addGr(1, 6, false);
        addGr(1, 4, false);
        addGr(4, 5, false);
        addGr(4, 3, false);
        addGr(3, 2, false);
        addGr(3, 7, false);
        // addGr(4, 2, false);

        bfs(0);
        System.out.println();
        dfs(0);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter n:");
        // int n=sc.nextInt();
        // int a[][]=new int[n][n];
        // boolean dr;
        // System.out.println("is graph directed or not:");
        // dr = sc.nextBoolean();

        // for (int i = 0; i < a.length; i++) {
        //     System.out.println("insert "+(i+1)+"th line:");
        //     for (int j = 0; j < a.length; j++) {
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        
        // ArrayList<node> m = new ArrayList<node>(n);
        // for (int i = 0; i < n; i++) {
        //     m.add(new node(i));
        // }
        
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         if (a[i][j]==1) {
        //             m.get(i).sub.add(m.get(j));
        //         }
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m.get(i).sub.size(); j++) {
        //         addGr(i, m.get(i).sub.get(j).info, dr);
        //     }
        // }

    }
}

// class node {
//     int info;
//     ArrayList<node> sub=new ArrayList<node>();
//     node(int info){
//         this.info = info;
//     }
// }