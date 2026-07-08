public class Marine extends Character {

    // child attributes
    private MarineRank marineRank;
    private MarineCorps marineCorps;

    // constructor
    public Marine(String name, String alias, String origin, int wallet, MarineRank marineRank) {
        super(name, alias, origin, wallet);

        this.marineRank = (marineRank != null) ? marineRank:MarineRank.ENSIGN;  // starts at the bottom if a rank is not given
        // marines are created with no affiliations to a corps
    }

    // getters
    public MarineRank getMarineRank(){
        return this.marineRank;
    }
    public MarineCorps getMarineCorps(){
        return this.marineCorps;
    }

    // methods

    // returns true if successful, false otherwise
    public boolean promoteRank(){
        MarineRank[] allRanks = MarineRank.values();
        int index = this.marineRank.ordinal();      // holds the index of the current rank

        // only runs when the current rank is NOT the HIGHEST rank
        if(index < allRanks.length - 1){
            this.marineRank = allRanks[index + 1];
            return true;
        }
        // only runs when the current rank IS the HIGHEST rank
        return false;
    }

    // returns true if successful, false otherwise
    public boolean assignCorps(MarineCorps marineCorps){

        // only runs if the input is valid
        if (marineCorps != null){
            this.marineCorps = marineCorps;
            return true;
        }
        return false;
    }

    public void removeCorps(){
        this.marineCorps = null;
    }

    @Override
    public void performDuty() {
        switch (this.marineRank){
            case ENSIGN -> System.out.println("Following a superior's orders...");
            case LIEUTENANT -> System.out.println("Fulfilling my duties...");
            case COMMANDER -> System.out.println("Overseeing low-rank officers...");
            case CAPTAIN -> System.out.println("Commanding a marine branch to capture pirates...");
            case COMMODORE -> System.out.println("Taking on authoritative duties...");
            case REAR_ADMIRAL -> System.out.println("Commanding low-ranked marines...");
            case VICE_ADMIRAL -> System.out.println("Leading a Buster Call fleet...");
            case ADMIRAL -> System.out.println("Serving as one of the Marine's three greatest powers...");
            case FLEET_ADMIRAL -> System.out.println("Overseeing marine operations...");
            default -> System.out.println("Patrolling the seas...");
        }
    }
}
