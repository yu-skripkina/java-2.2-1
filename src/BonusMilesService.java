public class BonusMilesService {
    public int calculate(int cost) {

        int bonusPrise = 20;
        int miles = cost / bonusPrise;

        return miles;
    }
}

