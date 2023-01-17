package Q_LE2;

//creating a generic class
public class Pair <Y, N>{
    //private reference variables
    private Y key;
    private N value;

    //constructor with and without parameter
    public Pair () {}
    public Pair (Y key, N value){
        this.key = key;
        this.value = value;
    }
    //setter methods
    public void setKey(Y key){
        this.key = key;
    }
    public void setValue(N value){
        this.value = value;
    }

    //getter methods
    public Y getKey(){
        return key;
    }
    public N getValue(){
        return value;
    }
}
