# Programming Fundamentals I - Fall 2025

## Lab Assignment #6: Random Median

*Due at 11:59 pm the night before the next lab session*

---

## Purpose

Data analysts want to prepare some random samples around the median (middle) value of a range. You are tasked with preparing the initial code for this application. This program focuses on the following concepts:

• Using `Math.random()` to generate numbers in any range

---

## In-Class 6

Let's consider a simpler case first. Suppose the user wants to generate a random number by specifying the smallest and largest possible values within that range.

Write a program that allows the user to choose two integers: the first input specifies the smallest possible random value, and the second input specifies the largest possible random value. Use those two numbers to determine the amount to multiply by and the amount to add to properly generate a random number in the user's requested range.

---

## Task

Create a project called `RandomMedian_FirstName_LastName` or `Lab6_FirstName_LastName`. Remember to include comments summarizing the program.

### Requirements

1. **Declare a Scanner** that accepts input from the keyboard.

2. **Declare the following four variables** in your program:

   • A variable of type `double` that will hold the median of the range

   • A variable of type `int` that will hold the size of the range

   • A variable of type `int` that will hold the amount to shift the randomly generated range

   • A variable of type `int` that will hold the final randomly generated number

   *Note: This set of variables is only a recommendation. You may include additional variables or remove variables as needed.*

3. **Include a prompt** to the user to input the median of the range. Use the appropriate method of the Scanner class to assign the user's input to the appropriate variable.

4. **Include a second prompt** to the user to input the size of the range. Use the appropriate method of the Scanner class to assign the user's input to the appropriate variable.

5. **Use the user's two inputs** to calculate the amount to shift the randomly generated range. Keep in mind that this shift will also be equal to the smallest possible random value. Make sure these calculations account for both an even range and an odd range.

6. **Calculate the final randomly generated number** using the result of `Math.random()`, the size of the range, and the amount to shift.

7. **Print the randomly generated number** to the console.

---

## Assumptions

Assume the user provides valid inputs. For consecutive numbers, the median must either be an integer or .5 value, such as 1.5, 2.5, etc. If the user provides an integer, the size of the range must be an odd number. If the user provides a .5 value, the size of the range must be an even number.

### Example Cases and Program Flow

**Case 1:** The user enters 9 for the median and 3 for the size. The following is the range of possible outputs:
```
8, 9, 10
```
The following is the program flow for this program:
```
Please enter the median for this random range: 9
Please enter the size of this random range: 3
The random number is 8
```

**Case 2:** The user enters 13.5 for the median and 4 for the size. The following is the range of possible outputs:
```
12, 13, 14, 15
```
The following is the program flow for this program:
```
Please enter the median for this random range: 13.5
Please enter the size of this random range: 4
The random number is 12
```
 
**NOTE:** Keep in mind the result is randomly generated, so the output may differ on each run of the program.

## Grading Criteria

- **Comment summarizing the program** (5 points)
- **Importing and declaring the Scanner** (5 points)
- **Appropriate variable declarations** (15 points total)
- **Two requests for user input** (5 points each, 10 points total)
- **Correctly calculating the shift for the random number** (40 points)
- **Correctly calculating the randomly generated number** (15 points)
- **Output of the result** (10 points)

**Total: 100 points**

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

**InClass6_FirstName_LastName.java (Participation points):**
Full credit is awarded for completing and submitting the in-class exercise, regardless of output or minor errors.

**Excellent work!** You've reached Lab 6, and this assignment introduces you to the powerful world of random number generation with `Math.random()`. This lab challenges you to think mathematically about ranges, medians, and how to transform random values to fit specific requirements. Working with both integer and decimal medians will stretch your problem-solving skills and deepen your understanding of data types and calculations. Remember, every programmer has wrestled with mathematical logic—embrace the challenge, break down the problem step by step, and don't hesitate to test your code frequently. You're building the foundation for more advanced programming concepts!

**Important:** This lab template includes `InClass6_FirstName_LastName.java` with helpful comment guidance to get you started. Focus on completing both the in-class exercise and the main lab assignment. Do NOT edit or tamper with any test files if they appear in your repository. These files are used for autograding and checking your work.