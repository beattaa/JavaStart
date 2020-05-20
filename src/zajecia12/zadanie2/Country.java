package zajecia12.zadanie2;

public class Country {
    private String code;
    private String countryName;
    private long population;

    public Country(String code, String countryName, long population) {
        this.code = code;
        this.countryName = countryName;
        this.population = population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                '}';
    }
}
