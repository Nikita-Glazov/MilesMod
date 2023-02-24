public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        int OneMile = 20;
        miles = cost / OneMile;
        return miles;
    }
}
