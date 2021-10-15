package ru.netology.sqr;

public class SQRService {

    public int selection(int first, int second) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {


            if ((first <= (i * i) && (i * i) <= second)) {

                counter = counter + 1;

            }


        }
        return counter;
    }
}