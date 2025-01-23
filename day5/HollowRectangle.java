package day5;

// Hollow Rectangle ---> only border will be filled with inside empty
// outer loop --> rows 
// inner loop --> cols 
// boundary condition 
// i == 1 indicating we are at the first row now filled it full
// i == row indicating last row filled it 
// j == 1 indicating first column 
// j == col indicating last column

public class HollowRectangle {

    private static void hallowRectangle(int row, int col){

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){

                // boundary condition
                if( i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        hallowRectangle(5, 5);

    }
}
