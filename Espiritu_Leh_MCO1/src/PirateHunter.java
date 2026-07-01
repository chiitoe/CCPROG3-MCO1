public class PirateHunter extends Character {

    // child attributes
    private String combatStyle;
    private int confirmedCaptures;

    // constructor
    public PirateHunter(String name, String alias, String origin, int wallet, String combatStyle, int confirmedCaptures) {
        super(name, alias, origin, wallet);

        this.combatStyle = (combatStyle != null && !combatStyle.isBlank()) ? combatStyle:"None";
        this.confirmedCaptures = (confirmedCaptures >= 0) ? confirmedCaptures:0;
    }

    // incomplete !!!
    @Override
    public void performDuty() {

    }
}
