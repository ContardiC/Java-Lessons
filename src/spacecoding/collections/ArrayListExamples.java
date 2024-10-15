package spacecoding.collections;
import java.util.ArrayList;
public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        System.out.println("ages  =  " + ages.toString());

        ArrayList<Object> mixList = new ArrayList<Object>();
        mixList.add("Java");
        mixList.add(10);
        mixList.add(true);
        System.out.println("mixList = " + mixList.toString());

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add(2,"Dog");
        animals.add(1, "Cow");
        System.out.println("animals = " + animals.toString());
        // remove 1 item using index
        animals.remove(2);
        System.out.println("animals = " + animals.toString());
        // remove 1 item using Object value
        animals.remove("Lion");
        System.out.println("animals = " + animals.toString());
        //  Overwrite the animal with index 1
        animals.set(1,"Ant"); 
        System.out.println("animals = " + animals.toString());


        ArrayList<String> cars = new ArrayList<String>();
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());

        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("Lamborghini");
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());

        System.out.println(cars.contains("Ferrari"));
        System.out.println("cars = " + cars.toString());

        cars.clear();

        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
    }
}
