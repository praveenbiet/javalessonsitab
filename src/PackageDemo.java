package src;
import src.prime.*;
public class PackageDemo {
    public static void main(String[] args) {

        Prime prime = new Prime();
        boolean result = prime.isprime(16);
        System.out.println(result);
    }
}
