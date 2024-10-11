/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Tyogo
 */
package com.mycompany.oop_assignment1;
import java.util.Scanner;
public class Oop_assignment1{
    public static void main(String[] args) {
        double container_val_1, container_val_2, result=0.0;
        int choice;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Calculator\n==============\nTotal = " + result);
            boolean valid;

            System.out.print("\nInput number: ");
            container_val_1 = scan.nextDouble();

            System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplicatin\n4. Division\n5. Modulo\n6. Clear Total\n7. Exit\nOperator [1...7]: ");
            choice = scan.nextInt();
            if(choice == 7){
                System.exit(0);
            }
            System.out.print("\nInput number: ");
            container_val_2 = scan.nextDouble();
            
            switch (choice){
            case 1:
                result = container_val_1 + container_val_2;
                break;
            case 2:
                result = container_val_1 - container_val_2;
                break;
            case 3:
                result = container_val_1 * container_val_2;
                break;
            case 4:
                result = container_val_1 / container_val_2;
                break;
            case 5:
                result = container_val_1 % container_val_2;
                break;
            case 6:
                result = 0;
                break;
            case 7:
                System.exit(0);
                break;
          }
        }while(true);
    }
}



//    public Oop_assignment1(double container_val_1, double container_val_2, int choice, double result){
////        int result=0;
//        switch (choice){
//            case 1:
//                result = container_val_1 + container_val_2;
//                break;
//            case 2:
//                result = container_val_1 - container_val_2;
//                break;
//            case 3:
//                result = container_val_1 * container_val_2;
//                break;
//            case 4:
//                result = container_val_1 / container_val_2;
//                break;
//            case 5:
//                result = container_val_1 % container_val_2;
//                break;
//            case 6:
//                result = 0;
//                break;
//            case 7:
//                System.exit(0);
//                break;
//          }
//    }