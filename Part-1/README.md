# Java-Programming
CSE1007 Java Programming Codes

1) Write a program that uses println() to produce this pattern:

 '__' <br>
 (@@) <br>
 /========\/ <br>
 / || %% || <br>
 * ||----|| <br>
 ¥¥ ¥¥ <br>
 "" "" <br>
 
2) Write a program to read the first and last name from the user through command line
arguments and display a greeting message.
Example

Hello!
 FirstName LastName
 Good Morning.. Welcome to "Java Lab" :)
 
3) Write a program to read the First name and Last name of a person, his weight and
height using command line arguments. Calculate the BMI Index which is defined as
the individual's body mass divided by the square of their height.

Underweight <18.5
Normal (healthy weight) 18.5 to 25
Overweight 25 to 30
Obese Over 30

Display the name and display his category based on the BMI value thus calculated.

4) Write a program to continuously read input values from the user. The program
should terminate if exactly three String values have been inputted. Display the count
of integer values and float values entered so far. Also display the average of all
integer values and all float values individually.

5) Write a program to define a static method sum_Squares( ) to find the sum of the
squares of the first 'n' natural numbers and a non-static method square_Sum( ) to
find the square of the sum of those 'n' natural numbers. Invoke these methods from
main( ) method to evaluate the difference between the values returned by them.

6) Write a program called NumberGuess to play the number guessing game. The
program shall generate a random number between 0 and 99. The player inputs
his/her guess and the program shall response with "Too higher", "Too lower" or
"Congratulations! You got it.." accordingly.

7) Write a program to generate the Tribonacci sequence.
(Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci numbers,
except that a number is formed by adding the three previous numbers, i.e.,
T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2.)

8) Write a program to display the Hailstone sequence for a given number. Also display
the total count of numbers in the sequence.
(There is a sequence of numbers in mathematics that is sometimes known as the
hailstone sequence. The German mathematician, Lothar Collatz, proposed that for
any number it's possible to make a sequence of numbers that will eventually end in
one by following a simple rule; if the number is even halve it by two, if it's odd
multiply it by three and add one (e.g., starting with the number 5 the sequence
would be 5 16 8 4 2 1).)

9) Write a program to print the following patterns using loops.

a)
 1
 1 2 1
 1 2 3 2 1
 1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1

b)
 1 2 3 4 5 6 7
 2 3 4 5 6 7
 3 4 5 6 7
 4 5 6 7
 5 6 7
 6 7
 7
 6 7
 5 6 7
 4 5 6 7
 3 4 5 6 7
 2 3 4 5 6 7
 1 2 3 4 5 6 7 

10) The following list gives the amount of rainfall (in cms) recorded at a particular place
for 12 months.
10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.

Store these values in an array. Find the average rainfall and display the count of the
number of months in which the rainfall is more than the average.

11)If there are 4 batches in BTech learning ‘CSE1007’ course, read the count of the
slow learners (who have scored <25) in each batch. Tutors should be assigned in the
ratio of 1:4 (For every 4 slow learners, there should be one tutor). Determine the
number of tutors for each batch. Create a 2-D jagged array with 4 rows to store the
count of slow learners in the 4 batches. The number of columns in each row should
be equal to the number of groups formed for that particular batch 

( Eg., If there are
23 slow learners in a batch, then there should be 6 tutors and in the jagged array,
the corresponding row should store 4, 4, 4, 4, 4,3). Use for-each loop to traverse
the array and print the details. Also print the number of batches in which all tutors
have exactly 4 students.

12) Create a class Film with string objects which stores name, language and lead_actor
and category (action/drama/fiction/comedy). Also include an integer data member
that stores the duration of the film. Include parameterized constructor, default
constructor and accessory functions to film class. Flim objects can be initialized either
using a constructor or accessor functions. Create a class FilmMain that includes a
main function. In the main function create an array of objects that stores the
information about the film. Also write suitable methods to display the following
a. The English film(s) that has Arnold as its lead actor and that runs for shortest
duration.
b. The Tamil film(s) with Rajini as lead actor.
c. All the comedy movies.

13) Create a class StudentGrade with member –
determineGrade( ) that accepts register number (String) and marks (float-type) of a
student in all courses he has registered for a particular semester. If the length of
marks is 0 display – "You have not registered for any course" else the method should
display the mark and the grade obtained in each course and a count of 'S' grade.
Note: The method should accept variable length argument for marks, because
one student might have registered only for 5 courses, the other for 7 courses and
so on.

