
##  Java Stdin and Stdout I

Most HackerRank challenges require you to read input from  [stdin](https://en.wikipedia.org/wiki/Standard_streams#Standard_input_.28stdin.29)  (standard input) and write output to  [stdout](https://en.wikipedia.org/wiki/Standard_streams#Standard_output_.28stdout.29)  (standard output).

One popular way to read input from stdin is by using the  [Scanner class](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)  and specifying the  _Input Stream_  as  _System.in_. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);

The code above creates a  _Scanner_  object named  **Scanner** and uses it to read a  _String_  and an  _int_. It then  _closes_  the  _Scanner_  object because there is no more input to read, and prints to stdout using  _System.out.println(String)_. So, if our input is:

```
Hi 5

```

Our code will print:

```
myString is: Hi
myInt is: 5

```

Alternatively, you can use the  [BufferedReader class](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html).

**Task**  
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

**Input Format**

There are  lines of input, and each line contains a single integer.

**Sample Input**

```
42
100
125

```

**Sample Output**

```
42
100
125
```