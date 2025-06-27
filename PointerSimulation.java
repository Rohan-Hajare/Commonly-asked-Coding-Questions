package CompanyAptitudeQuestions;

public class PointerSimulation {
    public static void main(String[] args) {
        int[][] a = {{1, 2},
                     {3, 4}};

        int[][] p = new int[3][];
        p[0] = a[0];
        p[1] = a[1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int k=0;
                do {
                    System.out.printf("%d, %d, %d, %d\n",
                            p[i][j],
                            p[i][j],
                            a[i][j],
                            a[i][j]
                    );
                    k++;
                }while(k<p[i][j]);
            }
        }
    }
}

