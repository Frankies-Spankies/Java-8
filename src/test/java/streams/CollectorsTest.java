package streams;

import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    @Test
    void mapping() {
        List<String> nombres = Instructors.getInstructors().stream().
                collect(Collectors.mapping(Instructor::getNombre,Collectors.toList()));
        nombres.forEach(System.out::println);
    }

    @Test
    void minBy() {
        Instructors.getInstructors().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getExperience))).ifPresent(System.out::println);
    }

    @Test
    void maxBy() {
        Instructors.getInstructors().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getExperience))).ifPresent(System.out::println);
    }

    @Test
    void summingInt() {
        int suma = Instructors.getInstructors().stream().collect(Collectors.summingInt(Instructor::getExperience));
        System.out.println(suma);
    }

    @Test
    void averageInt() {
        double suma = Instructors.getInstructors().stream().collect(Collectors.averagingInt(Instructor::getExperience));
        System.out.println(suma);
    }

    @Test
    void groupBy1() {
/*      Map<List<String>, List<Instructor>> map =  Instructors.getInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getSkils));
      map.forEach((k,v)-> System.out.println(k +" : "+v));*/

      Map<String, List<String>> map2 =Instructors.getInstructors().stream()
              .collect(Collectors.groupingBy(i -> {
                        if (i.nombre.startsWith("F"))
                            return "Tipo Frank";
                          if (i.nombre.startsWith("P"))
                              return "Tipo Panki";
                          return "Tipo Spanki";
                      }
                      ,Collectors.mapping(Instructor::getNombre,Collectors.toList())));

        System.out.println(map2);
    }

    @Test
    void online_exp() {
        Map<Boolean, Instructor> map = Instructors.getInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getExperience)),
                                Optional::get
                        )
                ));
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

    @Test
    void online_average() {
        Map<Boolean, Double> map = Instructors.getInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.averagingInt(Instructor::getExperience)
                ));
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

    @Test
    void statistical_summary() {
        Map<Boolean, IntSummaryStatistics> map = Instructors.getInstructors().stream()
                .collect(Collectors.groupingBy(Instructor::getOnlineCourses,
                        Collectors.summarizingInt(Instructor::getExperience)
                ));
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
