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
    * Compares the value to be added to the middle value
      * If the value is smaller than the middle value, then `high` takes on the value of `mid` - 1, effectively changing the middle value to something smaller
      * If the value is bigger than the middle value, then `low` takes on the value of `mid` + 1, changing the middle value to something bigger
      * Everytime the while loop runs, the `mid` value takes on the value of `low + high / 2` to find the new middle index
 * ### void addLinear()
    * Use linear search to add the value at the right index
