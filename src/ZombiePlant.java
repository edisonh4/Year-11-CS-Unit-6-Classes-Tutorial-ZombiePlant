public class ZombiePlant {
    //    properties
    private int potency;
    private int treatmentsNeeded;
    private boolean isDangerous;

    //    constructors
    public ZombiePlant(int potency, int treatmentsNeeded) {
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
        isDangerous = (treatmentsNeeded >= 1);
    }
    //    behaviour
    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }
    public boolean isDangerous() {
        return isDangerous;
    }
    public int getPotencyRequired() {
        return potency;
    }
    public void treat(int i){
        if (i < potency+1 && i>0 && treatmentsNeeded>0){
            treatmentsNeeded--;
        } else if (i>potency && i>0) {
            treatmentsNeeded++;
        }
        if (treatmentsNeeded == 0)
            isDangerous=false;
    }
}


