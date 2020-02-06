package FerdiExamples;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/*
Betrachten wir als Beispiel ein Konto, bei der es eine Variable für den Kontostand "stand" gibt.
Die Anzeige diese Variable soll sich bei jeder Veränderung aktualisiert werden.
 */

public class Konto {
    // Constructor
    public Konto(double hoehe){setStand(hoehe);}


    // kabselndes Objekt
    // --> stellt die Benachrichtigungsfunktionalität bereit
    private DoubleProperty stand;

    // Getter & Setter
    public final double getStand() {if (stand != null) return stand.get();return 0;}
    public final void setStand(double hoehe) { this.standProperty().set(hoehe);}
    // Methode, welche die Properties-Funktionalität bereitstellt
    // gibt den Zustand der Variable zurück
    public final DoubleProperty standProperty() {
        if (stand == null) {
            stand = new SimpleDoubleProperty(0);
        }
        return stand;
    }
} 