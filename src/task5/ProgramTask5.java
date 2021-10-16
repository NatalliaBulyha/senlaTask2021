package task5;

public class ProgramTask5 {
    public void startTask5() {
        BagFiller bf = new BagFiller();

        BagFiller bf1 = bf.create();
        bf1.printResultBeforeOptimizeBag();
        Backpack bp = bf1.getOptimizeBag();
        bp.printResultAfterOptimizeBag();


    }
}
