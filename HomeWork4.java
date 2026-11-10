public class HomeWork4 {

    static void main() {
        int nr1 = 8;
        int nr2 = 4;
        int nr3 = 11;
        int nr4 = 1;

        int rez1 = nr1 + nr3;
        System.out.println(rez1);

        int rez2 = nr3 - nr2 - nr4;
        System.out.println(rez2);

        int rez3 = (nr3 + nr4) / nr2;
        System.out.println(rez3);

        int rez4= (nr1 + nr2) * nr4;
        System.out.println(rez4);

        double rez5= (double) nr1 / (nr3 + nr2) + nr4;
        System.out.println(rez5);

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

        int v = 12;
        int m = 19;
        int n = 12;
        System.out.println(v < n);
        System.out.println(v >=n);
        System.out.println(m < n);
        System.out.println(m < n);


    }
}
