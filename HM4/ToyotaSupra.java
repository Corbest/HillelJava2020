package ua.od.hillel;

public class ToyotaSupra {
    private String name;
    private double fuelTank;
    private double residueInTheTank;
    private double fuelOn100km;
    private double speed = 250;
    private double roadToKiev;
    private double roadToKrivoe;
    private double roadToJahkov;
    private double fuelPriceFor1L;
    private double formula1Km;

    ToyotaSupra() {
        name = "ToyotaSupra";
        residueInTheTank = 0;
        fuelPriceFor1L = 27.20;
        fuelOn100km = 7.6;
        roadToKrivoe = 177.8;
        roadToJahkov = 157;
        roadToKiev = 302;
        fuelTank = 52;
        formula1Km = fuelOn100km / 100;
    }

    void checkTank() {
        System.out.println(" Сейчас в баке: " +(int)residueInTheTank+" литров");
    }
    void addFuelInTank() {
        this.residueInTheTank = this.fuelTank;
        System.out.println("Вы заполнили полный 6ак");
        if (this.fuelTank >= 52)
            System.out.println("Заправка дальше не возможна");
    }
    void Krivoe() {
        double result = this.fuelOn100km / 100 * this.roadToKrivoe;
        this.residueInTheTank -= result;
        if (this.residueInTheTank < 0) {
            this.residueInTheTank = 0;
            this.fuelTank = this.residueInTheTank;
            System.out.println("Вы не можете двигаться");
        } else
            System.out.println("Вы доехали до Кривого Озера");
        checkTank();
    }

    void Jahkov() {
        double result = this.fuelOn100km / 100 * this.roadToJahkov;
        this.residueInTheTank -= result;
        if (this.residueInTheTank < 0) {
            this.residueInTheTank = 0;
            this.fuelTank = this.residueInTheTank;
            System.out.println("Вы не можете двигаться");
        } else
            System.out.println("Вы доехали до Жашкова");
        checkTank();
    }
    void Kiev() {
        double result = this.fuelOn100km / 100 * this.roadToKiev;
        this.residueInTheTank -= result;
        if (this.residueInTheTank < 0) {
            this.residueInTheTank = 0;
            this.fuelTank = this.residueInTheTank;
            System.out.println("Вы не можете двигаться");
        } else
            System.out.println("Вы доехали до Киева");
        checkTank();
    }
    void howFuelNeed() {
        double result = fuelTank - this.residueInTheTank;
        double result1 = 27.20 * result;
        System.out.println("Нужно заправить 6ензина : "+result);
        System.out.println("Стоимость дозаправки : "+result1+"грн.");
    }
    double Fuel() {
        return this.residueInTheTank;
    }
}
