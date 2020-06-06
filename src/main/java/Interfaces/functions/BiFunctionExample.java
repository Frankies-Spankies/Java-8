package Interfaces.functions;

import Interfaces.predicates.PredicateInstructor;
import model.Instructor;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class BiFunctionExample {
    public static BiConsumer<Map<String,Integer>,Instructor> PUT_MAP = (m,i) -> m.put(i.nombre,i.experience);


    public static Function<BiConsumer<Map<String,Integer>,Instructor>,Function<Predicate<Instructor>, Function<Instructor, Function<Map<String,Integer>, AbstractMap<String,Integer>>>>> ADD_FILTER = accion-> predicado-> instructor-> mapa -> {
        if (predicado.test(instructor)){
            accion.accept(mapa,instructor);
        }
        return (AbstractMap<String, Integer>) mapa;
    };

}
