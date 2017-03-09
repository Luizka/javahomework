package project11;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Луиза on 05.03.2017.
 */
public class Test11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Ваш массив::");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
       System.out.println();
        System.out.print("Положительные числа массива: ");
        for(int i = 0; i < array.length; i++){

            if(array[i] > 0){

                System.out.print(" " + array[i]);
            }
        }
    }

    }

