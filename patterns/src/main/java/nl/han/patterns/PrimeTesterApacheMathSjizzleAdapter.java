package nl.han.patterns;

import org.apache.commons.math3.primes.Primes;

public class PrimeTesterApacheMathSjizzleAdapter implements PrimeTester {

    public boolean isPrime(int number) {
        return Primes.isPrime(number);
    }
}
