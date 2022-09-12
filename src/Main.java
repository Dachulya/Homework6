import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        //Task1
        //задание1
            for (short i=0; i<=10;i++){
                System.out.println(i) ;

        }
            //Задание2
        for (short i=10; i>=0;i--){
            System.out.println(i) ;

        }
        //Задание3
        System.out.println("Задание3");
        for (short i=1; i<=17 ;i++){
            if (i%2==0){
                System.out.println(i) ;}
        }
        //Задание4
        for (short i=10; i>=-10;i--){
            System.out.println(i) ;
        }
        //Task2
        //Задание1
        for (short i=1904;i<=2096;i++){
            if ( i%4==0){
                System.out.println(i+"год является високосным");
            }
        }
        //Задание2
        for(byte i=7; i<=98;i+=7){
            System.out.println(i);
        }
        System.out.println("Задание3");
        //Задание3
        for(short i=1; i<=512;i+=i){
            System.out.println(i);
        }
        //Task 3
        //Задание1

        int salary=29000;
        byte monthAll=0;
        for (byte i=1;i<12;i++){
            salary+=29000;
            monthAll+=1;
            System.out.println("Месяц "+monthAll+" сумма накоплений "+salary+" рублей");
        }
        //Задание 2
        monthAll=0;
        System.out.println();
        int salary1=29000;
        for (byte i=1;i<=12;i++){
            double interestRate=salary1*0.01 ;
            double salary2=salary1+interestRate;
            double salary3=salary2*i;
            monthAll+=1;
            System.out.println("Месяц "+monthAll+" сумма накоплений "+salary3+" рублей");
        }






    }

}