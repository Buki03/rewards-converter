public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a value in miles as an int
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    // Getter for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter for milesValue
    public double getMilesValue() {
        return milesValue;
    }
}