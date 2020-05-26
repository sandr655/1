package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int popI;
    static int i0;
    static int i1;
    static int i2;

    public static void main(String[] args) {
        int raz = 1010;     // -  устанавливается кол-во запусков функции
        for (int n = 1; n <= raz; n++) {
            String pe = func(new String[]{"Пейсинг", "не", "нужен"}, new int[]{1, 1, 1000});

            switch (pe){
                case "Пейсинг" : i0++;
                    break;
                case "не": i1++;
                    break;
                case "нужен": i2++;
                    break;

            }
        }
        System.out.println("Пейсинг"+" "+i0+","+"не"+" "+i1+","+"нужен"+" "+i2);
    }

    public static String func(String[] value, int[] chance) {
        int sum;
        sum = 0;
        Random rand = new Random();
        int index = 0;
        int ka =0;

        for (int k = 0; k < chance.length; k++) {
            ka = k+1;
            sum += chance[k];
        }

        for (int i = rand.nextInt(ka); i < chance.length; i = rand.nextInt(ka))
        {
            int number = rand.nextInt((int) sum);
            if (number <= chance[i])
            {
                index = i;
                break;
            }
        }
        String m = value[index];

        return m;
    }

}