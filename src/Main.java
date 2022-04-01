public class Main {
    public static final int length_elem = 6;
    public static void main(String[] args){
        String [][] myArray = new String[10][10];
        int elem = 0;
        for(int i = 0; i < 10; i++ ){
            for(int j = 0; j < 10; j++ ) {
                if(elem % 3 == 0) {
                    myArray[i][j] = Double.toString(Math.random()).substring(0, length_elem);
                } else {
                    myArray[i][j] = CutElement.getRandomString(length_elem);
                }
                elem++;
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println(" ");
            }
        System.out.println("Main");
            String[] rezult = new String [myArray.length];
            for (int i = 0; i < myArray.length; i++) {
                rezult[i] = myArray[i][i];
                System.out.print(rezult[i]);
            }
            System.out.println();
            System.out.println("NoMain");
            String[] rezult_2 = new String [myArray.length];
            for (int i = 0; i < myArray.length; i++) {
                rezult_2[i] = myArray[i][myArray.length - 1 - i];
                System.out.print(rezult_2[i]);
            }
            System.out.println();
            if(rezult == rezult_2){
                System.out.println("The same");
            } else {
                System.out.println("Different");
            }



        }
    }

