package com.fellowship.functional;

import com.fellowship.utilities.utilities;

public class mergesortstring {
    public static void main(String[] args) {
        String[] arr = { "janhavi","gautami","joe","bob","anthony" };

            String[] sorted = utilities.mergeSort(arr);
            for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i] + " ");
            }

    }

    

}