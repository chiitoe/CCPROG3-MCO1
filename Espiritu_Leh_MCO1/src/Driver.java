public class Driver {
    public static void main(String[] args) {
        CharacterDatabase chardata = new CharacterDatabase();
        AffiliationDatabase affdata = new AffiliationDatabase();
        DevilFruitDatabase devfrdata = new DevilFruitDatabase();

        Pirate luffy = chardata.createPirate("Monkey D. Luffy", "Straw Hat", "East Blue", 5000, 300000000, "Captain");
        Pirate zoro = chardata.createPirate("Roronoa Zoro", "Pirate Hunter", "East Blue", 2000, 111000000, "Swordsman");
        Marine smoker = chardata.createMarine("Smoker", "White Hunter", "Loguetown", 10000, MarineRank.VICE_ADMIRAL);
        chardata.createCivilian("Kaya", "Kaya", "Syrup Village", 50000, "Doctor", "Syrup Village");
        chardata.createPirateHunter("Roronoa Zoro (bounty era)", "Hunter", "East Blue", 0, "Swordsmanship", 3);

        PirateCrew strawHats = affdata.createPirateCrew("Straw Hat Pirates", "Going Merry", luffy);
        strawHats.recruitMember(luffy);
        strawHats.setCaptain(luffy);
        strawHats.recruitMember(zoro);

        MarineCorps g5 = affdata.createMarineCorps("Marine G-5", "Enies Lobby", "Doberman", 500000);
        g5.recruitMarine(smoker);

        DevilFruit gomuGomu = devfrdata.createDevilFruit("Gomu Gomu no Mi", Category.PARAMECIA, "Rubber body");
        gomuGomu.assignNewOwner(luffy);

        System.out.println();
        chardata.displayAllCharacters();
        affdata.viewGroups();
        devfrdata.viewAllFruits();

        System.out.println();
        strawHats.displayPirateInfo();
        strawHats.viewCrew();

        System.out.println();
        g5.displayMarineInfo();

        System.out.println();
        gomuGomu.displayFruit();
        luffy.performDuty();
        smoker.performDuty();

        zoro.setStatus(Status.CAPTURED);
        System.out.println("\nAfter Zoro captured:");
        strawHats.displayPirateInfo();

        luffy.setStatus(Status.DEAD);
        System.out.println("\nAfter Luffy dies:");
        gomuGomu.displayFruit();
    }
}