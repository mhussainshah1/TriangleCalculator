package com.company;

import java.util.Scanner;

/**
 * Write a program that allows the user to enter the length of the three sides of a triangle.
 * The program should then display whether the triangle is an equilateral triangle or not.
 * If the triangle is not an equilateral triangle then the program should display
 * if the triangle is a right triangle or not. The Pythagorean theorem tells us that the
 * square of one side equals the sum of the squares of the other sides for all right triangles.
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three lengths of triangle ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if(a == b || a ==c || b == c){
            System.out.println("This is equilateral traiagle");
        } else if((a*a == b*b + c*c) || (b*b == a*a + c*c)  || (c*c == a*a + b*b )){
            System.out.println("This is right angled traiagle");
        } else {
            System.out.println("This is neither equilateral nor right angled triangle");
        }
    }
}
