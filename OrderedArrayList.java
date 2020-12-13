public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int x) {
    super(x);
  }

  private int sorter(T value) {
    if (value == null) {
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < size(); i ++) {
      if (value.compareTo(get(i)) <= 0) {
        return i;
      }
    }
    return size();
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (size() > 0) {
      super.add(sorter(value), value);
      return true;
    } else {
      return super.add(value);
    }
  }

  public void add(int index, T value) throws IllegalArgumentException {
    add(value);
  }

  public T set(int index, T value) throws IllegalArgumentException{
    T removed = get(index);
    add(value);
    remove(removed);
    return removed;
  }
}
