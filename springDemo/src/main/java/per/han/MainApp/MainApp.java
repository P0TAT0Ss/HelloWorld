package per.han.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.han.PO.User;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Beans.xml");
        User user = (User) context.getBean("User");
        System.out.println(user.toString());
    }
}
