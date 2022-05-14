package lesson26full;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationRunner {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("lesson26full");
        final Calculator cal = appContext.getBean(Calculator.class);
        System.out.println(cal.summa());
        System.out.println(cal.divide());
    }
}
