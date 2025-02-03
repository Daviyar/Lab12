//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

 public class Main {
    public static void main(String[] args) {
      System.out.println("hello, world!");
  
      Lab1 lab = new Lab1();
      System.out.println("Increment 1: " + lab.increment(1));
  //creation of array
      int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
  
      int i = 0;
  // printing out array in order
      System.out.print("Array in order: ");
      while (i < numbers.length) {
        System.out.print(numbers [i] + " ");
        i++;
      }
      System.out.println();
  //Arrays in reverse
      System.out.println("Array in reverse: ");
      int j = numbers.length -1; //this makes j start from the last number
      while (j >= 0){
        System.out.print(numbers [j] + " ");
        j--;
      }
      System.out.println();
  
      System.out.println(numbers[0]);
      System.out.println(numbers[7]);
  
      System.out.println("Max of the array: " + lab.max(numbers));
      System.out.println("Min of the array: " + lab.min(numbers));
  
      // Calling and printing the sum of the array
      System.out.println("Sum of the array: " + lab.sum(numbers));
  
      // Calling and printing the average of the array
      System.out.println("Average of the array: " + lab.average(numbers));
  
    
    }
  }     
  
  // Add all of the methods here
  class Lab1 {
    public int increment(int num) {
      return ++num;
    }
  
  //using an if statement to find the maximum of an array
    public int max(int a, int b){
      if (a>b) {
        return a;
        
      } else {
        return b;
        
      }
    }
    //using an if statement to find the minimum of an array
    public int min(int a, int b){
      if (a<b) {
        return a;
        
      } else {
        return b;
        
      }
    }
    //using for loop to find sum of all numbers in array
    public int sum(int[] nums){
  
      int total = 0;
      for (int num : nums){
        total += num;
      }
      return total;
      
    }
    //using for loop to find average of array
    public double average(int[] nums){
      int sum = 0;
      for (int num  : nums) {
        sum+= num;
      }
      return (double) sum / nums.length;
    }
    //using for loop to return maximum value of array
    public int max(int[] nums){
      int maxValue = nums[0];
  
      for (int i=1; i < nums.length; i++) {
        if (nums[i] > maxValue) {
          maxValue = nums[i];
        }
      }
      return maxValue;
    }
    public int min(int[] nums){
      int minValue = nums[0];
      
      for (int i=1; i < nums.length; i++) {
        if (nums[i] < minValue) {
          minValue = nums[i];
        }
      }
      return minValue;
   
    }
  
  
  
  }