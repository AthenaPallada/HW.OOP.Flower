import java.util.Arrays;
import java.util.Locale;

public class Bouquet {
    private final Flower[] flowers;
    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }
    private double calculateCost() {
        double totalCost = 0;
        for(Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost * 1.1;
    }
    private int calculateLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if(flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
    public void printCost() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета: ").append("\n");
        double totalCost = calculateCost();
        int minLifeSpan = calculateLifeSpan();
        for (Flower flower : flowers) {
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета - ").append(minLifeSpan).append(" дн").append("\n");
        result.append("Стоимость букета - ").append(String.format(Locale.US,"%.2f", totalCost)).append(" руб");
        return result.toString();
    }
}