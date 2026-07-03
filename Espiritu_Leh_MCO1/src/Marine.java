public class Marine extends Character {

    // child attributes
    private MarineRank marineRank;
    private String marineCorps;

    // constructor
    public Marine(String name, String alias, String origin, int wallet, MarineRank marineRank, String marineCorps) {
        super(name, alias, origin, wallet);

        this.marineRank = (marineRank != null) ? marineRank:MarineRank.ENSIGN;  // starts at the bottom if a rank is not given
        this.marineCorps = null;    // start unaffiliated to a corps
    }

    // returns 1 if successful, 0 otherwise
    public boolean promoteRank(){

    }

    public void assignCorps(String marineCorps){

    }

    @Override
    public void performDuty() {

    }
}
