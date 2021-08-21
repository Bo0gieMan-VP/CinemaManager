public class Film {
    private String name;
    private int length;

    public Film(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }
}
