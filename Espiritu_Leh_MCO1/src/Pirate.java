public class Pirate extends Character {

    // Child attributes
    private int bounty;
    private String pirateRole;
    private boolean isCaptain;
    private PirateCrew pirateCrew;

    // Constructor
    public Pirate(String name, String alias, String origin, int wallet, int bounty, String pirateRole) {
        super(name, alias, origin, wallet);

        this.pirateRole = (pirateRole != null && !pirateRole.isBlank()) ? pirateRole : "Unassigned";
        this.isCaptain = false;

        if (bounty >= 0) {
            this.bounty = bounty;
        } else {
            this.bounty = 0;
        }
    }

    // Getters
    public int getBounty(){ return this.bounty; }
    public PirateCrew getPirateCrew(){ return this.pirateCrew; }
    public String getPirateRole(){ return this.pirateRole; }
    public boolean isCaptain(){ return this.isCaptain; }

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

    public void setPirateRole(String newRole){
        this.pirateRole = (newRole != null && !newRole.isBlank()) ? newRole:"Unassigned";
    }

    // UNFINISHED
    public void toggleCaptain(){
        this.pirateCrew.getCaptainName();
    }

    @Override
    public void performDuty() {

    }
}