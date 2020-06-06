package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsVsStreamsTest {

    public List<String> names;
    public Consumer<Object> print = System.out::println;
    public String dash = "----------------------------------";
    public Stream<String> namesStream;

    @BeforeEach
    void beforeEach() {
        this.names = new ArrayList<String>();
        this.names.add("Franki");
        this.names.add("Panki");
        this.names.add("Spanki");
        this.namesStream = this.names.stream();

    }


    @DisplayName("No hay remove y no se modifica la estructura")
    @Test
    void remove() {
        System.out.println(dash);
        System.out.println(this.names);
        this.names.remove("Panki");
        System.out.println(dash);
        System.out.println(this.names);
        this.print.accept(dash);
        this.namesStream.forEach(print);
    }

    @DisplayName("Solo hay un cliclo de operacion por Stream")
    @Test
    void foreach() {
        Stream<String> namesStream = this.names.stream();
        for (String name : this.names) {
            System.out.println(name);
        }
        print.accept(dash);
        
        for (String name : this.names) {
            System.out.println(name);
        }
        print.accept(dash);

        namesStream.forEach(System.out::println);
        //namesStream.forEach(System.out::println);
    }

    @Test
    void name() {
        List<String> list = namesStream.filter(s -> s.startsWith("F")).collect(Collectors.toList());
        print.accept(list);

    }
}
