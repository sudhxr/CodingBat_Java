package Array3;

public class Test {

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 3, 8};

        int n = 3;
        int bn = (1+x.length) - n;

        for (int i=0; i<bn; i++) {
            for(int j=i; j<n+i; j++) {
                System.out.println("J set: " + x[j]);
            }
            System.out.println("---------------------");
        }
    }
}
