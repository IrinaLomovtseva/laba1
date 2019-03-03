public class Main {

        public static void main(String[] args) {

            int[][] matr;
            int s;
            s = 0;
            int p;
            p = 0;
            matr = new int[2][2];

            matr[0][0] = (int) (Math.random()*1548);
            matr[0][1] = (int) (Math.random()*154);
            matr[1][0] = (int) (Math.random()*5454);
            matr[1][1] = (int) (Math.random()*15454);


            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matr[i][j] + "\t");
                }
                System.out.println();
            }
            {for(int i=0; i<2; ++i){
                for(int j= 0; j<2; ++j) {
                    if(i == j){
                        s += matr[i][j];
                    }
                }
            }
                System.out.print("Summ glavnoi diagonali = ");
                System.out.println(s);
            }
            {for(int i=0; i<2; ++i){
                for(int j= 0; j<2; ++j) {
                    if(i != j){
                        p += matr[i][j];
                    }
                }
            }
                System.out.print("Summ pobochnoi diagonali = ");
                System.out.println(p);
            }
        }
    }
