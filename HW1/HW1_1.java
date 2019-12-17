//package com.company;

//import java.util.Scanner;


// 1) В переменную записываем число. Надо вывести на экран сколько в этом
//числе цифр и положительное оно или отрицательное. Например, "это
//однозначное положительное число". Достаточно будет определить, является ли
//число однозначным, "двухзначным или трехзначным и более.



public class HW1_1 {

    public static void main(String[] args) {

	int number=187;	
	// Scanner input = new Scanner(System.in);
       // System.out.print("Введите целое число: ");
       // int number = input.nextInt();
        if (number == 0) {
            System.out.println("Число равно нулю");
        } else if (Math.abs(number) < 10 && number > 0) {
            System.out.println("Это однозначное положительное число число");
        } else if (Math.abs(number) < 10 && number < 0) {
            System.out.println("Это однозначное отрицательное число");
        } else if (Math.abs(number) < 100 && number > 0) {
            System.out.println("Это двузначное положительное число");
        } else if (Math.abs(number) < 100 && number < 0) {
            System.out.println("Это двузначное отрицательное число");
        } else if (Math.abs(number) < 1000 && number > 0) {
            System.out.println("Это положительное трехзначное число");
        } else if (Math.abs(number) < 1000 && number < 0) {
            System.out.println("Это отрицательное трехзначное число");
        } else if (Math.abs(number) < 10000 && number > 0) {
            System.out.println("Это положительное больше чем трехзначное число");
        } else if (Math.abs(number) < 10000 && number < 0) {
            System.out.println("Это отрицательное больше чем трехзначное число");
        }
    }
}



