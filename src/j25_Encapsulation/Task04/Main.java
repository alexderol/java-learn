package j25_Encapsulation.Task04;

import j25_Encapsulation.Task03.BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("önce isim sonra  yaş giriniz");
        Student student = new Student(scan.nextLine(), scan.nextInt());
        System.out.println("student name is "+student.getName()+"\nhe is "+student.getAge()+" years old");
        BMI obj = new BMI("erol",35,73,1.7);




    }
}
