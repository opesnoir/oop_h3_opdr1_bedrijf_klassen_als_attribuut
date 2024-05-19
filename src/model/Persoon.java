package model;

public class Persoon {
    // attributes
    private final static int AANTAL_MAANDEN_IN_EEN_JAAR = 12;
    private final static double MIN_MAAND_SALARIS = 0.00;
    private final static double GRENSWAARDE_BONUS = 4500.00;
    public static int aantalPersonen = 0;
    private final int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    // constructors
    public Persoon(String naam, String woonplaats, double maandSalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        setMaandSalaris(maandSalaris);
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }
    public Persoon(String naam) {
        this(naam, "onbekend", 0, new Afdeling());
        this.naam = naam;
    }
    public Persoon() {
        this("onbekend");
    }

    // methoden
    public double berekenJaarInkomen() {
        return maandSalaris * AANTAL_MAANDEN_IN_EEN_JAAR;
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS; //retourneert true als maandSalaris groter dan of gelijk aan GRENSWAARDE_BONUS is, anders retourneert het false
    }

    // getters, setters
    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris >= MIN_MAAND_SALARIS) {
            this.maandSalaris = maandSalaris;
        } else {
            System.out.printf("Het maandsalaris moet gelijk aan of boven €%2f, zijn. Het maandsalaris wordt op €%2f gezet.", MIN_MAAND_SALARIS, MIN_MAAND_SALARIS);
        }
    }



}
