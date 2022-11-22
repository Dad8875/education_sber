package ru.dad.task3_3.task4;


public class Participant {
    private Dog dog;
    private double[] dogRating;
    protected double resultRating;

    public Participant(Dog dog, double[] dogRating) {
        this.dog = dog;
        this.dogRating = dogRating;
        resultRating = averageRating(dogRating);
    }

    public double averageRating(double[] dogRating) {
        double result = 0;
        for (double v : dogRating) {
            result += v;
        }
        return (int) (result / dogRating.length * 10) / 10.0;
    }

    @Override
    public String toString() {
        return dog + ", " + resultRating;
    }
}
