package sk.kosickaakademia.illiaspivak.school;

import sk.kosickaakademia.illiaspivak.school.pat.Animal;

public class Student {
    private String firstName;
    private String lastName;
    private Animal myAnimal;

    public Student(String name, String lastName ){
        firstName=name;
        this.lastName=lastName;
        myAnimal = null;
    }
    public Animal getMyAnimal() {
        return myAnimal;
    }
    public void setMyAnimal(Animal myAnimal) {
        this.myAnimal = myAnimal;
    }
    public void printAnimal(){
        if (myAnimal!=null) System.out.println(myAnimal.getClass().getSimpleName());
        else System.out.println("Does not have animals");
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

}
