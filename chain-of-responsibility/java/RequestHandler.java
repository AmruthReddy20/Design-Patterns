

public abstract class RequestHandler {

  private final RequestHandler next;

  protected RequestHandler(RequestHandler next) {
    this.next = next;
  }


  public void handleRequest(Request req) {
    if (next != null) {
      next.handleRequest(req);
    }
  }

  protected void printHandling(Request req) {
    System.out.println("{} handling request \"{}\""+ req);
  }

  @Override
  public abstract String toString();
}
