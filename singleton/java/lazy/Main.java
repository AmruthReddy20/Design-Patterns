package lazy;

class Main {

    public static void main(String[] args) {

        // This is the basic implementation for singleton
        // It's not thread safe
        // It uses lazy instantiation; instantiate object when it's needed
        DataBase database = DataBase.getInstance();
        database.display();

    }

}