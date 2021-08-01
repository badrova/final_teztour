package enums;

public enum TestEnum {
    GRODNO("Grodno"),
    MINSK("Minsk");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
