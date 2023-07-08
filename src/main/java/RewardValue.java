public class RewardValue{
    private double cash;
    private double miles;

    RewardValue(double cash_input)
    {
        cash = cash_input
    }
    RewardValue(double miles_input, boolean isMiles)
    {
        if (isMiles)
            miles = miles_input
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        miles = cash * 0.0035;
        return miles;
    }
}