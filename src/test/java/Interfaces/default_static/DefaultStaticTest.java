package Interfaces.default_static;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DefaultStaticTest {

    @Test
    void sort() {
        List<String> nombres = Arrays.asList("Franki","Panki","Spanki");
        nombres.sort(Comparator.naturalOrder());

        LinkedList<String> nombreLink = new LinkedList<>(nombres);
        nombreLink.sort(Comparator.naturalOrder());
        System.out.println(nombreLink);;
    }
}
