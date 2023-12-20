package org.example;
public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("입력된 값이 없습니다.");
            return;
        }

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