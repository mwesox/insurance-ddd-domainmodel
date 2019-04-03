package de.wedecom.produkt;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Produkt {

    private String id;
    private String tarif;
    private List<ProduktModul> produktModule;
    private BigDecimal grundbeitrag = BigDecimal.valueOf(33);

    public BigDecimal berechneBeitrag() {

        BigDecimal beitrag = BigDecimal.ZERO;

        Double kostenfaktor = Double.valueOf(0);

        Double value = produktModule.stream()
                .map( v -> v.getKostenFaktor())
                .reduce( Double.valueOf(0), (x, y) -> x + y);

        return BigDecimal.valueOf(value).multiply(grundbeitrag) ;
    }

}
