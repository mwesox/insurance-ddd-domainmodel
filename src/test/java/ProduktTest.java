import com.google.common.collect.Lists;
import de.wedecom.produkt.Produkt;
import de.wedecom.produkt.ProduktModul;
import de.wedecom.produkt.VersicherteGefahr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProduktTest {


    @Test
    public void test1() {
        Produkt p = new Produkt();

        ProduktModul hagelModul = new ProduktModul();
        hagelModul.setGefahr(new VersicherteGefahr());
        hagelModul.setKostenFaktor(1.2);

        ProduktModul wasserModul = new ProduktModul();
        wasserModul.setGefahr(new VersicherteGefahr());
        wasserModul.setKostenFaktor(1.1);

        p.setProduktModule(Lists.newArrayList(hagelModul, wasserModul));

        assertEquals(p.berechneBeitrag(), BigDecimal.valueOf(75.9));

    }

}
