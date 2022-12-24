import Adaptee.WeighingMachineForBabies;
import Adaptee.WeighingMachineForMen;
import Adapter.WeighingMachineAdapter;
import Adapter.WeighingMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {

        WeighingMachineAdapter weighingMachineAdapter1 = new WeighingMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(weighingMachineAdapter1.getWeightInKg());

        WeighingMachineAdapter weighingMachineAdapter2 = new WeighingMachineAdapterImpl(new WeighingMachineForMen());
        System.out.println(weighingMachineAdapter2.getWeightInKg());

    }
}