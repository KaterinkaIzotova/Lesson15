import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    int temperature;
    ArrayList<Observer> observers;

    public TemperatureSensor() {
        observers = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.updateTemperature(this.temperature);
        }
    }
}
