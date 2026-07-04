import java.util.ArrayList;

public class DevilFruit {

    private static int autoID = 1;  // auto-generated id

    // attributes
    private int fruitID;
    private String fruitName;
    private Category category;
    private String primaryAbility;
    private Character currentOwner;
    private ArrayList<Character> historicalOwners;

    // constructor
    public DevilFruit(String fruitName, Category category, String primaryAbility){
        this.fruitID = autoID++;
        this.fruitName = (fruitName != null && !fruitName.isBlank()) ? fruitName : "Unknown";
        this.category = (category != null) ? category : Category.UNDETERMINED;
        this.primaryAbility = (primaryAbility != null && !primaryAbility.isBlank()) ? primaryAbility : "Unknown";
        this.currentOwner = null;
        this.historicalOwners = new java.util.ArrayList<>();
    }

    public void displayFruit(){
        System.out.println("=================================================="); //  50
        System.out.println("ID              : " + this.fruitID);
        System.out.println("Name            : " + this.fruitName);
        System.out.println("Category        : " + this.category);
        System.out.println("Primary Ability : " + this.primaryAbility);
        System.out.println("Current Owner   : " + ((currentOwner != null) ? currentOwner.getName():"None") );

        System.out.println("All Owners      :");
        if (historicalOwners.isEmpty()){
            System.out.println("None");
        }
        else{
            for (Character owner: historicalOwners){
                System.out.println(owner.getName());
            }
        }
    }

    // getters

    public int getFruitID(){
        return this.fruitID;
    }

    public String getFruitName(){
        return this.fruitName;
    }

    public Category getCategory(){
        return this.category;
    }

    public String getPrimaryAbility(){
        return this.primaryAbility;
    }

    public Character getCurrentOwner(){
        return this.currentOwner;
    }

    public ArrayList<Character> getHistoricalOwners(){
        // creates and returns a new arrayList to retain immutability
        return new ArrayList<>(this.historicalOwners);
    }

    // no setters are implemented since the information each fruit has typically should not change after creation.

    // returns true if successful, and false otherwise
    public boolean assignNewOwner(Character newOwner) {
        /* only runs if:
                the fruit has no current owner
                the new owner is NOT dead
                the new owner does not yet have a devil fruit
        */

        if (currentOwner == null && newOwner != null && newOwner.getStatus() != Status.DEAD && !newOwner.hasDevilFruit()) {
            this.currentOwner = newOwner;
            newOwner.setDevilFruitPower(this); // passes the current fruit object so the character's devilFruitPower field points back to this fruit
            return true;
        }

        return false;
    }

    public void triggerReincarnation(){
        // adds the current owner as a new entry in the fruit's historical owners list.
        this.historicalOwners.add(this.currentOwner);

        // detaches the fruit's side of the connection
        this.currentOwner = null;
    }
}
