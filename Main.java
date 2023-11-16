/*
**Задание: Отслеживание Температуры**
Цель задания: Создать простую систему отслеживания температуры с
* использованием шаблона проектирования "Наблюдатель".

1. Создайте интерфейс `Observer`, содержащий метод `updateTemperature(int temperature)`,
*  который будет вызываться при изменении температуры.

2. Создайте класс `TemperatureSensor`, который будет являться наблюдаемым объектом.
*  У этого класса должно быть поле `temperature` и методы `getTemperature()` для получения
* текущей температуры и `setTemperature(int temperature)`, изменяющий температуру
* и вызывающий метод `notifyObservers()`.

3. Реализуйте класс `TemperatureDisplay`, который реализует интерфейс `Observer`.
* У этого класса должен быть метод `updateTemperature(int temperature)`,
* который выводит информацию о текущей температуре на экран.

4. Создайте объекты `TemperatureSensor` и `TemperatureDisplay`. Подпишите `TemperatureDisplay`
* на уведомления от `TemperatureSensor`.

5. Измените температуру в объекте `TemperatureSensor` и проверьте, что `TemperatureDisplay`
* автоматически получает уведомление и выводит новую температуру.
 */
public class Main {
    public static void main(String[] args) {
        TemperatureSensor myTemperatureSensor = new TemperatureSensor();

        Observer firstDisplay = new TemperatureDisplay("Первый дисплей");
        Observer secondDisplay = new TemperatureDisplay("Второй дисплей");

        myTemperatureSensor.observers.add(firstDisplay);
        myTemperatureSensor.observers.add(secondDisplay);

        myTemperatureSensor.setTemperature(26);
    }
}