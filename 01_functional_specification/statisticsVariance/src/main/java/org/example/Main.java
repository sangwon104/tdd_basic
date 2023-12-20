package org.example;
public class Main {
    public static void main(String[] args) {
        double[] inputs = new double[args.length];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Double.parseDouble(args[i]);
        }

        double sum = 0.0;
        for (double input : inputs) {
            sum += input;
        }

        double mean = sum / (inputs.length);

        double sumOfSquares = 0.0;

        for (double input : inputs) {
            sumOfSquares += ((input - mean) * (input - mean));
        }

        double variance = sumOfSquares / (inputs.length - 1);

        System.out.println("variance : " + variance);
    }
}