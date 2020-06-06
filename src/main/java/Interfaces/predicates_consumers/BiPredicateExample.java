package Interfaces.predicates_consumers;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static BiPredicate<Boolean,Integer> ONLINE_AND_G_10_EXPERIENCE = (online,experience) -> online==true && experience>10;

}
