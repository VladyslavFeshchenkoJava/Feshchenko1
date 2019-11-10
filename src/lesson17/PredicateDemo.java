package lesson17;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String str="JAAJ";
        Predicate<String> notEmpty= f->f.isEmpty();
        Predicate<String> notNull=f->f!=null;
        System.out.println(notEmpty.and(notNull).test(str));

        Predicate<String>startN_Or_J_EndA=f->(f.startsWith("N")||f.startsWith("J"))&&f.endsWith("A");
        System.out.println(startN_Or_J_EndA.test(str));
    }
}
