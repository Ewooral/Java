public class UnionFinder {
    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(12);
        qf.union(0, 1);
        qf.union(1, 8);
        qf.union(3, 10);
        qf.union(2, 0);
        System.out.println(qf.connected(0, 3));
        System.out.println("%14d");
    }
}

class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid;
    }
}
