package sk.kosickaakademia.illiaspivak.school.pat;

public class Cat implements Animal{
    private String name;

    public Cat(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
