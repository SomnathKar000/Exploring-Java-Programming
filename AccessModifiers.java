public class AccessModifiers{
    
    public int pub=52;

     // Accessing protected field (within the same package or subclass)
    protected int prot=42;

     // Accessing private field through a public getter method
    private int priva=32;

     // Accessing default (package-private) field within the same package
    int def=22; // Default

    public int getPriva(){
        return priva;
    }

    public void setPriva(int val){
        this.priva=val;
    }

}

