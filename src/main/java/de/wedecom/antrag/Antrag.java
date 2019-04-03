package de.wedecom.antrag;

import de.wedecom.angebot.Angebot;
import de.wedecom.produkt.Produkt;

public class Antrag {

    private Antragssteller antragssteller;

    private Produkt produkt;

    public void uebernehmeAngebotInAntrag(Angebot angebot) {
        this.produkt = angebot.getProdukt();
    }

}
