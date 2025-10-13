package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return  1.8 * temperatureCelsius + 32.0;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s",
                temperatureCelsius, temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double convertedToCelsius = (tempFahrenheit - 32) * 5 / 9;
        return new WeatherData(convertedToCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData d1 = new WeatherData(25.0, "Sunny");
        WeatherData d2 = new WeatherData(10.0, "Cloudy");

        System.out.println("Today's weather : " + d1.getSummary());
        System.out.println("Yesterday's weather : " + d2.getSummary());
    }
}
