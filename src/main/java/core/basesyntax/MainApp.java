package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Створюємо масив типу Machine і кладемо туди наші об'єкти
        Machine[] machines = new Machine[] {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        // Проходимо циклом по кожній машині
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
