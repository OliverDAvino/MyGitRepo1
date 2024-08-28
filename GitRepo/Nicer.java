public class Nicer{
    public static void main(String[]args){
        int x1 = -2;
        int y1 = -3;
        int x2 = 2;
        int y2 = 1;
        int a1 = (x2-x1);
        int b1 = (y2-y1);
        double c1 = Math.pow(a1,2);
        double c2 = Math.pow(b1,2);
        double result = Math.sqrt(c2+c1);
        System.out.println(result);
    }
}