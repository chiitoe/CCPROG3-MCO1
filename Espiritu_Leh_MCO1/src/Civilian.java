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

    // getters

    public String getProfession(){
        return this.profession;
    }

    public String getResidence(){
        return this.residence;
    }

    // setters

    public void setProfession(String profession){
        if (profession != null && !profession.isBlank()){
            this.profession = profession;
        }
    }

    public void setResidence(String residence){
        if (residence != null && !residence.isBlank()){
            this.residence = residence;
        }
    }

    // incomplete !!!
    @Override
    public void performDuty() {
    }
}
