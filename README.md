## In-Class 5: Decimal to Hexadecimal Digit Converter

**You must finish the code in `InClass5_FirstName_LastName.java` and add detailed comments throughout your program to explain what each part is doing.**

### Instructions

1. Write a program that prompts the user to enter a single integer value from 0 to 15.
2. Use a `switch` statement to convert the decimal value to its hexadecimal equivalent (0-9, A-F).
3. Print the hexadecimal value to the console.
4. **Add detailed comments throughout your code** to explain each step, including:
   - What the program does overall (at the top)
   - What each variable is for
   - What each section of logic is doing (input, conversion, output)
   - Why you use a `switch` statement for this task


---

🚦 **STOP! Checkpoint** 🚦

Before you go any further, take a moment to **commit and sync your work so far** to reflect your In-Class 5 work.

Not sure how? Skip to the "Commit Your Changes" instructions at the end of this document!

---

**You will receive full participation credit for completing and submitting this in-class exercise, but your code must be finished and clearly commented.**


---

# Lab 5: Color Code Hexadecimal Converter

*For this week only, Lab 5 is due on Tuesday (9/30) at 11:59 p.m. for BOTH Tuesday (62L) and Wednesday (60L) students*

## Purpose

A graphics designer needs software to prepare a color palette. Part of this preparation is indicating the amount of red, green, and blue being used for a specific color. Colors may be represented as sequences of hexadecimal (base 16) digits, so these values need to be calculated from decimal (base 10) numbers. This lab focuses on:

- Using logical operators and if statements to check multiple conditions
- Using switch statements to select one of many options

---

## Task

Create a new Java file titled `ColorCode_FirstName_LastName.java` or `Lab5_FirstName_LastName.java`. You must include comments summarizing the program.


### Steps

1. Make sure the initial code of your application is prepared to write statements in the main method.
2. Declare a Scanner that accepts input from the keyboard.
3. Declare the following five variables:
   - A variable of type `int` that will hold the user’s input
   - A variable of type `int` that will hold the result of dividing this input by 16
   - A variable of type `int` that will hold the result of performing mod 16 on this input
   - A variable of type `String` that will hold the most significant digit
   - A variable of type `String` that will hold the least significant digit
4. Prompt the user to enter the amount of red as an integer from 0 to 255. Use the appropriate method of the Scanner class to assign the user’s input to the appropriate variable.
5. Use a logical operator within an if statement to check that the number is between 0 to 255, inclusive.
   - If the number is, proceed with the remaining steps within this if block.
   - Else, the number is not valid. Print a statement to the console indicating the user provided an invalid input.

For **Steps 6 and 7**, use the following table to determine the hexadecimal equivalent for each decimal value:

**For Steps 6 and 7, you MUST use a `switch` statement to convert decimal values to their hexadecimal equivalents.**

💡 **Hint:** Think about how you handled the InClass exercise for converting a single digit to hexadecimal. Is there a way to use the `default` case in your `switch` statement to handle all the values from 0 to 9 at once? Try to figure out how this can make your code more concise!

Refer to this table for your switch cases:

| Decimal | Hexadecimal |
|---------|-------------|
| 0       | 0           |
| 1       | 1           |
| 2       | 2           |
| 3       | 3           |
| 4       | 4           |
| 5       | 5           |
| 6       | 6           |
| 7       | 7           |
| 8       | 8           |
| 9       | 9           |
| 10      | A           |
| 11      | B           |
| 12      | C           |
| 13      | D           |
| 14      | E           |
| 15      | F           |

6. The hexadecimal value will consist of two digits. To get the first digit (the most significant digit), divide the user’s input by 16 using integer division.
   - Use a `switch` statement to convert the result (0–15) to its hexadecimal character (0–9, A–F) and assign it to the String for the most significant digit.
7. To get the second digit (the least significant digit), perform a modulo operation with 16 on the user’s input.
   - Again, use a `switch` statement to convert the result (0–15) to its hexadecimal character (0–9, A–F) and assign it to the String for the least significant digit.
8. Print the amount of red as a hexadecimal value to the console.

#### Example Program Flows

If the user enters 175 as the decimal value:
```
Please enter the amount of red (0-255): 175
The hexadecimal value is: AF
```

If the user enters 289 as the decimal value:
```
Please enter the amount of red (0-255): 289
Invalid input: value must be between 0 and 255.
```

Test your program with a variety of values (0, 15, 16, 255, etc.) to ensure it works for all valid and invalid cases. Try to predict the hexadecimal output and check your logic!


---

## Grading Criteria

- Comment summarizing the program (5 points)
- Importing and declaring the Scanner (3 points)
- Appropriate variable declarations (12 points total)
- Request for the user’s input (5 points)
- Validating the user’s input (10 points)
- Correctly calculating the hexadecimal value (60 points):
   - Division operation (5 points)
   - Determining the most significant digit (25 points)
   - Modulo operation (5 points)
   - Determining the least significant digit (25 points)
- Printing the output (5 points)


---

💡 **Fun Tip:** Consider taking a screenshot of your terminal output after running your program! Then, try to figure out how to add that screenshot file to your repository directory as part of your lab submission. (This is a great way to document your work and practice using GitHub for more than just code!)

---

## Commit Your Changes
### Step 1. Use VS Code's Source Control panel:
   - Click the Source Control icon in the left sidebar
   - Type a commit message describing your changes
   - Click "Commit" then "Sync Changes" to push your code

### Step 2: Verify Submission
After pushing your changes, visit your assignment repository on GitHub Classroom. Confirm that your latest code and commit message appear, and that your files are named correctly. 

### Step 3: Submit to Blackboard Assignment
Once you have verified your submission on GitHub Classroom, copy the URL of your assignment repository and submit this GitHub repository link to Blackboard as confirmation that you are DONE.

**InClass5_FirstName_LastName.java (Participation points):**
Full credit is awarded for completing and submitting the in-class exercise, regardless of output or minor errors.

**Keep going!** By Lab 5, you’re advancing your skills and showing real growth in programming logic and problem-solving. You’ve moved beyond the basics—now is the time to challenge yourself, experiment, and refine your approach. Trust your abilities, keep practicing, and take pride in your progress. If you encounter obstacles, use them as opportunities to learn and improve. Each lab is a step forward in your journey to becoming a confident, independent programmer. Stay curious, keep asking questions, and celebrate how far you’ve come!

**Important:** Do NOT edit or tamper with any test files (such as Lab5Test.java or InClass5Test.java). These files are used for autograding and checking your work. In future labs, if test files appear to be modified, you may be contacted to verify the integrity of your submission.