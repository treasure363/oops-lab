//WAJP to find simple interest

public class SimpleInterest {
    public static void main(String[] args) {
        int time = 5;
        double principle = 10000, rate = 2.5, si;
        si = (principle * rate * time) / 100;
        System.out.println("Principle: " + principle + "\tRate: " + rate + "\tTime: " + time);
        System.out.println("Simple Interest: " + si);
    }    
}
