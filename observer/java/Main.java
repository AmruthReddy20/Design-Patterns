public class Main {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        String subscribers[] = {"Mark", "Peter", "Alex"};

        Subscriber subscriber = null;

        for (String name : subscribers) {
            subscriber = new Subscriber(name, newsletter);
        }


        newsletter.create("This newsletter shall be sent to subscribers");

        newsletter.deleteObserver(subscriber);

    }

}