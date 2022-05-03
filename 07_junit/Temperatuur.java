public class Temperatuur {
    double celsius;
    public Temperatuur(double celsius) {
        this.celsius = celsius;
    }

    public double teisendaFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public double teisendaKelvin() {
        return celsius + 273.15;
    }
}