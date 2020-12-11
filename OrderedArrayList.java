public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int x) {
    super(x);
  }

  public int sorter(T value) {
    for (int i = 0; i < size(); i ++) {
      if (value.compareTo(get(i)) == -1 || value.compareTo(get(i)) == 0) {
        return i;
      }
    }
    return size();
  }

  public boolean add(T value) {
    if (size() > 0) {
      super.add(sorter(value), value);
      return true;
    } else {
      super.add(value);
      return true;
    }
  }

  public void add(int index, T value) {
    add(value);
  }

  public T set(int index, T value) {
    T removed = remove(index);
    add(value);
    return removed;
  }
}