Use the following criteria to determine the grade
Mark between 90.0 and 100.0 - Grade 'S'
 between 80.0 and 89.0 - Grade 'A'
 between 70.0 and 79.0 - Grade 'B'
 between 60.0 and 69.0 - Grade 'C'
 between 55.0 and 59.0 - Grade 'D'
 between 50.0 and 54.0 - Grade 'E'
 less than 50.0 – Grade 'F'
Create a main class that calls the above method for 5 students. 

14) Write a program to demonstrate the knowledge of students in String handling.
Eg., Write a program to read a chemical equation and find out the count of the
reactants and the products. Also display the count of the number of molecules of
each reactant and product.

Eg., For the equation, 2NaOH + H2SO4 -> Na2SO4+ 2H2O, the O/P should be as
follows.
 Reactants are 2 moles of NaOH, 1 mole of H2SO4.
 Products are 1 mole of Na2SO4 and 2 moles of H2O.

15) Write a program to demonstrate the knowledge of students in advanced concepts of
Java string handling.

Eg., (Bioinformatics: finding genes) Biologists use a sequence of letters A, C, T, and
G to model a genome. A gene is a substring of a genome that starts after a triplet
ATG and ends before a triplet TAG, TAA, or TGA. Furthermore, the length of a gene
string is a multiple of 3 and the gene does not contain any of the triplets ATG, TAG,
TAA, and TGA. Write a program that prompts the user to enter a genome and
displays all genes in the genome. If no gene is found in the input sequence, displays
no gene. Here are the sample runs:
Enter a genome string: TTATGTTTTAAGGATGGGGCGTTAGTT
O/P: TTT
 GGGCGT

16) Write a program to demonstrate the knowledge of students in creation of abstract
classes and working with abstract methods.

Eg., Define an abstract class ‘Themepark’ and inherit 2 classes ‘Queensland’ and
‘Wonderla’ from the abstract class. In both the theme parks, the entrance fee for
adults is Rs. 500 and for children it is Rs. 300. If a family buys ‘n’ adult tickets and ‘m’
children tickets, define a method in the abstract class to calculate the total cost. Also,
declare an abstract method playGame() which must be redefined in the subclasses.
In Queensland, there are a total of 30 games. Hence create a Boolean array named
‘Games’ of size 30 which initially stores false values for all the elements. If the player
enters any game code that has already been played, a warning message should be
displayed and the user should be asked for another choice. In Wonderla, there are a
total of 40 different games. Thus create an integer array with 40 elements. Here, the
games can be replayed, until the user wants to quit. Finally display the total count of
games that were repeated and count of the games which were not played at all.

17) Write a program to demonstrate the knowledge of students in working with
Inheritance. Create classes to implement the following hierarchy.

Bill
In_Patient
Patient

Include data members and member functions as given in the table below.
Class Data Members Member Functions
Patient ; Patient ID, Patient Name, Age, Gender,Address, and Mobile Number. ; getData( ), displayData( )
In_Patient ; Room Number, Consultation Fee, TestFee, Data of Admission, Date ofDischarge, Number of Days, Room Rent Per Day ; 
getData( ) , displayData( )
Bill ; Date of Bill, Total_Amount ; getData( ), displayData( ), calculateTotalBillAmount( )

18) Write a program to demonstrate the knowledge of students in working with
interfaces. To encrypt the given text message.
- Interface 'EncryptDecrypt' with encrypt( ) and decrypt( ) methods.
- A class 'SpaceElimination' to remove the spaces in between the words of
the given text message.
- Class 'CaeserCipher' that extends 'SpaceElimination' and implements
'EncryptDecrypt' interface.
This class uses an encryption technique, where each letter in the given
text is replaced with the letter standing three places further down the
alphabet. The decryption is the reverse.
Example:
Plaintext : abcde
Encrypted Text: defgh

19) Write a program to demonstrate the knowledge of students in working with userdefined packages and sub-packages.
Eg., Within the package named ‘primespackage’, define a class Primes which includes a
method checkForPrime() for checking if the given number is prime or not. Define
another class named TwinPrimes outside of this package which will display all the pairs
of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin
prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the
checkForPrime() method in the Primes class.
