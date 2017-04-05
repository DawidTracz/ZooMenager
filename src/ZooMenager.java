import animal.Animal;
import java.util.*;

public class ZooMenager {

    ArrayList<Animal> animalList = new ArrayList<>();
    private Map<String, Animal> animalMap = new HashMap<>();
    Set<String> setAnimalType = new HashSet<>();


    void addAnimal(Animal animal) {
        animalList.add(animal);
        animalMap.put(animal.getName(), animal);
        setAnimalType.add(animal.getType());
    }



    public void print() {

        System.out.println("All animals in Zoo ");
        for (Animal animal : animalList) {

            System.out.println(animal.getName() + " " + animal.getType()+ " " + animal.getSex());
        }}


    public Animal getByName(String name) {
        return animalMap.get(name);
    }


}














