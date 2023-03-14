package ua.lviv.iot.algo.part1.lab1;


import lombok.*;

import javax.sql.rowset.spi.SyncResolver;

//By Denys Rybak

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Zoo{

    private  String Name;

    private String Location;

    private static int area;

    private static int capacity;

    private static int section;

    private static Zoo defaultZoo = new Zoo();
    public static Zoo getInstance(){
        return defaultZoo;
    }

    static void increaseCapacity(int count){
        System.out.println("  Нова макс. кіль. тварин" + count);
    }


    static void addName(){
        System.out.print("Знесіння");
    }


    static void addLocation(){
        System.out.print("Львів");
    }


    static void SplitArea(){
        int i = area / 2;
        System.out.print("  Площа зоопарку зменшилась у 2 рази:" + i);
    }





    static int addNewRegion(double area) {
        int a = section + 1;
        System.out.print("  Площа зоопарку збільшилась:" + area);
        System.out.print("  Кількість секцій збільшилось:" + a);
        return a;
    }




    public static void main (String[] args){
        area = 60;
        capacity = 30;
        section = 5;
        System.out.print("  Назава зоопарку:" );
        addName();
        System.out.print("  Місце знаходження:");
        addLocation();
        System.out.print("  Площа:" + area );
        System.out.print("   Кількість секцій:" + section);
        SplitArea();
        addNewRegion(90);
        System.out.print("   Максимальна кількість тварин:" + capacity);
        increaseCapacity(56);
        System.out.print("Бувай");

    }
 }


