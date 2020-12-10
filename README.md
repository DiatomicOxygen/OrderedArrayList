# OrderedArrayList

We confirmed what we have to do for the assignment (properties of the NoNullArrayList, etc.)
We also asked if the nulls after the size in NoNullArrayList would have to be deleted, we agreed with no (because it will not deal with these values).
We went over the NoNullArrayList quickly because it seemed simple
We then discussed what we would do for the OrderedArrayList
For the first add method, we decided that we would use a helper method which would search for the first item that is greater than the input and it would return the index before. The add method would then call this method and add the new input value at that index and shift all values forward (like in the normal ArrayList).
For the set method, we decided that it would just delete the item at that index (by calling the super.remove(index)) and then we would just call the add method we devised above to add the new value.
We also decided that the constructors would be not much different from the super constructor because it will start at size 0 (since there are no terms) and we won't have to sort anything in the constructor.
 
