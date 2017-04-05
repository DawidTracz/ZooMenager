/*
*
*
*The aplication is adding animals to zoo and iterating all names and types of animal
*
*Created by Dawid Tracz
*
*
*
*/
public class Run {
    public static void main(final String[] args) {

        ZooMenager zoo = new ZooMenager();
        View view = new View();
        view.setZooMenager(zoo);
        view.show();

        zoo.print();

        System.out.println("All Animal types");

        for (String i : zoo.setAnimalType) {

            System.out.println(i);
        }
    }
}
