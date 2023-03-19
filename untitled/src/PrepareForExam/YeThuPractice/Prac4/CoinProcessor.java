package PrepareForExam.YeThuPractice.Prac4;

public class CoinProcessor {
    private int onebahtCoin;
    private int fivebahtCoin;
    private int tenbahtCoin;
    public CoinProcessor(){}
    public CoinProcessor(int onebahtCoin,int fivebahtCoin,int tenbahtCoin){
        this.onebahtCoin = onebahtCoin;
        this.fivebahtCoin = fivebahtCoin;
        this.tenbahtCoin = tenbahtCoin;
    }

    public boolean returnChange(int money, int[] coins){
        int total = onebahtCoin + 5 * fivebahtCoin + 10 * tenbahtCoin;
        if(total < money){
            return false;
        }
        int change = total - money;
        int countOne = 0; int countFive = 0; int countTen = 0;
        while(change > 0){
            if(change >= 10 && tenbahtCoin > 0){
                change -= 10;
                tenbahtCoin --;
                countTen++;
            }else if(change >= 5 && fivebahtCoin > 0){
                change -= 5;
                fivebahtCoin --;
                countFive++;
            }else if(change >= 1 && onebahtCoin > 0){
                change -= 1;
                onebahtCoin --;
                countOne++;
            }else{
                for(int i = 0; i < countTen ; i++){
                    coins[0]++;
                }

                for(int i = 0; i < countFive ; i++){
                    coins[1]++;
                }
                for(int i = 0; i < countOne ; i++){
                    coins[2]++;
                }

                return false;
            }
        }
        coins[0] = countTen;
        coins[1] = countFive;
        coins[2] = countTen;
        return true;

    }



}
