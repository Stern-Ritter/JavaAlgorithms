package lesson2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        String[] strArr ;
//        strArr = new String[5];
//        String[] strArr1 ={"A", "BBBB","CCC"};

//        int[] arr = new int[10];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = i;
//        }
//
//
////
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i] %2 == 0){
////                arr[i]+=10;
////            }
////        }
//
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.addAll(Arrays.asList(3, 6, 7, 2, 43, 56, 2, 2, 5));
//
//        System.out.println(list);
////        list.remove((Integer) 2);
////        list.removeIf(x -> x > 5);
////        list.removeAll(Arrays.asList(2));
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(2);
//        mal.add(1);
//        mal.add(3);
//        System.out.println(mal);
//
//        mal.add(4, 9);
//        System.out.println(mal);

//        mal.remove(9);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9));


//       MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(9);
//        msal.add(2);
//        msal.add(4);
//        msal.add(1, 10);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(4));


//        MyArrayList<Integer> mal = new MyArrayList<>(15);
//        Random rand = new Random();
//        for (int i = 0; i <10 ; i++) {
//            mal.add(rand.nextInt(20));
//        }
//        System.out.println(mal);
//
////        mal.selectionSort();
////        mal.insertionSort();
////        mal.bubbleSort(Comparator.naturalOrder());
//        mal.bubbleSort(Comparator.reverseOrder());
//
//        System.out.println(mal);


        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aaa");
        myArrayList.add("BBB");
        myArrayList.add("bbbbbbb");
        myArrayList.add("ccc");
        myArrayList.add("AAAAA");
        myArrayList.add("xxx");
        myArrayList.add("YYYyy");

//        System.out.println(myArrayList);
////        myArrayList.bubbleSort(Comparator.naturalOrder());
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length));
////        myArrayList.bubbleSort(Comparator.comparingInt(String::length).reversed());
////        myArrayList.bubbleSort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
//        System.out.println(myArrayList);

     /*   //Задание 1. Создать массив большого размера (миллион элементов).
        //Задание 2. Заполнить массив случайными числами.
        MyArrayList<Integer> arrSel= new MyArrayList<>(100000);
        MyArrayList<Integer> arrIns= new MyArrayList<>(100000);
        MyArrayList<Integer> arrBub= new MyArrayList<>(100000);
        Random r = new Random();
        for (int i = 0; i < 100000 ; i++) {
            int num = r.nextInt(100000);
            arrSel.add(num);
            arrIns.add(num);
            arrBub.add(num);
        }
        //Задание 3. Проверить скорость выполнения каждой сортировки. (Если время сортировки будет не приемлимо долго,
        // можете для массива из 100 000 элементов проверить)
        //Исходя из теста на 100 тыс. элементах:
        //Время сортировки выбором: 38839мс.
        //Время сортировки вставками: 65304мс.
        //Время пузырьковой сортировки: 123926мс.
        long start = System.currentTimeMillis();
        arrSel.selectionSort();
        System.out.println("Время сортировки выбором: " + (System.currentTimeMillis() - start) + "мс.");
        arrIns.insertionSort();
        System.out.println("Время сортировки вставками: " + (System.currentTimeMillis() - start) + "мс.");
        arrBub.bubbleSort();
        System.out.println("Время пузырьковой сортировки: " + (System.currentTimeMillis() - start) + "мс.");
        */

        //4*. Добавить метод увеличивающий внутренний массив и сделать рефакторинг методов add(T item ) и add(int index,
        // T item)
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println("Первоначальный размер MyArrayList: " + arr.getCapacity());
        arr.add(11);
        System.out.println("Новый размер MyArrayList: " + arr.getCapacity());
        arr.add(12);
        arr.add(13);
        System.out.println("Новый размер MyArrayList: " + arr.getCapacity());
        System.out.println(arr);

        //5**. Реализовать перегруженные версии сортировок, принимающие параметр Comparator
        System.out.println(myArrayList);
        //myArrayList.insertionSort(Comparator.naturalOrder());
        //myArrayList.selectionSort(Comparator.naturalOrder());
       //myArrayList.insertionSort(Comparator.reverseOrder());
       //myArrayList.selectionSort(Comparator.reverseOrder());
        //myArrayList.insertionSort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        myArrayList.selectionSort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        System.out.println(myArrayList);

    }
}
