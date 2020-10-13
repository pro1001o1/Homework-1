package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите кол-во чисел в массиве");
        Scanner in = new Scanner(System.in);
        int size_arr = in.nextInt();

        int array[];
        array = new int[size_arr];
        System.out.println("Введите числа в массив");

        for (int i = 0; i < size_arr; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Количество элементов в массиве: "+ size_arr);

        System.out.print("Числа массива:");
        for (int i = 0; i < size_arr; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int m = 0; m < size_arr-1; m++) {
                if(array[m] > array[m+1]){
                    isSorted = false;
                    buf = array[m];
                    array[m] = array[m+1];
                    array[m+1] = buf;
                }
            }
        }
        System.out.println("Сортировка массива: " + Arrays.toString(array));

        int diff=size_arr%2;
        if(diff!=0){
            int solo;
            solo=size_arr/2;
            System.out.print("Медиана массива: "+ array[solo]);
        }
        else{
            int duo_1=(size_arr/2)-1;
            int duo_2=duo_1+1;
            int med=(array[duo_1]+array[duo_2])/2;
            System.out.print("Медиана массива: "+ med);
        }
    }
}