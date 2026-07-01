public class Civilian extends Character {

    // child attributes
    private String profession;
    private String residence;

    // constructor
    public Civilian(String name, String alias, String origin, int wallet, String profession, String residence) {
        super(name, alias, origin, wallet);

        this.profession = (profession != null && !profession.isBlank()) ? profession:"Unemployed";
        this.residence = (residence != null && !residence.isBlank()) ? residence:"Homeless";
    }

    // incomplete !!!
    @Override
    public void performDuty() {
        switch (this.profession){
            case "" -> System.out.println("");
        }
    }
}
