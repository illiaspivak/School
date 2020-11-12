package sk.kosickaakademia.illiaspivak.students;

import sk.kosickaakademia.illiaspivak.school.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{ //определяет блок кода, в котором может произойти исключение
            FileReader fr = new FileReader("resourse/students.dat"); //открыть файл
            String line; //количество строк в файле
            BufferedReader bf = new BufferedReader(fr); // читает текст из потока ввода символов
            line=bf.readLine(); // считывает сколько строк в файле (это указано в первой строке
            int num =  Integer.parseInt(line); //переоброзовал кодличество строк в int
            System.out.println("Файл содержит " + num + " строк");
            Students [] array = new Students[num]; //создаем массив студентов
            for (int i=0;i<num;i++){
                line=bf.readLine();
                String[] temp = line.split(" "); // пробел разбивает наши слова на отдельные обьекты
                double height = Double.parseDouble(temp[3]); // из строки вытягиваем данные про рост
                int weight = Integer.parseInt(temp[4]); //из строки вытягиваем информацию про массу
                Students s = new Students(temp[0],temp[1],temp[2],height,weight); //разбивает строку на три отдельные слова
                array[i]=s; //пременную s вложили в массив
            }
            printAllStudents(array); //вызываем функцию вывода студентов на консоль
            printAllWomans(array); //вызываем функцию, которая выводит всех девушек

            fr.close(); // закрываем файл, который считывали


        }catch(IOException ex){ //определяет блок кода, в котором происходит обработка исключения;
            ex.printStackTrace(); //помогает понять, где на самом деле возникла проблема
        }
    }

    public static void printAllStudents (Students[] array){ //метод, который выводт в консоль всех студентов
        System.out.println("Vsetky studenty:");
        int len = array.length;
        for(int i=0; i<len; i++){
            System.out.println("     " + array[i].getFirsName() + " " + array[i].getLastName() + " " + array[i].getHeight());
        }
    }
    public static void printAllWomans (Students[] array){ //метод, который выводт в консоль всех студентов
        System.out.println("Vsetky zeny:");
       for(Students temp : array){
           if(temp.getGender()==Gender.Female)
               System.out.println("    " + temp.getFirsName()+" "+temp.getLastName());
       }
    }
}
