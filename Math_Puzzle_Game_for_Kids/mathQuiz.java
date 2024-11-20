import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class mathPuzzle {
    public static void main(String[] args){
        System.out.println("Welcome to math puzzle game!");
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to play?\n1) Yes\n2) No\n");
            int t = input.nextInt();
            if (t == 1){
                System.out.println("Please, Enter your name : ");
            String user_name = input.next();
            System.out.println("Please, select level : ");
            System.out.println("1) Easy \n2) Medium \n3) Hard");
            int choice = input.nextInt();
            int count = 0;
            switch (choice) {
                //level easy
                case 1:
                    try {
                        // Read the math problems from the file
                        File file = new File("/mnt/Application/OOP with JAVA/easy.txt");
                        Scanner fileReader = new Scanner(file);

                        while (fileReader.hasNextLine()) {
                            // Read one problem at a time
                            String line = fileReader.nextLine();
                            String[] parts = line.split("=");

                            // Get the problem and correct answer
                            String problem = parts[0].trim();
                            int correctAnswer = Integer.parseInt(parts[1].trim());

                            // Ask user for the answer
                            System.out.print("Solve: " + problem + " = ");
                            int userAnswer = input.nextInt();

                            // Compare the user's answer with the correct answer
                            if (userAnswer == correctAnswer) {
                                count++;
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Incorrect! The correct answer is " + correctAnswer);

                            }
                        }

                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read the file.");
                    } catch (Exception e) {
                        System.out.println("Error: Please check the file format or your input.");
                    }
                    break;
                //level medium
                case 2:
                    try {
                        // Read the math problems from the file
                        File file = new File("/mnt/Application/OOP with JAVA/medium.txt");
                        Scanner fileReader = new Scanner(file);

                        while (fileReader.hasNextLine()) {
                            // Read one problem at a time
                            String line = fileReader.nextLine();
                            String[] parts = line.split("=");

                            // Get the problem and correct answer
                            String problem = parts[0].trim();
                            int correctAnswer = Integer.parseInt(parts[1].trim());

                            // Ask user for the answer
                            System.out.print("Solve: " + problem + " = ");
                            int userAnswer = input.nextInt();

                            // Compare the user's answer with the correct answer
                            if (userAnswer == correctAnswer) {
                                System.out.println("Correct!");
                                count += 2;
                            } else {
                                System.out.println("Incorrect! The correct answer is " + correctAnswer);

                            }
                        }

                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read the file.");
                    } catch (Exception e) {
                        System.out.println("Error: Please check the file format or your input.");
                    }
                    break;
                //level hard
                case 3:
                    try {
                        // Read the math problems from the file
                        File file = new File("/mnt/Application/OOP with JAVA/hard.txt");
                        Scanner fileReader = new Scanner(file);

                        while (fileReader.hasNextLine()) {
                            // Read one problem at a time
                            String line = fileReader.nextLine();
                            String[] parts = line.split("=");

                            // Get the problem and correct answer
                            String problem = parts[0].trim();
                            int correctAnswer = Integer.parseInt(parts[1].trim());

                            // Ask user for the answer
                            System.out.print("Solve: " + problem + " = ");
                            int userAnswer = input.nextInt();

                            // Compare the user's answer with the correct answer
                            if (userAnswer == correctAnswer) {
                                System.out.println("Correct!");
                                count += 3;
                            } else {
                                System.out.println("Incorrect! The correct answer is " + correctAnswer);
                            }
                        }

                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read the file.");
                    } catch (Exception e) {
                        System.out.println("Error: Please check the file format or your input.");
                    }
                    break;
            }
            //input.close();
            String output = "/mnt/Application/OOP with JAVA/result.txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(output, true))) { // 'true' for appending data
                writer.println("User: " + user_name + "Level : "+choice +" Score: " + count);
                System.out.println("Your result has been saved to: " + output);
            } catch (IOException e) {
                System.out.println("Error writing to file: " + output);
                e.printStackTrace();
            }
            //if-else close
            }else {
                break;
            }
        }
    }

}
