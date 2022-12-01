public class Flower {

    public String flower;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flower, String flowerColor, String country, double cost, int lifeSpan) {

        this.flower = flower;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = " белого цвета,";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "России";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1;
        }else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return flower + "," + getFlowerColor() + " из " +  getCountry() + " стоимость за штуку - " + getCost() + " руб., срок стояния - " +  lifeSpan + " дней";
    }
}
