package org.example;
import java.util.ArrayList;
import java.util.List;

public class Temperaturmanager {

    private List<Raum> raeume = new ArrayList<>();

    public void erstelleRaeume() {
        Raum raum1 = new Raum(1, 20);
        Raum raum2 = new Raum(2, 20);

        Fenster fenster11 = new Fenster(raum1);
        Fenster fenster12 = new Fenster(raum1);

        Fenster fenster21 = new Fenster(raum2);
        Fenster fenster22 = new Fenster(raum2);

        Heizung heizung11 = new Heizung(raum1);
        Heizung heizung12 = new Heizung(raum1);

        Heizung heizung21 = new Heizung(raum2);
        Heizung heizung22 = new Heizung(raum2);

        raeume.add(raum1);
        raeume.add(raum2);
    }

     public void regeleTemperatur() {
        for (Raum raum : raeume) {
            raum.regeleTemperatur();
        }
     }
}