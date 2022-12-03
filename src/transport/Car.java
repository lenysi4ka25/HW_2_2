package transport;

import java.time.LocalDate;

public class Car {
    private final String model;                //марка, модель                   - приват
    private double engineCapacity;       //объём двигателя
    private String bodyColor;            //цвет автомобиля
    private final int yearOfProduction;        // год выпуска                    - приват
    private final String productionCountry;    //страна производства           -  приват
    private String transmission;         // коробка передач
    private final String bodywork;             //тип кузова                      - приват
    private String registrationMark;       //рег.знак
    private final int numberOfSeats;           // количество мест               -   приват
    private boolean typeOfRubber;      //признак «Летняя» или «Зимняя резина»
    private Key key;
    private Insurance insurance;

    public Car(String model,
               Double engineCapacity,
               String bodyColor,
               int yearOfProduction,
               String productionCountry,
               String transmission, String bodywork,
               String registrationMark, int numberOfSeats, String typeOfRubber, Key key, Insurance insurance) {
        if (model == null) {
            this.model = " default ";
        } else {
            this.model = model;
        }
        if (Double.compare(engineCapacity, 0) == 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
        if (productionCountry == null) {
            this.productionCountry = " default ";
        } else {
            this.productionCountry = productionCountry;
        }
        if (bodyColor == null) {
            this.bodyColor = "белый, ";
        } else {
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction == 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        if (transmission == null) {
            this.transmission = " МКПП ";
        } else {
            this.transmission = transmission;
        }
        if (bodywork == null) {
            this.bodywork = " седан ";
        } else {
            this.bodywork = bodywork;
        }
        if (registrationMark == null) {
            this.registrationMark = "х000хх000";
        } else {
            this.registrationMark = registrationMark;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.typeOfRubber = true;
    }
   /* public Car (String model, Double engineCapacity, String bodyColor, int yearOfProduction, String productionCountry) {
        this   (model,
                engineCapacity,
                bodyColor,
                yearOfProduction,
                productionCountry,

                "МКПП",
                "х000хх00",
                "седан",
                5,
                true,
                new Key(),
                new Insurance()
        );
    }*/

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (Double.compare(engineCapacity, 0) == 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null) {
            this.bodyColor = "белый, ";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = " МКПП ";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationMark() {
        return registrationMark;
    }

    public void setRegistrationMark(String registrationMark) {
        if (registrationMark == null) {
            this.registrationMark = " транзит ";
        } else {
            this.registrationMark = registrationMark;
        }
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodywork() {
        return bodywork;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean changeTiresForSeasonalOnes() {
        return  typeOfRubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean correctRegistrationMark() {
        if (registrationMark.length() != 9) {
            return false;
        }
        char[] chars = registrationMark.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Автомобиль - " +
                getModel() + " объём двигателя - " + getEngineCapacity() +
                " л., " + getBodyColor() + getYearOfProduction() +
                " года выпуска, " + getProductionCountry() +
                " тип коробки передач - " + getTransmission() +
                " тип кузова - " + getBodywork() +
                ", регистрационный знак - " + getRegistrationMark() +
                ", количество посадочных мест - " + getNumberOfSeats() +
                ", тип резины - " + (changeTiresForSeasonalOnes()? "летняя" : "зимняя") +
                ", тип доступа - " + (getKey().isOpenWithoutKey() ? "безключевой" : " с ключом") +
                ", тип запуска - " + (getKey().isRemoteEngineStart() ? "удаленный" : "обычный") +
                ", номер страховки - " + getInsurance().getNumber() +
                ", стоимость страховки - " + getInsurance().getPrice() +
                ", срок действия страховки - " + getInsurance().getEndDate();
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean openWithoutKey;

        public Key(boolean remoteEngineStart, boolean openWithoutKey) {
            this.remoteEngineStart = remoteEngineStart;
            this.openWithoutKey = openWithoutKey;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isOpenWithoutKey() {
            return openWithoutKey;
        }
    }

    public static class Insurance {

        private final LocalDate endDate;
        private final double price;
        private final String number;

        public Insurance(LocalDate endDate, double price, String number) {
            if (endDate == null) {
                this.endDate = LocalDate.now().plusDays(365);
            } else {
                this.endDate = endDate;
            }
            this.price = price;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 7500, null);
        }

        public LocalDate getEndDate() {
            return endDate;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void checkEndDate() {
            if (endDate.isBefore(LocalDate.now()) || endDate.isEqual(LocalDate.now())) {
                System.out.println("Необходимо срочно оформить новую страховку!");
            }

        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер некорректный!");
            }
        }
    }
}