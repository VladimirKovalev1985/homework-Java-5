package ru.netology.sqr;

public class SQRService {

    public int pickNumbers(int first, int second) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {

            int j = i * i;


            if ((first <= j && j <= second)) {

                counter = counter + 1;

            }


        }
        return counter;
    }
}