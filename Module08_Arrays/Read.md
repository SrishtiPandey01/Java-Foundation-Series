# Module 8 — Arrays

This module introduces arrays in Java and covers the most common operations and interview problems involving arrays.

## Topics Covered

- What is an array?
- Why arrays are used
- Array declaration
- Array initialization
- Array indexing
- Array length
- Array traversal
- Taking array input
- Printing arrays
- Sum and average
- Maximum and minimum
- Searching
- Linear search
- Binary search
- Reversing arrays
- Copying arrays
- Comparing arrays
- Counting elements
- Second largest and second smallest
- Duplicate elements
- Frequency of elements
- Missing number
- Moving zeros
- Merging arrays
- Common elements
- Array rotation
- Sorting
- Bubble sort
- Selection sort
- Insertion sort
- Two-dimensional arrays
- Matrix operations
- Jagged arrays
- Useful `Arrays` class methods

---

# What is an Array?

An array is a fixed-size collection of elements of the same data type.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

The array contains five integers.

---

# Array Index

Array indexing starts from `0`.

For:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

The indexes are:

```text
Index:   0   1   2   3   4
Value:  10  20  30  40  50
```

Therefore:

```java
numbers[0] = 10;
numbers[2] = 30;
numbers[4] = 50;
```

---

# Array Declaration

```java
int[] numbers;
```

Another valid syntax:

```java
int numbers[];
```

The first style is generally preferred.

---

# Array Creation

```java
int[] numbers = new int[5];
```

This creates an integer array with five elements.

Default values for an `int` array are:

```text
0 0 0 0 0
```

---

# Array Initialization

You can initialize an array directly:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

# Array Length

Use the `length` property:

```java
numbers.length
```

Example:

```java
System.out.println(numbers.length);
```

For the array:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

the output is:

```text
5
```

---

# Traversing an Array

Using a normal `for` loop:

```java
for (int i = 0; i < numbers.length; i++)
{
    System.out.println(numbers[i]);
}
```

Using an enhanced `for` loop:

```java
for (int number : numbers)
{
    System.out.println(number);
}
```

---

# Important Array Properties

| Property                    | Description                           |
| --------------------------- | ------------------------------------- |
| Fixed size                  | Size cannot be changed after creation |
| Same type                   | Elements have the same declared type  |
| Zero-based index            | First element is at index `0`         |
| `length`                    | Gives number of elements              |
| Contiguous logical sequence | Elements are accessed through indexes |

---

# Common Array Operations

Typical operations include:

- Traversal
- Searching
- Updating
- Inserting
- Deleting
- Sorting
- Reversing
- Copying
- Comparing
- Finding duplicates
- Counting frequency
- Finding maximum/minimum

---

# Linear Search

Linear search checks elements one by one.

Example:

```java
static int search(int[] arr, int target)
{
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == target)
        {
            return i;
        }
    }

    return -1;
}
```

Time complexity:

```text
O(n)
```

---

# Binary Search

Binary search works on a sorted array.

It repeatedly divides the search range into two parts.

Time complexity:

```text
O(log n)
```

---

# Sorting

Sorting arranges elements in a particular order.

Ascending:

```text
1 2 3 4 5
```

Descending:

```text
5 4 3 2 1
```

This module covers:

- Bubble Sort
- Selection Sort
- Insertion Sort

---

# Two-Dimensional Arrays

A two-dimensional array can be visualized as rows and columns.

Example:

```java
int[][] matrix =
{
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Representation:

```text
1 2 3
4 5 6
7 8 9
```

Access:

```java
matrix[0][0]
```

gives:

```text
1
```

---

# Jagged Array

A jagged array is a two-dimensional array where different rows can have different lengths.

Example:

```java
int[][] arr =
{
    {1, 2},
    {3, 4, 5},
    {6}
};
```

---

# Important `Arrays` Class

Java provides the `java.util.Arrays` class.

Example:

```java
import java.util.Arrays;
```

Useful methods include:

```java
Arrays.toString()
Arrays.sort()
Arrays.copyOf()
Arrays.equals()
Arrays.fill()
Arrays.binarySearch()
```

---

# Learning Outcome

After completing this module, you should be able to:

- Create arrays.
- Initialize arrays.
- Access array elements.
- Traverse arrays.
- Take array input.
- Find maximum and minimum values.
- Calculate sum and average.
- Search elements.
- Reverse arrays.
- Copy arrays.
- Compare arrays.
- Find duplicates.
- Count frequencies.
- Find missing numbers.
- Rotate arrays.
- Merge arrays.
- Sort arrays.
- Work with 2D arrays.
- Perform matrix operations.
- Understand jagged arrays.
- Use the Java `Arrays` utility class.
