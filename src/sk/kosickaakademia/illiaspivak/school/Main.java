package sk.kosickaakademia.illiaspivak.school;


import sk.kosickaakademia.illiaspivak.school.pat.Cat;
import sk.kosickaakademia.illiaspivak.school.pat.Dog;
import sk.kosickaakademia.illiaspivak.school.pat.Snake;


public class Main {
    public static void main(String[] args) {

        Student[] students ;

        students = initStudents();
        printAllStudents(students);


      //  students[0].setMyAnimal( new Dog("Skubi") );

    }


    private static void printAllStudents(Student[] students) {
        int i;
        int len=students.length;
        System.out.println("List of students:");
        for(i=0;i<len;i++){

            System.out.println(students[i].toString());
            students[i].printAnimal();
            System.out.println();
        }
        System.out.println();
    }
    private static Student[] initStudents() {
        Student[] s= new Student[10];


        Student s1 = new Student("Aleksey", "Kobylatskyi");
        s[0] = s1;
        s1.setMyAnimal(new Dog("Skubi"));
        Student s2 = new Student("Peter", "Kopkas");
        s[1] = s2;
        s2.setMyAnimal(new Snake("Zmejka"));
        Student s3 = new Student("Vlad", "Skobley");
        s3.setMyAnimal((new Cat("Rici")));
        s[2] = s3;
        Student s4 = new Student("Tana", "Poroshenko");
        s[3] = s4;
        Student s5 = new Student("Vladimir", "Putin");
        s[4] = s5;
        Student s6 = new Student("Ralf", "Zabubenskiy");
        s[5] = s6;
        Student s7 = new Student("Sofi", "Davalkova");
        s[6] = s7;
        Student s8 = new Student("Sebastian", "Snow");
        s[7] = s8;
        Student s9 = new Student("Burak", "Tykvin");
        s[8] = s9;
        Student s10 = new Student("Nikola", "Baskov");
        s[9] = s10;
        return s;
    }



}
