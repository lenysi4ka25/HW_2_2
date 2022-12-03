import transport.Car;

import java.time.LocalDate;

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
        System.out.println(" ");
        System.out.println("Задание 3");
        System.out.println(" ");
        Car ladaGranta = new Car("Lada Granta, ", 1.7, "желтого цвета, ", 2015,
                "сборка в России,", "автомат", "седан", "А564РО586",
                5,null, null, null);
        Car audi = new Car("Audi A8 50 L TDI quattro, ", 3.0, "черный цвет кузова, ", 2020,
                "сборка в Германии,", null, null, null,
                5, null, null, null);
        Car bmw = new Car("BMW Z8,", 3.0, "черный цвет кузова, ", 2020,
                "сборка в Германии,", null, null, "М159ТХ145",
                5, null, null, null);
        Car kiasportage = new Car("Kia Sportage 4-го поколения,", 2.4, "цвет кузова - красный, ", 2018,
                "сборка в Южной Корее,", null, "универсал", "М945ММ578",
                5, null, null, null);
        Car hyundaiavante = new Car("Hyundai Avante,", 1.6, "цвет кузова - оранжевый, ", 2016,
                "сборка в Южной Корее,", "АКПП", null, null,
                5, "зимняя", null, null);
        System.out.println(ladaGranta);
        ladaGranta.setRegistrationMark("c4567v789");
        System.out.println(ladaGranta.correctRegistrationMark());
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kiasportage);
        kiasportage.setInsurance(new Car.Insurance(LocalDate.now(), 6300, "850560"));
        kiasportage.getInsurance().checkEndDate();
        kiasportage.getInsurance().checkNumber();
        System.out.println(hyundaiavante);
    }
}