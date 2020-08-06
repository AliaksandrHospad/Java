package trains;

public class Main  {

    public static void main(String[] args) {
        int totalNumberOfPassengers =0;
        int totalBaggage =0;
        WagonsTrain key = new WagonsTrain();

/// Подсчитать общую численность пассажиров и багажа.
        for (int i =0; i<key.wagons.size(); i++){
            totalNumberOfPassengers = key.wagons.get(i).getWagonCapacity() + totalNumberOfPassengers;
            totalBaggage = key.wagons.get(i).getBaggageQuantity() + totalBaggage;
        }
        System.out.println("total number of passengers="+ totalNumberOfPassengers + " "+ "total baggage=" + totalBaggage);
        System.out.println();

// Провести сортировку вагонов поезда на основе уровня комфортности.
        key.wagons.sort(new WagonsTypeComparator());
        for (int i =0; i<key.wagons.size(); i++){
            System.out.println(key.wagons.get(i).getType() +"; "  + "wagonCapacity= " + key.wagons.get(i).getWagonCapacity() +"; " +
                    ""+ "baggageQuantity=" + key.wagons.get(i).getBaggageQuantity());
        }
        System.out.println();

//Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
            for (int i =0; i<key.wagons.size(); i++){
                if (key.wagons.get(i).getWagonCapacity() > 30 && key.wagons.get(i).getWagonCapacity()<40) {
                    System.out.println("wagon number in which from 30 to 40 passengers= №" + (i+1));
                }
            }
    }
}
