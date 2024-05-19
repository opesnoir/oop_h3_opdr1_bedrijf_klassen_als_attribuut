package controller;
import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen); // initiele waarde = 0

        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen); // deze is initieel 0 en wordt automatisch met 1 opgehoogd bij aanmaak van nieuwe instantie. En is dus bij de eerste 1
        System.out.println(baas.personeelsNummer);

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.personeelsNummer); // dit is de tweede nieuw aangemaakte instantie van persoon, het aantal is dus 2

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar \n", baas.naam, baas.berekenJaarInkomen() );
        System.out.printf("%s woont in %s \n", assistent.naam, assistent.woonplaats);
        System.out.println("manager naam: " + manager.naam);
        System.out.println("manager salaris: " + manager.maandSalaris);
        System.out.println("manager personeelsnummer: " + manager.personeelsNummer);

    }


}
