package sk.kosickaakademia.illiaspivak.students;

public class Students {
    private String firsName; //имя
    private String lastName; //фамилия
    private String id;
    private int age; //возраст
    private double height; //высота
    private int weight; //масса
    private Contact contact; // контакт студента

    public Students (String firsName, String lastName, String id, double height, int weight){
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
        this.height = height;
        this.weight = weight;
        contact = null;
        setAge();
    }

    private void setAge(){
        age=15;
    }
    public Gender getGender(){
        return id.charAt(2)<'2' ? Gender.Male:Gender.Female;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
