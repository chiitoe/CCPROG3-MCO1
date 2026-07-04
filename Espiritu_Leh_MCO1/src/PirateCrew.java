import java.util.ArrayList;
import java.util.List;

public class PirateCrew {

    private static int autoID = 1;   // Same auto-ID as Character
    private final int crewID;
    private String crewName;
    private String shipName;
    private String captainName;
    private List<Pirate> crewMembers;

    public PirateCrew(String crewName, String shipName, String captainName){
        this.crewID = autoID++;

        this.crewName = (crewName != null && !crewName.isBlank()) ? crewName : "Unnamed crew";
        this.shipName = (shipName != null && !shipName.isBlank()) ? shipName : "Unnamed Ship";
        this.captainName = (captainName != null && !captainName.isBlank()) ? captainName : "Captain is unknown";

        this.crewMembers = new ArrayList<>();
    }

    // Setters and Getters
    public void setCrewName(String crewName) {
        if (crewName != null && !crewName.isBlank()) this.crewName = crewName;
    }
    public void setShipName(String shipName) {
        if (shipName != null && !shipName.isBlank()) this.shipName = shipName;
    }
    public void setCaptainName(String captainName) {
        if (captainName != null && !captainName.isBlank()) this.captainName = captainName;
    }

    public int getCrewID() { return crewID; }
    public String getCrewName() { return crewName; }
    public String getShipName() { return shipName; }
    public String getCaptainName() { return captainName; }
    public List<Pirate> getCrewMembers() { return crewMembers; }



    // Adding and removing members
    public boolean recruitMember(Pirate pirate){
        if (pirate == null) return false;
        if (pirate.getPirateCrew() != null) {
            System.out.println("Error: " + pirate.getAlias() + " already in a crew.");
            return false;
        }
        crewMembers.add(pirate);
        pirate.assignCrew(this);
        return true;
    }
    public boolean goodbyeMember(Pirate pirate) {
        if (pirate == null || !crewMembers.contains(pirate)) return false;
        crewMembers.remove(pirate);
        pirate.removeCrew();
        return true;
    }

    // Total crew members bounty; those who are still free
    public int getTotalBounty(){
        int total = 0;
        for (Pirate pirate : crewMembers){
            if (pirate.getStatus() == Status.FREE) {
                total += pirate.getBounty();
            }
        }
        return total;
    }
    public void viewCrew(){
        System.out.println("Members of " + crewName + ":");
        if(crewMembers.isEmpty()){
            System.out.println(" There are no members");
            return;
        }
        for (Pirate pirate : crewMembers){ pirate.displayProfile(); }
    }

    public void displayPirateInfo() {
        System.out.println("=== Pirate Crew: " + crewName + " ===");
        System.out.println("Crew ID       : " + crewID);
        System.out.println("Ship's Name   : " + shipName);
        System.out.println("Captain       : " + captainName);
        System.out.println("Crew Size     : " + crewMembers.size());
        System.out.println("Total Bounty  : " + getTotalBounty() + " Berries");
    }
}

