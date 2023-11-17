package PR1.Tutorial01.Tutorial02.Tutorial08;
public class PrintTable {
    public static void main(String[] args) {
        int[][] table = {
            {8,1,6},
            {3,5,7},
            {4,9,2}
        };
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++ ){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}