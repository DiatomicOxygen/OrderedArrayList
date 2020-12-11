import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList( int x ) {
    super(x);
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (value != null) {
      super.add(value);
      return true;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public void add(int index, T value) throws IllegalArgumentException {
    if (value != null) {
      super.add(index, value);
    } else {
      throw new IllegalArgumentException();
    }
  }
}
