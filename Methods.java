public class Methods {
    public static void main(String args[]){
        Computer computer= new Computer();
        computer.playMusic();
        String pen= computer.getMePen(3);
        System.out.println(pen);
    }
}

class Computer {
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMePen(int cost){
        if(cost>5) return "Pen";
        return ""; 
    }
}