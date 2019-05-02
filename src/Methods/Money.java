package Methods;

public class Money {
    public static void main(String[] args) {
        String[][] test_money = {
                                 {"mark","5"},
                                 {"shekel","30"},
                                 {"yen", "2"}
                                 };

        String[][] test_convert= {
                                  {"yen","1"},
                                  {"shekel","0.5"},
                                  {"mark", "2"}
                                 };

        double res = convertC(test_money,test_convert);
        System.out.print(res);
    }
    public static  double convertC(String[][] money,String[][] convertionRate){
        double mult =0;
        for(int i=0; i < money.length; i++){
            for(int j=0; j<convertionRate.length; j++) {
                if (money[i][0] == convertionRate[j][0]) {
                    mult += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[j][1]);
                }
            }
        }
        return mult;


    }

}
