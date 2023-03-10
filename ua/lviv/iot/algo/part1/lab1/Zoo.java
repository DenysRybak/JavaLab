package ua.lviv.iot.algo.part1.lab1;


import lombok.*;

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




    static void increaseCapacity(){
        int count = 10;
        int result;
        System.out.print("  Макс. кіл. тварин:" +  capacity);
        result = count + capacity;
        System.out.print("  Нова макс. кіл. тварин:" +  result);
    }




    static void SplitArea(){
        int i = area / 2;
        System.out.print("  Площа зоопарку зменшилась у 2 рази:" + i);
    }





    static int addNewRegion() {
        int a = section + 1;
        int b = area * 2;
        System.out.print("  Площа зоопарку збільшилась:" + b);
        System.out.print("  Кількість секцій збільшилось:" + a);
        return a;
    }




    public static void main (String[] args){
        area = 60;
        capacity = 30;
        section = 5;
        System.out.print("  Назава зоопарку:" );
        System.out.print("  Місце знаходження:");
        System.out.print("  Площа:" + area );
        System.out.print("   Максимальна кількість тварин:" + capacity);
        System.out.print("   Кількість секцій:" + section);
        System.out.print("Бувай");
        SplitArea();
        addNewRegion();
        increaseCapacity();
    }
 }
