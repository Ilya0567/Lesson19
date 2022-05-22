package event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@Slf4j
public class Publish implements ApplicationContextAware {

    private ApplicationContext context;

    public void publishEvents() throws InputMismatchException {

        ResourceBundle resource = ResourceBundle.getBundle("text", new Locale("en", "US"));

        log.info(resource.getString("start"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int digit = scanner.nextInt();
                context.publishEvent(new Event(digit));
            } catch (InputMismatchException e) {
                log.info(resource.getString("input"));
            }

        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
