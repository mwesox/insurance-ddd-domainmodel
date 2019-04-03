package de.wedecom.angebot;

import de.wedecom.produkt.Produkt;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Angebot {

    private String id;
    private BigDecimal beitrag;
    private List<VersicherteGefahren> versicherteGefahren;
    private Produkt produkt;

}
