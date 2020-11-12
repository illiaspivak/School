package sk.kosickaakademia.illiaspivak.students;

public class Students {
    private String firsName;
    private String lastName;
    private String id;
    private int age;

    public Students (String firsName, String lastName, String id){
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
        setAge();
    }

    private void setAge(){
        age=15;
    }
    public Gender getGender(){
        return id.charAt(2)<'2' ? Gender.Male:Gender.Female;
    }
}
