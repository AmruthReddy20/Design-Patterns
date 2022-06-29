package lazy;

public class DataBase {
    private static DataBase database = null;

    private DataBase(){}

    public static DataBase getInstance(){
        if(database == null){
            database = new DataBase();
        }
        return database;
    }

    public void display(){
        System.out.println("I'm the Classic Singleton");
        System.out.println("Be Caution: I'm NOT thread safe");
    }
}