//package practiceMyself;
//
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//
//interface Caculator{
//    public double getResult();
//    public void clear();
//    public void add(double input);
//
//    public void substract(double input);
//    public void multiply(double input);
//    public void divide(double input);
//
//
//
//}
//
//
//public class BasicCalculator implements Caculator{
//    private double result;
//
//    public BasicCalculator(){
//    }
//
//
//    @Override
//    public double getResult() {
//        return result;
//    }
//
//    @Override
//    public void clear() {
//        result = 0;
//
//    }
//
//    @Override
//    public void add(double input) {
//        result += input;
//
//    }
//
//    @Override
//    public void substract(double input) {
//        result -= input;
//
//    }
//
//    @Override
//    public void multiply(double input) {
//        result *= input;
//
//    }
//
//    @Override
//    public void divide(double input) {
//        result /= input;
//    }
//}
//class main {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        BasicCalculator cal = new BasicCalculator();
//        String expression = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(expression);
//        int count = 1;
//        String operator = "";
//        while (st.hasMoreTokens()) {
//            //System.out.println(st.nextToken());
//            if(count==1){
//                cal.add(Double.parseDouble(st.nextToken()));
//            }
//            else{
//                if(count%2==1){
//                    operator = st.nextToken();
//                }
//                else{
//                    switch(operator){
//                        case "+": cal.add(Double.parseDouble(st.nextToken())); break;
//                        case "-": cal.substract(Double.parseDouble(st.nextToken())); break;
//                        case "/": cal.divide(Double.parseDouble(st.nextToken())); break;
//                        case "*": cal.multiply(Double.parseDouble(st.nextToken())); break;
//                    }
//                }
//            }
//            count++;
//        }
//        System.out.println(cal.getResult());
//    }
//}