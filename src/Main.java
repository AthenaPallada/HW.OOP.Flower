public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза", "Голландия", 35.59);
        Flower hrizantema = new Flower("Хризантема", null, 15);
        hrizantema.setLifeSpan(5);
        Flower pion = new Flower("Пион", "Англии", 69.9);
        pion.setLifeSpan(1);
        Flower hypsofila = new Flower("Гипсофила", "Турция", 19.5);
        hypsofila.setLifeSpan(10);
        System.out.println(rosa);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(hypsofila);
        System.out.println("Дополнительное задание");
        Bouquet bouquet = new Bouquet(
                new Flower[] {
                        rosa, rosa, rosa,
                        hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                        hypsofila
                }
        );
        bouquet.printCost();
    }
}