import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println();

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getName() + " " + beanCatOne.getAge());
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatTwo.getName() + " " + beanCatTwo.getAge());

        System.out.println();

        System.out.println(bean == bean2);
        System.out.println(beanCatOne == beanCatTwo);
    }
}