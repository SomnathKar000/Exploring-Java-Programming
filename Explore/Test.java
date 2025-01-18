public class Test {
    public static void main(String args[]) {
        Mac obj = new Mac();
        obj.code();
        obj.playMusic();
    }
}

class Mac extends Computer {

    public void code() {
        System.out.println("Run code");
    }

}

abstract class Computer {
    public abstract void code();

    public void playMusic() {
        System.out.println("Play music");
    }
}