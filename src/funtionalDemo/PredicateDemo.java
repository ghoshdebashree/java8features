package funtionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateDemo implements Predicate<Integer> {
//    @Override
//    public boolean test(Integer integer) {
//        if(integer % 2 == 0){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        Predicate<Integer> predicate = new PredicateDemo();
//        System.out.println(predicate.test(7));
//    }
//}
public class PredicateDemo{
    public static void main(String[] args) {
//        Predicate<Integer> predicate = (t) ->{
//            if(t % 2 == 0) return true;
//            else return false;
//        };
//        System.out.println(predicate.test(4));
//    }
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(13));
        List<Integer> list = Arrays.asList(1, 4, 6, 12, 13);
        list.stream().filter(predicate).forEach(t -> System.out.println("Print even :" + t)); // PREDICATE DOES THE CHECKING WITH TEST METHOD
    }
}