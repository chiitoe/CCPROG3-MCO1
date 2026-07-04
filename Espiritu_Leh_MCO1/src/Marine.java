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

    }
}
