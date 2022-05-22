package event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Play {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Publish publish = context.getBean(Publish.class);
        publish.publishEvents();
//        ResourceBundle resource = ResourceBundle.getBundle("text", new Locale("en", "US"));
//        log.info(resource.getString("start"));
    }

}
