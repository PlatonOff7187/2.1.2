
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanAnother = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanAnother.getMessage());
        System.out.println(bean == beanAnother);
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat catAnother =  (Cat) applicationContext.getBean("cat");
        System.out.println(catAnother.getMessage());
        System.out.println(cat == catAnother);
    }
}