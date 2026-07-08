import java.util.ArrayList;

public class CharacterDatabase {

    private final ArrayList<Character> characters;

    public CharacterDatabase() {
        characters = new ArrayList<>();
    }

    // Create a character functions

    public Pirate createPirate(String name, String alias, String origin, int wallet, int bounty, String pirateRole){
        Pirate pirate = new Pirate(name, alias, origin, wallet, bounty, pirateRole);
        characters.add(pirate);

        System.out.println("Created Pirate: " + pirate.getName());
        return pirate;
    }

    public Marine createMarine(String name, String alias, String origin, int wallet, MarineRank marineRank){
        Marine marine = new Marine(name, alias, origin, wallet, marineRank);
        characters.add(marine);

        System.out.println("Created Marine: " + marine.getName());
        return marine;
    }

    public PirateHunter createPirateHunter(String name, String alias, String origin, int wallet, String combatStyle, int confirmedCaptures){
        PirateHunter pirateHunter = new PirateHunter(name, alias, origin, wallet, combatStyle, confirmedCaptures);
        characters.add(pirateHunter);

        System.out.println("Created Pirate Hunter: " + pirateHunter.getName());
        return pirateHunter;
    }

    public Civilian createCivilian(String name, String alias, String origin, int wallet, String profession, String residence){
        Civilian civilian = new Civilian(name, alias, origin, wallet, profession, residence);
        characters.add(civilian);

        System.out.println("Created Civilian: " + civilian.getName());
        return civilian;
    }

    // Delete a character
    public boolean deleteCharacter(int id){
        Character character = findCharacterByID(id);

        if(character != null){
            characters.remove(character);
            return true;
        }
        return false;
    }

    // View all characters
    public void displayAllCharacters() {
        System.out.println("=== Characters ===");
        for (Character c : characters) {
            System.out.println("- [" + c.getCharacterID() + "] " + c.getName());
        }
    }

    // helper functions
    public Character findCharacterByID(int id){
        for(Character c: characters){
            if(c.getCharacterID() == id){
                return c;
            }
        }
        return null;
    }
}
