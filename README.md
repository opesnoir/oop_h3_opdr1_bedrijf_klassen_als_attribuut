# oop_h3_opdracht1_bedrijf_klassen_als_attribuut
klassen als attribuut
unidirectionele relatie

klassen-attribuut als array
model als array
data opvragen uit klassen (met klassen als attribuut en unidirectionele relatie)

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

        //print code
        System.out.printf("Het aantal personen in het bedrijf is %d.\n", Persoon.aantalPersonen);
        System.out.printf("%s werkt in %s en woont in %s.\n", baas.getNaam(), baas.getAfdeling().getAfdelingsPlaats(), baas.getWoonplaats());
        System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n", medewerker.getNaam(), medewerker.getAfdeling().getAfdelingsNaam(), medewerker.getMaandSalaris());
        System.out.printf("%s werkt op de afdeling %s en woont in %s\n", assistent.getNaam(), assistent.getAfdeling().getAfdelingsNaam(), assistent.getWoonplaats());