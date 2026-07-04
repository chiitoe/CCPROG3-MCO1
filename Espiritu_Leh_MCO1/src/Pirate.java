public class Pirate extends Character {

    // Child attributes
    private int bounty;

    private PirateCrew pirateCrew;

    // Constructor
    public Pirate(String name, String alias, String origin, int wallet) {
        super(name, alias, origin, wallet);

        if (bounty >= 0) {
            this.bounty = bounty;
        } else {
            this.bounty = 0;
        }
    }

    // Getters
    public int getBounty(){ return this.bounty; }
    public PirateCrew getPirateCrew(){ return this.pirateCrew; }

    // Setters
    public void setBounty (int bounty){
        if (bounty >= 0){
            this.bounty = bounty;
        }
    }

    public boolean assignCrew(PirateCrew pirateCrew){
        if(pirateCrew != null){
            this.pirateCrew = pirateCrew;
            return true;
        }
        return false;
    }
    public void removeCrew(){
        this.pirateCrew = null;
    }

    @Override
    public void performDuty() {

    }
}