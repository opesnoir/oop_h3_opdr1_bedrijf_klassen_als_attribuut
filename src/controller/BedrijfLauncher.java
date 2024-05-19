package controller;

import model.Afdeling;
import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {

//        System.out.println(Persoon.aantalPersonen); // initiële waarde = 0
//
//        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
//        System.out.println(Persoon.aantalPersonen); // deze is eerst 0 en wordt automatisch met 1 opgehoogd bij aanmaak van nieuwe instantie. En is dus bij de eerste 1
//        System.out.println(baas.getPersoneelsNummer());
//
//        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(medewerker.getPersoneelsNummer()); // dit is de tweede nieuw aangemaakte instantie van persoon, het aantal is dus 2
//
//        Persoon assistent = new Persoon("Klaas");
//        Persoon manager = new Persoon();
//        System.out.println(Persoon.aantalPersonen);
//
//
//        System.out.printf("%s verdient %.2f per jaar en heeft %b recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus()); // de boolean returned true of false
//        System.out.printf("%s verdient %.2f per jaar en heeft %s recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris(), baas.heeftRechtOpBonus() ? "wel" : "geen"); // hier maak je van de boolean een string en laat je hem "wel" teruggeven als de boolean true is, en "geen" als de boolean false is
//        System.out.printf("%s verdient %.2f en heeft %b recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris(), medewerker.heeftRechtOpBonus()); // de boolean returned true of false
//        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris(), medewerker.heeftRechtOpBonus() ? "wel" : "geen"); // hier maak je van de boolean een string en laat je hem "wel" teruggeven als de boolean true is, en "geen" als de boolean false is

        // maak array met afdelingen, vul hem daarna
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        // persoon aanmaken en koppelen aan de juiste afdeling
        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");




    }
}
