public class Main {
    public static void main(String[] args){
        Calculator sum = (a,b) -> a+b;
        Calculator diff = (a,b) -> a-b;
        Calculator prod = (a,b) -> a*b;
        Calculator quo = (a,b) -> a/b;

        System.out.println("Sum: " + sum.calc(3,2));
        System.out.println("Difference: " + diff.calc(3,2));
        System.out.println("Product: " + prod.calc(3,2));
        System.out.println("Quotient: " + quo.calc(3,2));
    }
}
