<p align="center">
  <img src="https://cdn.discordapp.com/attachments/878465038346747935/919278794643210291/Team_Incredibly_Cohesive.png" />
</p>

<div align="center">
  <h1> David Chen, Jaylen Zeng, Orion Roven <h1>
</div>

## ALTester
The `test` method iterates through a given `ArrayList` and compares the number at index `i` with the number at index `i+1`. If the number at index `i` is greater than the number at index `i+1`, then the method returns false. After the iteration is done, and `i < list.size()-1`, the method will return true.

## OrderedArrayList
 * ### String toString()
    * Clarification: Private instance of `ArrayList<Integer>` is called _list
    * Returns the value returned by `_list_.toString()`
 * ### void addBinary()
    * Use binary search to find the right index to add value
    * If the value is equal to the middle value, then add it at the middle index
    * If the value is less than the middle value, eliminate the other half of the list
    * If the value is greater than the middle value, eliminate the lower half of the list
    * The while loop continues until `low` is greater than `high`
    * If the while loop exits, then add the value at `low` index
 * ### void addLinear()
    * Use linear search to add the value at the right index
 * ### Integer get(int index), Integer remove(int index), Integer size()
    * Built-in ArrayList methods reimplemented in order to be functional with objects of OrderedArrayList.
    * Retains all functionality of original methods by simply calling the original ArrayList method.
