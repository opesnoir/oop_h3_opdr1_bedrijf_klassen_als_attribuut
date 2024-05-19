package model;

public class Persoon {
    public static int aantalPersonen = 0;
    public final int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;
    public int aantalMaandenInEenJaar = 12;

    public Persoon(String naam, String woonplaats, double maandSalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.personeelsNummer = ++aantalPersonen; // wordt niet doorgegeven, deze wordt automatisch gegenereerd.
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon() {
        this.naam = "onbekend";
        this.woonplaats = "onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    //methoden
    public double berekenJaarInkomen(){
        return maandSalaris * aantalMaandenInEenJaar;
    }

}
