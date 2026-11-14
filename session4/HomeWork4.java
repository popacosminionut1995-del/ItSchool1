package session4;

import java.util.Scanner;

public class HomeWork4 {

    static void main() {
        int nr1 = 8;
        int nr2 = 4;


        int rez1 = nr1 + nr2;
        System.out.println(rez1);

        int rez2 = nr1 - nr2 - nr1;
        System.out.println(rez2);

        int rez3 = (nr1 + nr2) / nr2;
        System.out.println(rez3);

        int rez4= (nr1 + nr2) * nr2;
        System.out.println(rez4);

        double rez5= (double) nr1 / (nr1 + nr2) + nr2;
        System.out.println(rez5);

        int lungime = 10;
        int latime = 10;

        int aria1 = lungime * latime;
        System.out.println(aria1);



        int a= 3;
        int b= 16;
        System.out.println(a % b);

        int c= 2;
        int d= 13;
        System.out.println(c % d);

        int rez6 = (a % d) + (c % b);
        System.out.println(rez6);

        int x= 4;
        int y= 2;

        System.out.println(++x);
        System.out.println(x); // x=5
        System.out.println(y--); // y=2
        System.out.println(++y); // y=2
        System.out.println(x++); // x=5
        System.out.println(x); // x=6
        System.out.println(y--); //y=2
        System.out.println(y); //y=1
        System.out.println(--x + ++y);

        int val1 = 10;
        int valminus = -val1;
        System.out.println(valminus);

        boolean adevarat = true;
        System.out.println(!adevarat);

        boolean adev = false;
        boolean fals = true;
        System.out.println(!adev);
        System.out.println(!fals);


        int v = 12;
        int m = 19;
        int n = 12;
        System.out.println(v < n);
        System.out.println(v >=n);
        System.out.println(m < n);
        System.out.println(m < n);

        int numar = 30;
        numar += 4;
        System.out.println(numar);
        numar -= 11;
        System.out.println(numar);
        numar *= 2;
        System.out.println(numar);
        numar /= 3;
        System.out.println(numar);
        numar %= 3;
        System.out.println(numar);

        byte g = 9;
        byte h= 10;
        byte rezultat= (byte) (g +h);
        System.out.println(rezultat);

        double pret = 1000;
        double reducere = 40;
        pret -= pret * reducere / 100;
        System.out.println(pret);

        int numar1 = 40;

        boolean verificare = numar1 >= 1 && numar1 <=100;
        System.out.println(verificare);




    }
}
