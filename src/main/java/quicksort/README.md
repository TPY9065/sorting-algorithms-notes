# Quick Sort

1. choose a value to act as a pivot
2. create 2 pointers, `li` and `ri` which points to the first and the last value in the remaining values
3. compare `li` and `ri` with pivot
   1. case 1: `li` > pivot and `ri` < pivot, swap the value of `li` and `ri`, then move `li` and `ri` to the next value
   2. case 2: `li` < pivot and `ri` <= pivot, move `li` to the next value 
   3. case 3: `li` <= pivot and `ri` > pivot, move `ri` to the next value
4. repeat step 3 until `li` > `ri`
5. swap the pivot value with `li` (only if the first or last value is chosen as pivot)
6. repeat step 1 - 5 on sub-arrays of left and right side of pivot value