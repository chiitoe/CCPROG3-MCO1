public abstract class Character {

    private static int autoID = 1;  // auto-generated id

    private final int characterID;
    private String name;
    private String alias;
    private String origin;
    private Status status;  // used an enum for status to prevent typos when calling
    private String devilFruitPower;
    private int wallet;

    // constructor
    protected Character(String name, String alias, String origin, int wallet){
        this.characterID = autoID++;        // returns value THEN increments - first character will have ID 1
        this.name = name;
        this.alias = alias;
        this.origin = origin;
        this.status = Status.FREE;
        this.devilFruitPower = null;
        this.wallet = wallet;
    }

    public void displayProfile(){
        System.out.println("=================================================="); //  50
        System.out.println("ID              : " + this.characterID);
        System.out.println("Name            : " + this.name);
        System.out.println("Alias           : " + this.alias);
        System.out.println("Origin          : " + this.origin);
        System.out.println("Status          : " + this.status);
        System.out.println("Devil Fruit     : " + (this.hasDevilFruit() ? this.devilFruitPower:"None"));
        System.out.println("Wallet          : " + this.wallet + " Berries");
    }

    // GETTERS

    // SETTERS

    // HELPER FUNCTIONS

    public abstract void performDuty();

    public boolean hasEnoughMoney(int amount){
        return this.wallet >= amount;
    }

    public boolean hasDevilFruit(){
        return devilFruitPower != null;
    }
}
