package session5;

public class IfStatement {
    static void main() {
        int currentYear = 2026;
        int birthYear = 1995;
        int age = currentYear - birthYear;

        if (age > 18) {
            System.out.println(" sunt major");
        }
        currentYear = 2026;
        birthYear = 2015;
        age = currentYear - birthYear;
        if(age > 18){
            System.out.println(" sunt major");
        }else {
            System.out.println(" sunt minor");
        }

        currentYear = 2026;
        birthYear = 2008;
        age = currentYear - birthYear;
        if (age > 18){
            System.out.println("major");
        } else if (age ==18){
            System.out.println("sunt la limita");

        }else {
            System.out.println("minor");
        }

        int temp = 10;

        if(temp > 30){
            System.out.println(" imi iau doar tricou");
        } else if (temp > 20) {
            System.out.println("imi iau plover");
        } else if (temp >= 10) {
            System.out.println("imi iau geaca");
        }else {
            System.out.println("mai bine stau acasa");
        }


    }

}
