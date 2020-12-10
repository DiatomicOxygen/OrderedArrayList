import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList( int x ) {
    super(x);
  }

  public boolean add(T x) throws IllegalArgumentException {
    if (x != null) {
      super.add(x);
      return true;
    } else {
      throw new IllegalArgumentException();
    }
  }
}
