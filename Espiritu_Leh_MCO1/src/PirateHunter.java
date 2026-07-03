public class PirateHunter extends Character {

    // child attributes
    private String combatStyle;
    private int confirmedCaptures;

    // constructor
    public PirateHunter(String name, String alias, String origin, int wallet, String combatStyle, int confirmedCaptures) {
        super(name, alias, origin, wallet);

        this.combatStyle = (combatStyle != null && !combatStyle.isBlank()) ? combatStyle:"None";
        this.confirmedCaptures = (confirmedCaptures >= 0) ? confirmedCaptures : 0;
    }

    // getters

    public String getCombatStyle(){
        return this.combatStyle;
    }

    public int getConfirmedCaptures(){
        return this.confirmedCaptures;
    }

    // setters

    public void setCombatStyle(String combatStyle){
        if (combatStyle != null && !combatStyle.isBlank()){
            this.combatStyle = combatStyle;
        }
    }

    public void setConfirmedCaptures(int confirmedCaptures){
        this.confirmedCaptures = (confirmedCaptures >= 0) ? confirmedCaptures:0;
    }

    // incomplete !!!
    @Override
    public void performDuty() {

    }
}
