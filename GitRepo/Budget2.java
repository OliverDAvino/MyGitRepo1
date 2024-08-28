public class Budget2{
    public static void main(String[]args){
        double total1 = 750.0;
        double food1 = 180.0;
        double transport = 90.0;
        double entertainment = 120.0;
        double cost1 = (food1+transport+entertainment);
        double result = (total1-cost1);
        System.out.println(result);
    }
}