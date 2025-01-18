# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains code that attempts to access an array element outside of its valid index range.  The `bugSolution.java` file provides a corrected version.

## Problem

Java arrays are zero-indexed.  Attempting to access an element using an index that is less than 0 or greater than or equal to the array's length will result in an `ArrayIndexOutOfBoundsException`. This exception halts program execution.

## Solution

The solution involves careful index checking to ensure that array access remains within the bounds of the array.

## How to Run

1.  Compile: `javac bug.java`
2.  Run: `java bug` (This will throw the exception)
3. Compile the solution: `javac bugSolution.java`
4. Run the solution: `java bugSolution`