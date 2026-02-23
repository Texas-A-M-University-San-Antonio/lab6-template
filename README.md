# Lab 6: Random Number Generation and Median Ranges
**Due Date:** @ 11:59 the night *before* next lab

**Submission:** Push to GitHub repository + Submit link to Blackboard

---

## 📋 Overview
This lab introduces **random number generation** using `Math.random()` and applies it to a practical problem: generating random samples around a median value. You'll learn how to scale and shift random numbers to fit any range, work with median calculations, and handle both integer and decimal medians.

**Learning Objectives:**
- Use `Math.random()` to generate random numbers
- Scale and shift random values to fit any specified range
- Understand and work with median values in number ranges
- Perform mathematical calculations involving mixed data types (`int` and `double`)
- Use casting to convert between numeric types
- Use `Scanner` to read and process user input
- Handle both odd and even range sizes mathematically

---

## 🚀 Getting Started with GitHub Codespaces

### Initial Setup
1. **Accept the assignment** via the GitHub Classroom link provided
2. **Open your repository** in GitHub Codespaces:
   - Click the green "**Code**" button
   - Select "**Codespaces**" tab
   - Click "**Create codespace on main**"
3. **Wait for the environment to load** (this may take 1-2 minutes on first launch)
4. **Explore your workspace** - On the left side, you'll see the file explorer with:
   - `README.md` (this file)
   - `InClass6_FirstName_LastName.java` - for your in-class activity
   - Other supporting files

**Note:** You will create the `Lab6_FirstName_LastName.java` file yourself. Update all filenames and class headers with your actual first and last name.

---

## 📚 Understanding Random Number Generation

Randomness is essential in computing for simulations, games, cryptography, statistical sampling, and more. Java provides `Math.random()` to generate random numbers, but understanding how to control the range is crucial.

### The Math.random() Method
The `Math.random()` method returns a random `double` value:
- **Range:** 0.0 (inclusive) to 1.0 (exclusive)
- **Syntax:** `Math.random()`
- **No import needed** - it's part of the `Math` class which is automatically available

**Example:**
```java
double randomValue = Math.random();  // Might be 0.0, 0.347, 0.999, etc.
System.out.println(randomValue);     // Prints something like: 0.7234567890
```

### Scaling Random Numbers to Any Range
The basic `Math.random()` only gives you 0.0 to 0.999... but what if you need a number between 1 and 100? Or between -50 and 50? You need to **scale** (multiply) and **shift** (add) the random value.

**Formula for any integer range:**
```java
int randomNumber = (int)(Math.random() * rangeSize) + minimumValue;
```

**Breaking it down:**
1. `Math.random()` → gives 0.0 to 0.999...
2. `* rangeSize` → scales to 0.0 to (rangeSize - 0.001...)
3. `+ minimumValue` → shifts the range up
4. `(int)` → converts (truncates) to an integer

**Examples:**

**Generate a random number from 1 to 6 (like a die):**
```java
int die = (int)(Math.random() * 6) + 1;
// rangeSize = 6, minimumValue = 1
// Possible values: 1, 2, 3, 4, 5, 6
```

**Generate a random number from 10 to 20:**
```java
int value = (int)(Math.random() * 11) + 10;
// rangeSize = 11 (because 20-10+1 = 11), minimumValue = 10
// Possible values: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
```

**Generate a random number from -5 to 5:**
```java
int value = (int)(Math.random() * 11) - 5;
// rangeSize = 11, minimumValue = -5
// Possible values: -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
```

### Understanding Median Values
The **median** is the middle value in a set of numbers. For a consecutive range of integers:

**Odd-sized range (integer median):**
- Range: `[8, 9, 10]` → Median = 9 (the middle value)
- Range: `[5, 6, 7, 8, 9]` → Median = 7 (the middle value)

**Even-sized range (decimal median):**
- Range: `[12, 13, 14, 15]` → Median = 13.5 (average of 13 and 14)
- Range: `[10, 11, 12, 13, 14, 15]` → Median = 12.5 (average of 12 and 13)

**Key insight:** When you know the median and the size of the range, you can calculate the minimum value (where the range starts).

---

## 📝 Part 1: In-Class Activity (Participation Points)
**File to Work With:** `InClass6_FirstName_LastName.java`

### Task
Write a program that generates a random integer within a user-specified range. The user will provide the smallest and largest possible values, and your program will generate one random number within that range.

**Requirements:**
1. **Update** the filename and class name with your actual first and last name
2. **Import** Scanner at the top of your file
3. **Declare variables** to store:
   - The smallest possible random value (`int`)
   - The largest possible random value (`int`)
   - The final randomly generated number (`int`)
4. **Prompt** the user to enter the smallest possible random value
5. **Prompt** the user to enter the largest possible random value
6. **Calculate the range size** - how many numbers are between the smallest and largest (inclusive)
   - *Hint:* If smallest is 5 and largest is 10, the range size is 6 because there are 6 numbers: 5, 6, 7, 8, 9, 10
7. **Generate a random number** using `Math.random()`, the range size, and the smallest value
   - *Hint:* Use the formula: `(int)(Math.random() * rangeSize) + minimumValue`
