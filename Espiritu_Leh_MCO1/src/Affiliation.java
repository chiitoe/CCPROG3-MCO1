import java.util.ArrayList;
import java.util.List;

public class Affiliation {
    private List<PirateCrew> pirateCrews;
    private List<MarineCorps> marineCorps;

    public Affiliation(){
        pirateCrews = new ArrayList<>();
        marineCorps = new ArrayList<>();
    }

    // Create a group
    public PirateCrew createPirateCrew(String crewName, String shipName, Character captain) {
        PirateCrew crew = new PirateCrew(crewName, shipName, captain);
        pirateCrews.add(crew);
        System.out.println("Created Pirate Crew: " + crew.getCrewName());
        return crew;
    }

    public MarineCorps createMarineCorps(String corpsName, String baseLocation, String corpsCommander, int operationalFunds) {
        MarineCorps corps = new MarineCorps(corpsName, baseLocation, corpsCommander, operationalFunds);
        marineCorps.add(corps);
        System.out.println("Created Marine Corps: " + corps.getCorpsName());
        return corps;
    }

    // View Groups
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
    public List<PirateCrew> getPirateCrews() { return pirateCrews; }
    public List<MarineCorps> getMarineCorpsUnits() { return marineCorps; }

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
