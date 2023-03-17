package PrepareForExam.pattern;

public class Main {
     public static void main(String[] args) {
//          Write your code here
         pattern2(5);
            pattern3(5);
            pattern4(5);
            pattern5(5);
            pattern6(5);
            pattern7(5);
            pattern8(5);
            pattern9(5);


     }

     static void pattern2(int n ){
         System.out.println("Pattern 2");
         for(int row = 1; row <= n; row++){
             //for every row , run the column loop
             for(int col = 1; col <= row; col++){
                 System.out.print("*");
             }
             //When one row is printed, we need to print new line
                System.out.println();
         }

         System.out.println();

     }



    static void pattern3(int n ){
        System.out.println("Pattern 3");
        for(int row = 1; row <= n; row++){
            //for every row , run the column loop
            for(int col = 1; col <= (n+1) - row; col++){
                System.out.print("*");
            }
            //When one row is printed, we need to print new line
            System.out.println();
        }

        System.out.println();

    }

     static void pattern4(int n){
         System.out.println("Pattern 4");
         for(int row = 1; row <= n; row++){
             int i = 1;
             for(int col = 1; col <= row ; col++){
                 System.out.print(i);
                 i++;
             }
             System.out.println();
         }
         System.out.println();
     }

     static void pattern5(int n){
         System.out.println("Pattern 5");
         for(int row = 0; row < n * 2; row++){
             int totalColsinRow = row > n ? n * 2 - row : row;
             for(int col = 0; col < totalColsinRow; col++ ){
                 System.out.print("*");
             }
             System.out.println();
     }

         System.out.println();
     }

     static void pattern6(int n){
         System.out.println("Pattern 6 ");
         for(int row = 1; row <= n; row++){
             for(int col = 1; col <= (n + 1) - row; col++){
                 System.out.print(" ");
             }
             for(int col2 = 1; col2 <= row ; col2++){
                 System.out.print("*");
             }
             System.out.println();
         }
         System.out.println();
     }


     static void pattern7(int n){
         System.out.println("Pattern 7");
         for(int row = 1; row <= n;row++){
             for(int col = 1; col <= row; col++){
                 System.out.print(" ");
             }
             for(int col2 = 1; col2 <= (n + 1) - row ;col2++ ){
                 System.out.print("*");
             }
             System.out.println();
         }
         System.out.println();
     }


     static void pattern8(int n){
         System.out.println("Pattern 8");
         for(int row = 0; row < n + 1; row++){
             int TotalCols = row > 0 ? row + (row - 1) : row;

            for(int col2 = 1; col2 < n- row  + 1 ;col2++){
                System.out.print(" ");
            }
             for(int col = 0; col < TotalCols; col++){
                 System.out.print("*");
             }
             for(int col2 = 1; col2 < n- row + 1 ;col2++){
                 System.out.print(" ");
             }

             System.out.println();
         }

         System.out.println();
     }


     static void pattern9(int n){
         System.out.println("Pattern 9");
         for(int row = 0; row <= n ; row++){
             int TotalCol = row > 0 ? (n -row) + (n - row) : n + (n);
             for(int col = 1; col <=  TotalCol ; col++ ){
                 System.out.print("*");
             }
             System.out.println();
         }

     }

}
//for(int row = n; row > 0 ; row--){
//        int TotalCols2 = row < n  ? row - 3 : 0;
//        for(int col2 = 1; col2 <= TotalCols2; col2++){
//        System.out.print(" ");
//        }
//        4  1
//        3  2
//        2  3
//        1  4
//        int TotalCols = row + (row - 1);
//        for(int col = 0; col < TotalCols ; col++){
//        System.out.print("*");
//        }
//
//        for(int col2 = 1; col2 < row; col2++){
//        System.out.print(" ");
//        }
//        System.out.println();
//        }