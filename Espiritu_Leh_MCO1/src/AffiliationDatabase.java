import java.util.ArrayList;

// Module 2 - This manages every Pirate Crew or Marine Corp. 
public class AffiliationDatabase {

    // Attributes
    private final ArrayList<PirateCrew> pirateCrews;
    private final ArrayList<MarineCorps> marineCorps;

    /* CONSTRUCTOR
        Purpose: Sets up empty group lists.
    */
    public AffiliationDatabase(){
        pirateCrews = new ArrayList<>();
        marineCorps = new ArrayList<>();
    }

    /* HELPER METHOD
        Purpose: Builds and registers a new PirateCrew.
        Returns: The created crew.
    */
    public PirateCrew createPirateCrew(String crewName, String shipName, Pirate captain) {
        PirateCrew crew = new PirateCrew(crewName, shipName, captain);
        pirateCrews.add(crew);
        System.out.println("Created Pirate Crew: " + crew.getCrewName());
        return crew;
    }
    /* HELPER METHOD
        Purpose: Builds and registers a new MarineCorps unit.
        Returns: The created corps.
    */
    public MarineCorps createMarineCorps(String corpsName, String baseLocation, String corpsCommander, int operationalFunds) {
        MarineCorps corps = new MarineCorps(corpsName, baseLocation, corpsCommander, operationalFunds);
        marineCorps.add(corps);
        System.out.println("Created Marine Corps: " + corps.getCorpsName());
        return corps;
    }
    
    // Lists every crew annd corps by their ID and name.
    public void viewGroups() {
        System.out.println("=== Pirate Crews ===");
        for (PirateCrew c : pirateCrews) {
            System.out.println("- [" + c.getCrewID() + "] " + c.getCrewName());
        }
        System.out.println("=== Marine Corps Units ===");
        for (MarineCorps m : marineCorps) {
            System.out.println("- [" + m.getCorpsID() + "] " + m.getCorpsName());
        }
    }

    // Getters
    public ArrayList<PirateCrew> getPirateCrews() {
        // Creates and returns a copy of the list
        return new ArrayList<>(this.pirateCrews);
    }
    public ArrayList<MarineCorps> getMarineCorpsUnits() {
        // Creates and returns a copy of the list
        return new ArrayList<>(this.marineCorps);
    }

    /* HELPER METHOD
        Purpose: Looks up a pirate crew by ID.
        Returns: The matching crew, or null if nothing is found.
    */
    public PirateCrew findPirateCrewById(int id) {
        for (PirateCrew c : pirateCrews) {
            if (c.getCrewID() == id) return c;
        }
        return null;
    }
    /* HELPER METHOD
        Purpose: Looks up a marine corps unit by ID.
        Returns: The matching corps, or null if nothing is found.
    */
    public MarineCorps findMarineCorpsById(int id) {
        for (MarineCorps m : marineCorps) {
            if (m.getCorpsID() == id) return m;
        }
        return null;
    }


}
