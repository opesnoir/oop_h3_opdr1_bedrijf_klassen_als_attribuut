package model;

public class Afdeling {
    // atribuut
    private String afdelingsNaam;
    private String afdelingsPlaats;

    // constructor
    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }
    public Afdeling() {
        this("onbekend", "onbekend");
    }

    // getter, setter
    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }
    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }
    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }


}
