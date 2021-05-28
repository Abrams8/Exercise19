package com.company;            

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int array[] = {10, 5, 6, 8, 9, 7, 1, 5, 8, 2};
        System.out.print("Элементы массива,стоящие на четных позициях: ");
        for (; i < array.length; i += 2) {
            System.out.print(array[i] + "  ");
        }
    }
}
