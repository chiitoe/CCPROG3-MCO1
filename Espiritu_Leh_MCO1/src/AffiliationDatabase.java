import java.util.ArrayList;

// Module 2 - This manages every Pirate Crew or Marine Corp. 

public class AffiliationDatabase {
    private final ArrayList<PirateCrew> pirateCrews;
    private final ArrayList<MarineCorps> marineCorps;

    public AffiliationDatabase(){
        pirateCrews = new ArrayList<>();
        marineCorps = new ArrayList<>();
    }

    // This method creates the Pirate Crew using the PirateCrew class
    public PirateCrew createPirateCrew(String crewName, String shipName, Pirate captain) {
        PirateCrew crew = new PirateCrew(crewName, shipName, captain);
        pirateCrews.add(crew);
        System.out.println("Created Pirate Crew: " + crew.getCrewName());
        return crew;
    }
    // This method creates the Marine Corp from the Marine Corps class
    public MarineCorps createMarineCorps(String corpsName, String baseLocation, String corpsCommander, int operationalFunds) {
        MarineCorps corps = new MarineCorps(corpsName, baseLocation, corpsCommander, operationalFunds);
        marineCorps.add(corps);
        System.out.println("Created Marine Corps: " + corps.getCorpsName());
        return corps;
    }

    // This method uses the getID methods from the Pirate Crew and Marine Corp classes
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
    public ArrayList<PirateCrew> getPirateCrews() {
        // Creates and returns a copy of the list
        return new ArrayList<>(this.pirateCrews);
    }

    public ArrayList<MarineCorps> getMarineCorpsUnits() {
        // Creates and returns a copy of the list
        return new ArrayList<>(this.marineCorps);
    }

    public PirateCrew findPirateCrewById(int id) {
        for (PirateCrew c : pirateCrews) {
            if (c.getCrewID() == id) return c;
        }
        return null;
    }

    public MarineCorps findMarineCorpsById(int id) {
        for (MarineCorps m : marineCorps) {
            if (m.getCorpsID() == id) return m;
        }
        return null;
    }


}
