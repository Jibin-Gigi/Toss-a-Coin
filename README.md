# Toss-a-Coin
The "Toss a Coin" program is a Java application designed to simulate the random outcome of a coin toss. The program provides a simple and interactive experience, allowing users to initiate coin tosses and observe the result.

This repository contains two programs:

## 1.tossAcoin.java:

This program uses a simple loop and the Random class in Java to simulate a coin toss. It prompts the user to enter 'y' to initiate a toss and then generates a random number (1 or 2) to represent heads or tails. The result is displayed, and the user is given the option to toss the coin again or exit. The process continues as long as the user chooses to toss.

## 2.tossAcoin_usingThread.java:

This program introduces multithreading by creating a separate thread (TossThread) to handle the coin toss logic. It also utilizes the Random class to generate random outcomes. Similar to the first program, the user is prompted to enter 'y' to initiate a toss. The thread generates a random number (1 or 2) to represent heads or tails, displays the result after a pause, and then prompts the user to toss again or exit. The multithreading aspect adds a layer of complexity and allows the program to run asynchronously.

In summary, both programs simulate coin tosses using the Random class, with the second program introducing the concept of multithreading for handling the toss logic.

## How to Run
1. Open a terminal or command prompt:<br>
&emsp; On Windows, you can use Command Prompt or PowerShell.<br>
&emsp; On macOS or Linux, you can use the Terminal.

2.Clone the repository:
   ```bash
   git clone https://github.com/Jibin-Gigi/Toss-a-Coin.git
   ```

3.Navigate to the project directory:
   ```bash
   cd Toss-a-Coin
   ```

4.Compile and the program 1:
   ```bash
  javac tossAcoin.java
  java tossAcoin

   ```

5.Compile and run the program 2:
   ```bash
   javac tossAcoin_usingThread.java
   java tossAcoin_usingThread

   ```

> **_NOTE:_**
> Ensure that you have Java installed on your system.