8. **Print** the randomly generated number to the console
9. **Add detailed comments** throughout your code explaining:
   - What the program does overall (at the top)
   - What each variable is for
   - How you calculate the range size
   - Why you multiply by the range size and add the minimum value
   - What casting does and why it's needed

### Example Outputs
```
Please enter the smallest possible random value: 1
Please enter the largest possible random value: 6
The random number is 4
```

```
Please enter the smallest possible random value: 20
Please enter the largest possible random value: 25
The random number is 20
```

```
Please enter the smallest possible random value: -10
Please enter the largest possible random value: 10
The random number is 7
```

**Note:** Your output will vary each time you run the program because it's random!

### What You Should Figure Out
Think about:
- How do I calculate the number of values in a range? (e.g., 5 to 10 has 6 values: 5, 6, 7, 8, 9, 10)
- What do I multiply `Math.random()` by?
- What do I add after multiplying?
- Why do I need `(int)` casting?
- What Scanner method reads integers?

---

🚦 **STOP! Checkpoint** 🚦

Before you go any further, take a moment to **commit and sync your work so far** to reflect your In-Class 6 work.

Not sure how? Skip to the ["📤 Submitting Your Lab"](#-submitting-your-lab) instructions near the end of this document!

---

**You will receive full participation credit for completing and submitting this in-class exercise. Your code must be finished and clearly commented.**

---

## 🎯 Part 2: Graded Lab Assignment (100 Points)
**File to Create:** `Lab6_FirstName_LastName.java`

### Purpose
Data analysts often need to generate random samples around a median (middle) value for statistical analysis, simulations, and testing. Instead of specifying minimum and maximum values, they want to specify the **median** and the **range size**, and have the program generate random numbers in that range.

This program emphasizes:
- Using `Math.random()` to generate random numbers in custom ranges
- Working with median values to derive minimum values
- Performing calculations with mixed data types (`double` for median, `int` for range)
- Understanding the relationship between median, range size, and minimum value
- Handling both odd-sized ranges (integer median) and even-sized ranges (decimal median)

**Important:** Only the `InClass6_FirstName_LastName.java` file is provided as a starter template. You must create the lab file from scratch, including:
- Proper class header with comments
- Correct class name matching your filename
- `public static void main(String[] args)` method
- All necessary imports

This is an essential skill for building programs independently!

### Step-by-Step Instructions

#### Step 1: Create Your Java File (Required)
- Create the file `Lab6_FirstName_LastName.java`
- **Update** the filename and class name with your actual first and last name
- **Example:** If your name is John Doe, create `Lab6_John_Doe.java` with class name `Lab6_John_Doe`

#### Step 2: Add File Header Comments (5 points)
At the top of your file, include a comment block summarizing:
- Your name
- The date
- The purpose of the program (generating random numbers around a median value)

```java
/**
 * Name: [Your Name]
 * Date: [Today's Date]
 * Purpose: Generate a random number within a range specified by a median and size
 */
```

#### Step 3: Import Scanner (5 points)
```java
import java.util.Scanner;
```

#### Step 4: Declare Variables (15 points)
You will need variables to store:
- **The median of the range** (`double`) - can be an integer like 9.0 or a decimal like 13.5
- **The size of the range** (`int`) - how many numbers are in the range
- **The amount to shift** (`int`) - the minimum value in the range (what to add to the random number)
- **The final random number** (`int`) - the result to display

**Hint:** The shift amount is the smallest possible random value. You'll need to calculate it from the median and range size.

#### Step 5: Create Scanner and Prompt for Median (5 points)
Create a Scanner object and prompt the user to enter the median:
```java
Scanner input = new Scanner(System.in);
System.out.print("Please enter the median for this random range: ");
```

Read the median using the appropriate Scanner method and store it in your `double` variable.

#### Step 6: Prompt for Range Size (5 points)
Prompt the user to enter the size of the range:
```java
System.out.print("Please enter the size of this random range: ");
```

Read the range size using the appropriate Scanner method and store it in your `int` variable.

#### Step 7: Calculate the Shift Amount (40 points)
This is the most challenging part! You need to figure out the **minimum value** (shift amount) based on the median and range size.

**Mathematical relationship:**
- For an **odd-sized range**, the median is exactly in the middle
  - Example: Range `[8, 9, 10]` has median 9 and size 3
  - The minimum is `median - (size / 2)` → `9 - (3 / 2)` → `9 - 1` → `8`
  
- For an **even-sized range**, the median is between two values
  - Example: Range `[12, 13, 14, 15]` has median 13.5 and size 4
  - The minimum is `median - (size / 2) + 0.5` → `13.5 - (4 / 2) + 0.5` → `13.5 - 2 + 0.5` → `12.0`

**Key insight:** Both formulas can be combined into one!
```java
// Calculate shift (minimum value)
// Cast the result to int to convert from double to int
```

**Think about:**
- How do integer division and decimal arithmetic interact?
- What happens when you subtract `size / 2` from the median?
- Do you need to add or adjust anything?
- How do you convert the result to an `int`?

#### Step 8: Generate the Random Number (15 points)
Use `Math.random()` with your calculated shift amount and range size to generate a random number in the desired range:

```java
// Generate random number using Math.random(), range size, and shift amount
int randomNumber = (int)(Math.random() * rangeSize) + shiftAmount;
```

#### Step 9: Display the Result (10 points)
Print the randomly generated number:
```java
System.out.println("The random number is " + randomNumber);
```

### Example Cases and Program Flow

**Case 1:** Odd-sized range with integer median
```
Please enter the median for this random range: 9
Please enter the size of this random range: 3
The random number is 8
```
- Range size: 3 → Numbers: `[8, 9, 10]`
- Median: 9 (the middle value)
- Shift amount: 8 (the minimum)
- Possible outputs: 8, 9, or 10

**Case 2:** Even-sized range with decimal median
```
Please enter the median for this random range: 13.5
Please enter the size of this random range: 4
The random number is 14
```
- Range size: 4 → Numbers: `[12, 13, 14, 15]`
- Median: 13.5 (between 13 and 14)
- Shift amount: 12 (the minimum)
- Possible outputs: 12, 13, 14, or 15

**Case 3:** Larger odd-sized range
```
Please enter the median for this random range: 50
Please enter the size of this random range: 11
The random number is 47
```
- Range size: 11 → Numbers: `[45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55]`
- Median: 50 (the middle value)
- Shift amount: 45 (the minimum)
- Possible outputs: Any value from 45 to 55

**Note:** Remember, the output is randomly generated, so it will differ each time you run the program!

---

## 🎓 Assumptions

To keep this lab focused on random number generation and median calculations, you may assume:
- The user provides valid numeric inputs
- If the median is an **integer** (like 9), the range size will be **odd** (like 3, 5, 7)
- If the median is a **decimal ending in .5** (like 13.5), the range size will be **even** (like 4, 6, 8)
- The range size is always positive
- You do NOT need to validate inputs or handle errors

---

## 📊 Grading Rubric

| Criteria | Points |
|----------|---------|
| **Comment summarizing the program** | 5 |
| **Importing and declaring the Scanner** | 5 |
| **Appropriate variable declarations** (median, size, shift, random number) | 15 |
| **Prompt for median input** | 5 |
| **Prompt for range size input** | 5 |
| **Correctly calculating the shift amount** (minimum value) | 40 |
| **Correctly generating the random number** using Math.random() | 15 |
| **Displaying the result** | 10 |
| **TOTAL** | **100** |

---

## 💡 Tips for Success

1. **Test with the provided examples** - Use the exact values from Case 1 and Case 2 to verify your logic
2. **Understand integer division** - In Java, `3 / 2` equals `1`, not `1.5`
3. **Use casting carefully** - Converting `double` to `int` truncates (cuts off) the decimal part
4. **Work through the math on paper first** - Draw out the ranges and calculate the minimum value by hand
5. **Comment your calculations** - Explain your thought process for calculating the shift amount
6. **Run multiple times** - Since it's random, run your program several times to see different outputs

### Common Pitfalls to Avoid
- **Forgetting the `(int)` cast** when using `Math.random()` - this will cause a type error
- **Calculating range size incorrectly** - it's the number of values, not the difference between min and max
- **Not handling both odd and even ranges** - your formula must work for both
- **Forgetting to add the shift amount** to your random calculation

---

## 📤 Submitting Your Lab

### Using VS Code in Codespaces

1. **Stage your changes:**
   - Click the **Source Control** icon in the left sidebar (looks like a branching diagram)
   - You'll see your changed files under "Changes"
   - Click the **+** button next to each file to stage it (or click the + next to "Changes" to stage all)

2. **Commit your changes:**
   - Type a descriptive message in the text box at the top (e.g., "Completed Lab 6")
   - Click the **✓ Commit** button (or press Ctrl+Enter)

3. **Push to GitHub:**
   - Click the **•••** (three dots) menu in the Source Control panel
   - Select **Push** (or click the cloud icon with an up arrow)
   - Your changes are now on GitHub!

4. **Submit to Blackboard:**
   - Go to your GitHub repository in a web browser
   - Copy the URL from the address bar
   - Submit this URL to the Lab 6 assignment on Blackboard

### Verification
To verify your submission worked:
- Visit your GitHub repository
- You should see your Java files updated with recent commit timestamps
- Click on your files to ensure the latest code is visible

---

## 🆘 Getting Help

If you get stuck:
1. **Review the concept sections** in this README
2. **Check the example outputs** - make sure you understand what the program should do
3. **Ask during lab time** - your instructor and TAs are there to help
4. **Use office hours** - don't wait until the last minute
5. **Work with classmates** - discuss concepts and approaches, but write your own code

**Academic Integrity Reminder:** You may discuss concepts and approaches with others, but your code must be your own work. Copying code from others or online sources is a violation of academic integrity.

---

## 🎉 You've Got This!

Random number generation is a powerful tool in programming. Mastering `Math.random()` and range calculations will serve you well in future projects, simulations, and games. Take your time, work through the math, and don't hesitate to ask for help!

Good luck! 🚀

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