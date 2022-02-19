public class Proov3 {
    public static void main(String[] args) {
        int[][] laud = new int[10][10];
        laud[2][3] = 1;
        for(int i=0; i <10; i++) {
            for(int j =0; j<10; j++) {
                System.out.println(laud[i][j]);
            }
        }
        
        System.out.println();
    }
}
