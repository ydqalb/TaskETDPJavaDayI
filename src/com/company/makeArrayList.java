package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class makeArrayList
{
    public static void main(String[] args)
    {
        ArrayList data_array = new ArrayList();

        System.out.print("Input Total Data : ");   int total_data = new Scanner(System.in).nextInt();

        for(int a = 0; a < total_data; a++)
        {
            System.out.print("Masukkan data ke-"+(a+1)+": ");
            data_array.add(new Scanner(System.in).nextLine());
        }

        System.out.println("\nData yang diinput :");
        for(Object o : data_array)
        {
            System.out.println(o);
        }

        System.out.print("\nMasukkan data yang akan dihapus : ");  String data_hapus = new Scanner(System.in).nextLine();

        data_array.remove(data_hapus);

        System.out.println("\nLast Update data pada ArrayList :");
        for(Object o : data_array)
            System.out.println(o);

    }
}