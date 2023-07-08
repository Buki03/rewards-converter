public class RewardValue {
    private double cashValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convert_from_miles_to_cash(milesValue);
    }

    // Getter for cashValue
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convert_from_cash_to_miles(this.cashValue);
    }

    private static int convert_from_cash_to_miles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private static double convert_from_miles_to_cash(int milesValue) {
        return milesValue * 0.0035;
    }
}