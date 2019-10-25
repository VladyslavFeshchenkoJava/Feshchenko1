package lesson15;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s!=null;
        Predicate<String> predicate2 = s -> !s.isEmpty();
Predicate<String> andPredicate = predicate1.and(predicate2);
        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("ffff"));
        System.out.println();
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("tttt"));
        System.out.println();
        System.out.println(predicate1.and(predicate2).test("aaaa"));
    }
}
