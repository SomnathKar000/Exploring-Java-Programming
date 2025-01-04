public class Temp {
    public static void main(String [] args){
        int multiArr[][]=new int[3][];
        multiArr[0]=new int[2];
        multiArr[1]=new int[5];
        multiArr[2]=new int[3];
        for(int i=0;i<multiArr.length;i++){
            for(int j=0;j<multiArr[i].length;j++){
                System.out.print(multiArr[i][j]);
            }
            System.out.println();
        }

    }
}
