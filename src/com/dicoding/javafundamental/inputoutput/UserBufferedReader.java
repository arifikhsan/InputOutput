package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("Masukkan angka pertama: ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua: ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah: " + hasil);
    }
}
