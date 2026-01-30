[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/UnCR-Esz)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22445308)
# ECM1410-Workshop03-Instructions

**UPDATE 29th Jan 2026** 

Tests are now available to check that your java code works correctly. If you do not have a `tests` folder in your repository please commit and push any files you are working on, then enter the following git commands in the terminal to pull them from the template repository:

First try the following and see if it picks up the tests directory.

```
git pull --rebase
```

If not run the following:

```
git remote add ecm1410w3 https://github.com/My-UofE/ecm1410-object-oriented-programming-24-25-workshop-03-Workshop-3
git fetch ecm1410w3
git merge ecm1410w3/main -m 'added tests'
git push
```


To run the tests please enter the following command in your working directory (i.e. the one which contains your `.java` files:

```
./tests/test_all.sh | tee results.txt
```

This will display the results (and also save a copy in file `results.txt`).



## Task A: `DemoIncrement.java`

In this task we will explore the behaviour of the increment operators `i++` and `++i`.

Look at the following code. 

```java
public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;

        System.out.print("a: " + a);
        System.out.print(", b: " + b);
        System.out.print(", x: " + x);
        System.out.println(", y: " + y);

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means xxxxx-increment");
        System.out.println("++i means xxxxx-increment");
    }
}
```

Predict what values will be stored in `a` `b` `x` `y` after the program runs.

**1.** Copy the code into file `DemoIncrement.java`, compile and run it.

Did it behave as you expect?

**2.** Complete the last two printed lines by replacing `xxxxx` with the correct terms.

**3.** Add in the extra lines of code below the line `int y = ++x + 5;`

```java
int p = 3;
++p;
int q = p + 5; 
```

Now add code so that these terms are displayed alongside the others, so the the program outputs a string in the format:

```
a: _, b: _, x: _, y: _, p: _, q: _
```

**4.** Predict what the output will be if you change `++p` to `p++`. 

Make this change and check if you were correct.



**5.** When you have your code working commit your code and sync to your GitHub classroom repository with the commit message:

```
DemoIncrement completed
```

**Note** When you have completed this task, the expected output of `DemoIncrement.java`
is three lines in the following format:

```
a: _, b: _, x: _, y: _, p: _, q: _
i++ means xxxxx-increment
++i means xxxxx-increment
```

where the keywords *pre* and *post* are inserted into the correct positions of lines 2/3. 

## Task B: Exploring the ternary operator `AgeToGroup.java`

The following examples demonstrate the ternary operator:

`( -condition- )? -value-if-true- : -value-if-false-` 

Example 1: 

Code to recitify the value of `x` i.e. the value of `x` is set to zero if it is negative, but unchanged otherwise.

```
x = (x>0)?x:0
```

Example 2: 

Code that sets `y` to be 1 if `x` is below 100, and zero otherwise.

```
int y = (x<100)?1:0;
```

Example 3: 

Suppose `day` stores 0 for Sunday, 1 for Monday ... 6 for Saturday. 

The code below is a nested ternary operator that sets `isWeekend` to be 1 if `day` is `0` or `6`.

```
int isWeekend = (day==0)?1:(day==6)?1:0
```

**1.** Below is a function that takes an input age processes this value so that:

 - if it is 18 or less it returns 0
 - if it is greater than 18 but less than 65 it returns 1
 - if it is greater than 65 it returns 2

```
public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        int ageGroup = 1;
        if (age<=18) 
            ageGroup = 0;
        
        if (age>=65) 
            ageGroup = 2;       
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}
```

Copy this code into a file names `AgeToGroup.java` and test it works as it should, e.g. run

```
java AgeToGroup 70
```

**2.** Rewrite this code to use ternary operators (i.e. it does not use `if` commands). 

Check your function works for all valid ages (e.g. try examples from range 0-120).

**3.** Once you have your code working, make a commit of the `AgeToGroup.java` with the commit message:

```
AgeToGroup completed with ternary operator
```



## Task C: `NumbersInSpanish.java`

**1.** Create a file called `NumbersInSpanish.java`, and start with the following template code:

```java
public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
 
       // delete the line below and replace with your code
       System.out.println(number);
    }
 }
```

**2.** We want this function to take an input integer in the range 1-5 and display that print the number in Spanish:

 - 1: `uno`
 - 2: `dos`
 - 3: `tres`
 - 4: `cuatro`
 - 5: `cinco` 

If the input integer is outside the range 1-5 your code should display the message (`Sorry I do not know that!`). 

Write code to do this that uses a `if` - `else if` - `else` code block.

An example code structure is provided below:

```java
if (number == 1) {
         System.out.println("uno");
} else if ( ...... ) {
   ......
} else if ( ...... ) {
   ......
   ......
   ......
} else {
  // handle case that number was not in range 1-5
  ....
}
```

Check your program runs, but compiling it and running it via the terminal:

```
java NumbersInSpanish 5
```

produces output:

```
cinco
```

**3.** Once you have your code working, make a commit of the `NumbersInSpanish.java` with the commit message:

```
NumbersInSpanish completed with if - else if - else
```

**4.** Working in the same file, edit your code so it instead uses `switch`-`case` commands. 

You can see an example structure for this below:

```java
// Using switch
     switch(number) {
        case 1:
           System.out.println( ...... ); break; // don't forget the break after each case!
        case 2:
           System.out.println( ...... ); break;
        ......
        ......
        default: System.out.println( ...... );
}
```

Once you have done this, recompile and test your program to check it still works as expected.

**5.** To explore the behaviour of the `switch`-`case` code block, edit the code to delete the `break` commands.

Now recompile the code and examine the behaviour for different numbers.

Check you understand the different behaviours (with and without the `break` commands).

Once you have done this put in place the version that is appropriate for this task.

**6.** When you are happy that you have your code working, make a commit of the `NumbersInSpanish.java` with commit message:

```
NumbersInSpanish completed with switch-case
```

## Task D: `PrintSquares.java`

**1**. Use the following code as a starting template for a java program called `PrintSquares.java`

```
import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
    }
}
```

Compile and run the program.

This template code shows how we can accept and process user input while the code is running.

Here we use the `Scanner` class included as part of the `java.utils` library to handle the collection of data from the **standard input** stream, i.e. what the user types in the keyboard. 

We create an instance of the Scanner class connected to standard input with variable name `in`. 

We can then use functions from the library `in.nextLine()` and `in.nextInt()` that connect to the standard input and will pause the execution of the code until the requested data has been collected.

Note that if the standard input already contains uncollected data, the commands will read in from the data already entered into the standard input.

e.g. Suppose you run the code, and when the program asks for the start value you enter two values `5 7` .

When `int startNum = in.nextInt();` is called, it will collect the first int `5` but leaves the `7` uncollected.

When `int endNum = in.nextInt();` is called, the program will then collect the `7` that remains uncollected, without asking the user for a new number.

In most cases this behaviour might be unwanted. A way to help prevent this in this case is to place a scanner call `in.nextLine();` after collecting the first integer. 

This will collect (and clear) any pending data that is as yet uncollected, so the feed it ready for new input.

e.g.

```java
System.out.print("Enter a number: ");
// try to collect an integer value from standard input, waiting for data entry if necessary
int number1 = in.nextInt();
// clear any additonal text that remains uncollected 
in.nextLine();

System.out.print("Enter another number: ");
int number2 = in.nextInt();
```

**2.** Comment out the lines that request and print the users name.  Add a call to `in.nextLine();` and check that only the first value entered is utilised.

**3.** We want our program to use a `for` loop, so that it runs from the start value up to the end value (both integers) and displays the sequence of square numbers:

e.g. for start value `2` and end value `7` the program should output:

```
Sequence of squares from 2 to 7:
4 9 16 25 36 49
```

Hint. The following code provides a reminder of the structure to use when defining a `for` loop:

```
for (int i = 0; i < n; ++i) {
         System.out.print(i);
}
```

Note. To end the line after the loop ends, we can make a call to `System.out.println();`

**4.** Once your code works, commit your file `PrintSquares.java` with commit message:

```
PrintSquares completed with for loop
```

## Task E: `SumSquares.java`

In this task we want to write a program that sums the sequence of squares between a start and end value.

**1.** In the terminal copy the code from `PrintSquares.java` into a new file `SumSquares.java`. 

```
cp PrintSquares.java SumSquares.java
```

Open this file in the editor, and edit the function name to `SumSquares`.

Change the code so that instead of printing the sequence, it prints the sum of the squares, i.e.

```
Sum of squares from 2 to 7:
139
```

**2.** Once your code works, commit your file `SumSquares.java` with commit message:

```
SumSquares completed with for loop
````

**3.** Edit your code so that it makes use of a `while` loop (instead of using a `for` loop). 

Hint. The following code provides a reminder of the structure to use when defining a `while` loop:

```
int i = 0;
while (i < n) {
    System.out.print(i);
    ++i;
}
```

**4.** Once your code works, commit your file `SumSquares.java` with commit message:

```
SumSquares completed with while loop
````

## Task F: `AverageSquares.java`

In this task we want to write a program that averages the sequence of squares between a start and end value.

Note we must perform the division using `double` and not `int` in order that we get the correct result.

e.g. In java if `a` stores integer 10 and `b` stores integer `3`, then the calculation `a/b` will produce integer 3.

but if `a` and `b` are doubles, then the calculation `a/b` will produce double 3.333333.

**1.** Copy the `SumSquares.java` to file `AverageSquares.java` and adapt the code to correctly calculate the average of the sequence as a double, i.e.

```
Average of squares from 2 to 7:
23.166666666666668
```

Once your code works, commit your file `AverageSquares.java` with commit tag:

```
AverageSquares completed with while loop
````

**2.** Edit your code so that it makes use of a `do-while` loop instead of a `while` loop. 

Hint. The following code provides a reminder of the structure to use when defining a `do`-`while` loop:

```
int i = 0;
do {
    System.out.print(i);
    ++i;
} while (i < n);
```

**3.** Once your code works, commit your file `AverageSquares.java` with commit message:

```
AverageSquares completed with do-while loop
````

## Task G: `PrintPattern1.java` 

**1.** Write a program called PrintPattern1.java that prompts user for the size (a non-negative integer) and prints the pattern as shown:

```
Enter the size: 5

1
12
123 
1234 
12345
```

Hint. Use a nested-loop like the following to iterate over the rows (outer loop) and columns (inner loop)

e.g the one below will print a square grid, and you can adapt this to draw the triangular pattern shown.

```
// Outer loop to print each of the rows
for (int row = 1; row <= size; row++) {
  // Inner loop to print each of the columns of a particular row
  for (int col = 1; col <= size; col++) {
      System.out.print("# ");
  }
  System.out.println("");
}
```

**2.** Once your code works, commit your file `PrintPattern1.java` with commit message:

```
PrintPattern1 completed
````

## Task H: `PrintPattern2.java` 

**1.** Write a program called PrintPattern2.java that prompts user for the size (a non-negative integer between 1-5) and prints the pattern in line with the examples below:


Examples: 

```
Enter the size: 1

11
11
```

```
Enter the size: 2

1221
2332
2332
1221
```

```
Enter the size: 3

123321
234432
345543
345543
234432
123321
```

etc


If the user specifies a number below 1 or above 5 it should display the message `too big!` or `too small!` and prompt until a vaild value is entered.

**2.** Once your code works, commit your file `PrintPattern2.java` with commit message:

```
PrintPattern2 completed
````

#### Note on the PrintPattern2 test

If you find that you are passing the test for PrintPattern2 with an input of 1, but failing for inputs of 3 and 5, please open the `test_08_PrintPattern2.sh` file and ensure the the following edits to add `\n` as indicated:

File: `./tests/test_08_PrintPattern2.sh`

LINE 49: `declare -A pairs=( ["3\n"]="""123321`

LINE 70: `declare -A pairs=( ["5\n"]="""1234554321`






     




     
