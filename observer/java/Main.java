public class Main {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        String subscribers[] = {"Mark", "Peter", "Alex"};


        // Then create subscriber object(s), and pass newsletter object.
        // Each subscriber object will add itself to array of observers,
        // for the passed newsletter object
        Subscriber subscriber = null;

        for (String name : subscribers) {
            subscriber = new Subscriber(name, newsletter);
        }

        // Whenever you create a new newsletter,
        // Subscribers will get notified
        newsletter.create("This newsletter shall be sent to subscribers");

        // You can also delete a subscriber from array of observers
        newsletter.deleteObserver(subscriber);

    }

}