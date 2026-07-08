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

    @Override
    public void performDuty() {
        switch(this.combatStyle){
            case "None" -> System.out.println("Fighting...");
            case "Swordsmanship" -> System.out.println("Cutting down enemies with precision...");
            case "Devil Fruit" -> System.out.println("Consuming fruit power...");
            case "Haki" -> System.out.println("Channeling Haki to overpower my enemies...");
            case "Fish-man Karate" -> System.out.println("Striking with enhanced Fish-man Karate...");
            case "Black Leg" -> System.out.println("Kicking my way through life...");
            case "Rokushiki" -> System.out.println("Unleashing one of the six powers...");
            default -> System.out.println("Fighting with " + this.combatStyle + "...");
        }
    }
}
