import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloworld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloworld1.getMessage());

        HelloWorld helloworld2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(helloworld1 == helloworld2);
        System.out.println(cat1 == cat2);
    }
}