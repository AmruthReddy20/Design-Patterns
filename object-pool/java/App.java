

public class App {

  public static void main(String[] args) {
    var pool = new OliphauntPool();
    System.out.println(pool.toString());
    var oliphaunt1 = pool.checkOut();
    String checkedOut = "Checked out {}";

    System.out.println(checkedOut+" "+oliphaunt1);
    System.out.println(pool.toString());
    var oliphaunt2 = pool.checkOut();
    System.out.println(checkedOut+" "+oliphaunt2);
    var oliphaunt3 = pool.checkOut();
    System.out.println(checkedOut+" "+oliphaunt3);
    System.out.println(pool.toString());
    System.out.println("Checking in {}"+ oliphaunt1);
    pool.checkIn(oliphaunt1);
    System.out.println("Checking in {}"+ oliphaunt2);
    pool.checkIn(oliphaunt2);
    System.out.println(pool.toString());
    var oliphaunt4 = pool.checkOut();
    System.out.println(checkedOut+" "+oliphaunt4);
    var oliphaunt5 = pool.checkOut();
    System.out.println(checkedOut+" "+oliphaunt5);
    System.out.println(pool.toString());
  }
}
