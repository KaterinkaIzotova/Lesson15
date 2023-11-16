import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class TemperatureDisplay implements Observer{
    String name;

    public TemperatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void updateTemperature(int temperature) {
        System.out.println(name + " " + "Текущая температура: " + temperature);
    }

}
