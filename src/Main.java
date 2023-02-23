/*
Создать иерархию родительский и дочернии классы для Транспорта
Например Транспорт - > Автомобиль - > Автобус
Транспорт - > Автомобиль - > Легковой
Используем наследование, инкапсуляцию
 */
public class Main {
    public static void main(String[] args) {
        Transport privatePlane = new Avia(8, "fast", "Jet", true, 13);
        Transport fastTrain = new Train(158,"land", "fast", "train", true, 200);
        Transport ship = new Marine(680, "Passenger Ship", "slow", "Serena", "Sevastopol",
                40000);
        Transport travelBus = new Auto(7, "Auto", "Middle", "Family Bus", false,
                "middle", "Diesel");
        System.out.println("Выберите подходящий транспорт для путешествия:");
        System.out.println(privatePlane);
        System.out.println(fastTrain);
        System.out.println(ship);
        System.out.println(travelBus);

    }
}