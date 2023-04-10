public class RewardValue {
    private double total;
    public RewardValue(double total){
        this.total = total;
    }
    public double getCashValue(){
        return this.total;
    }
    public double getMilesValue(){
        return this.total*0.0035;
    }
}
