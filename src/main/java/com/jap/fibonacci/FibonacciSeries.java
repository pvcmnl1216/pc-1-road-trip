package com.jap.fibonacci;

public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long number) {
        if(number == 0){
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        if( number < -1){
            return -1;
        }
        else{
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    public void printFibonacciSeries(long number){
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        int number = 8;
        // Call the  printFibonacciSeries() method and pass the value.
        fib.printFibonacciSeries(number);



    }
}