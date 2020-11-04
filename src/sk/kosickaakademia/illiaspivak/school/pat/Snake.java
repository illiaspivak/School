package sk.kosickaakademia.illiaspivak.school.pat;

public class Snake implements Animal{
    private String name;

    public Snake(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
