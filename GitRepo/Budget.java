public class Budget{
    public static void main(String[]args){
        double total1 = 1000.0;
        double food1 = 200.0;
        double transport = 150.0;
        double entertainment = 300.0;
        double cost1 = (food1+transport+entertainment);
        double result = (total1-cost1);
        System.out.println(result);
    }
}