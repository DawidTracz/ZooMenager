package animal;

public class Animal {

    private String type;
    private String name;
    private Sex sex;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public Animal(String name, String type, Sex sex) {

        this.name = name;
        this.type = type;
        this.sex = sex;
    }

    @Override
    public String toString() {

        return this.name + "" + this.type + " " + this.getSex();


    }


}
