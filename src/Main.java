public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        Flower pion = new Flower(null, "Англии", 69.9);
        pion.lifeSpan = 1;
        Flower hypsofila = new Flower(null, "Турция", 19.5);
        hypsofila.lifeSpan = 10;
        printInfo(rosa);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(hypsofila);
        System.out.println("Дополнительное задание");
        printCost(rosa,rosa,rosa,hrizantema,hrizantema,hrizantema,hrizantema,hrizantema, hypsofila);
    }
    private static void printInfo(Flower flower) {
        System.out.println(
                "Цвет - " + flower.getFlowerColor() + ", страна - " + flower.getCountry() + ", стоимость штуки - " + flower.getCost() + " , срок стояния - " + flower.lifeSpan);
    }
    private static void printCost(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if(flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета - " + totalCost);
        System.out.println("Срок стояния букета - " + minLifeSpan);
    }
}