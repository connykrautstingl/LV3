public class Konto {

    private String inhaber;
    private double kontostand;
    private int idNumber; //1....99999

    public static int s_anzahlKonto = 10;


    public Konto(String inhaber){
        //Konstruktor
        this.inhaber = inhaber;
        kontostand = 0;
        this.idNumber = ++s_anzahlKonto;
    }

    public void setInhaber(String inhaber){
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public void aufbuchen(double betrag){
        if (betrag > 0){
            kontostand = kontostand + betrag;
        }
        else {
            System.out.println("Nur Werte > 0 sind erlaubt!");
        }
    }

    public void abbuchen(double betrag){
        if (kontostand >= betrag){
            kontostand -= betrag;
        }
        else {
            System.out.println("Nicht genügend Geld am Konto");
        }
    }

    public void print(){
        System.out.println("Kontoinhaber: " + inhaber + "; Kontostand: " + kontostand + "; IDNummer: " + idNumber);
    }
}

