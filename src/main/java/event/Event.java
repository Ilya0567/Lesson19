package event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent{

    private final int number;

    public Event(int number) {
        super(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
