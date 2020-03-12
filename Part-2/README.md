Practice Problems

Exception Handling & Multithreading

1. Write a program to demonstrate the knowledge of students in Java Exception handling.

Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not
contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters,
throw an IllegalArgumentException. If the Mobile Number contains any character other than a
digit, raise a NumberFormatException. If the Register Number contains any character other than
digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’
else ‘invalid’.

2. Write a program to demonstrate the knowledge of students in Java Exception handling.
Create a class by name Employee with members – Employee ID, Name and year of birth. The
Employee ID is a string that contains the ID in the format year-designation-number. The year is
represented with the last two digits. The designation is a single letter code - 'F' for faculty and
'S' for staff. The number is a 3 digit number.
(Example: 81-F-112 79-S-254)

Write a program to read the employee details and validate the employee code. If the employee
code is incorrect throw a user-defined exception "InvalidEmployeeCode" else create the
Employee object and display the details of the employee.

3. Write a multithreaded program by creating 2 threads in which one thread will display Fibonacci
numbers up to 'n' and another thread will display the factorial of 'n'.

4. Write a program to demonstrate the knowledge of students in multithreading.
Eg., Three students A, B and C of B.Tech-IT II year contest for the PR election. With the total
strength of 240 students in II year, simulate the vote casting by generating 240 random numbers
(1 for student A, 2 for B and 3 for C) and store them in an array. Create four threads to equally
share the task of counting the number of votes cast for all the three candidates. Use
synchronized method or synchronized block to update the three count variables. The main
thread should receive the final vote count for all three contestants and hence decide the PR
based on the values received.

5. Write a multi-threaded program to print all numbers below 100,000 that are both prime and
fibonacci number (some examples are 2, 3, 5, 13, etc.). Design a thread that generates prime
numbers below 100,000 and writes them into an array list. Design another thread that generates
fibonacci numbers and writes them to another array list. The main thread should read both the
array lists to identify numbers common to both and display them.

6. Write a program to implement producer-consumer problem.

7. Write a program to copy the contents of one file into another file using File I/O Streams.

8. Write a program to demonstrate the knowledge of students in File handling.

Eg., Define a class ‘Donor’ to store the below mentioned details of a blood donor.
Name, age, Address, Contactnumber, bloodgroup, date of last donation
Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file.
Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’
and had not donated for the recent six months. 

9. Write a generic method to determine the maximum element in an array. The generic method
should take values of Inter and Float.

10. Write a program to demonstrate the knowledge of students in working with Java collection
framework. Create two Array Lists that takes Integers and compare them.

11. Write a program to demonstrate the knowledge of students in working with Java collection
framework.

Create a class by name Book with members – Book ID, Name, Author, Publisher, a default and
parameterized constructor. Create 'n' objects of Book class and add them to a LinkedList. Allow user to
search for a book based on author or publisher and display the corresponding details.

12. Write a program to demonstrate the knowledge of students in working with Java collection
framework.
Eg., Assume only a maximum of 3 courses can be registered by a student for week end semester
classes. Create a hashmap ‘h1’ with ‘n’ key-value pairs where keys are the names of students and
values are the courses registered by them. Create another hashmap ‘h2’ with ‘m’key-value pairs
where keys are the names of courses offered for B.Tech-IT and values are the names of faculty
handling the courses. Write appropriate code to
- Add or remove a student from h1
- Iterate over the maps and display the key-value pairs stored in them
- Given a student name, fetch the names of all those who teach him/her.

Eg:, if the elements of h1 are
Stud
name
Courses registered
A Python, maths, c
B c, c++
C C++, physics,chemistry

And if the elements of h2 are
Course name Faculty
Python 111
Maths 222
C 333
C++ 444
Physics 555
Chemistry 666
Digital
electronics
777
For the student “B”, faculty should be displayed as 333 and 444. 
