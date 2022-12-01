public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", 35, "бренд-менеджером");
        Human ann = new Human("Аня", "Москва", 29, "методистом образовательных программ");
        Human kat = new Human("Катя", "Калининград", 28, "продакт менеджером");
        Human artem = new Human("Артём" , "Москва", 27, "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир" , "Казань", 21, null);
        System.out.println("Задание 1");
        System.out.println(" ");
        System.out.println(maksim);
        System.out.println(ann);
        System.out.println(kat);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println(" ");
        Flower roza = new Flower("Роза обыкновенная", null, "Голландии", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема", null, null, 15.00, 5);
        Flower pion = new Flower("Пион", null, "Англии", 69.90, 1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турции", 19.50, 10);
        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);
    }
}