public abstract class Character {

    private static int autoID = 1;  // auto-generated id

    private final int characterID;
    private String name;
    private String alias;
    private final String origin;
    private Status status;  // used an enum for status to prevent typos when calling
    private String devilFruitPower;
    private int wallet;

    // constructor
    protected Character(String name, String alias, String origin, int wallet){
        this.characterID = autoID++;        // returns value THEN increments - first character will have ID 1
        this.name = (name != null && !name.isBlank()) ? name:"Unknown";
        this.alias = (alias != null && !alias.isBlank()) ? alias:"Unknown";
        this.origin = (origin != null && !origin.isBlank()) ? origin:"Unknown";
        this.status = Status.FREE;
        this.devilFruitPower = null;
        this.wallet = (wallet >= 0) ? wallet:0;
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

    public int getCharacterID(){
        return this.characterID;
    }

    public String getName(){
        return this.name;
    }

    public String getAlias(){
        return this.alias;
    }

    public String getOrigin(){
        return this.origin;
    }

    public Status getStatus(){
        return this.status;
    }

    public String getDevilFruitPower(){
        return this.devilFruitPower;
    }

    public int getWallet(){
        return this.wallet;
    }

    // SETTERS

    public void setName(String newName){
        if(newName != null && !newName.isBlank()){
            this.name = newName;
        }
    }

    public void setAlias(String newAlias){
        if(newAlias != null && !newAlias.isBlank()){
            this.alias = newAlias;
        }
    }

    public void setStatus(Status newStatus){
        this.status = newStatus;

        if(this.status == Status.DEAD){
            this.devilFruitPower = null;
        }
    }

    public void setDevilFruitPower(String devilFruit){
        if (devilFruit != null && !devilFruit.isBlank()){
            this.devilFruitPower = devilFruit;
        }
    }

    // wallet modifiers are divided into two for ease of use. since these actions have potential of failing due to misinput, the methods return boolean values to indicate a success or failure.

    public boolean addWallet(int amount){
        if(amount > 0) {
            this.wallet += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deductWallet(int amount){
        if (hasEnoughMoney(amount)){
            this.wallet -= amount;
            return true;
        }
        else{
            return false;
        }
    }

    // HELPER FUNCTIONS

    public abstract void performDuty();

    public boolean hasEnoughMoney(int amount){
        return this.wallet >= amount;
    }

    public boolean hasDevilFruit(){
        return devilFruitPower != null;
    }
}