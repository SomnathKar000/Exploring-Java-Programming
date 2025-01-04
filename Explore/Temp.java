public class Temp {
    public static void main(String [] args){
        int multiArr[][]=new int[3][];
       for(int i=0;i<multiArr.length;i++){
        int randomNum=(int)(Math.random()*10);
        multiArr[i]= new int[randomNum];
       }

        // for(int i=0;i<multiArr.length;i++){
        //     for(int j=0;j<multiArr[i].length;j++){
        //         multiArr[i][j]=(int)(Math.random()*9+1);
        //     }
        // }
        for(int arr[]:multiArr){
            for(int i=0;i<arr.length;i++){
                arr[i]=(int)(Math.random()*9+1);
            }
        }

        for(int i=0;i<multiArr.length;i++){
            for(int j=0;j<multiArr[i].length;j++){
                System.out.print(multiArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
