import java.util.ArrayList;

public class DevilFruitDatabase {
    private final ArrayList<DevilFruit> devilFruits;

    // Constructor
    public DevilFruitDatabase(){
        devilFruits = new ArrayList<>();
    }

    // Create a fruit
    public DevilFruit createDevilFruit(String fruitName, Category category, String primaryAbility) {
        DevilFruit fruit = new DevilFruit(fruitName, category, primaryAbility);
        devilFruits.add(fruit);
        System.out.println("Created Fruit: " + fruit.getFruitName());
        return fruit;
    }

    // View all fruits
    public void viewAllFruits() {
        System.out.println("=== Devil Fruits ===");
        for (DevilFruit fruit : devilFruits) {
            System.out.println("- [" + fruit.getFruitID() + "] " + fruit.getFruitName());
        }
    }

    // find fruit via unique id number
    public DevilFruit findFruitById(int id){
        for (DevilFruit f : devilFruits){
            if (f.getFruitID() == id) return f;
        }
        return null;
    }

    public ArrayList<DevilFruit> getDevilFruits(){
        // creates and returns a copy of the list for data integrity
        return new ArrayList<>(this.devilFruits);
    }
}
