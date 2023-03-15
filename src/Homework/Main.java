package Homework;

public class Main {

    /*
   * Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
    Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
    Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.
     */
    public static void main(String[] args) {

        MyDate car1= new MyDate(5,"Mai",2012);
        MyDate car2= new MyDate(5,"Mai",2012);

        System.out.println(car1.equals(car2)); // false
        System.out.println("equals and hashCode via overrided: "+car1.equals(car2)); //equals and hashCode via overrided: true



    }
}
