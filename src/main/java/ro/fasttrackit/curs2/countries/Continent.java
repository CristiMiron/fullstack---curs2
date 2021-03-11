package ro.fasttrackit.curs2.countries;

import java.util.Optional;
import java.util.stream.Stream;

public enum Continent {
    EUROPE(true,1234567),
    ASIA(true,123456789),
    AFRICA(false,56662256),
    AMERICA(true,456232655),
    AUSTRALIA(false,45451216);

    private final boolean isNorthHemisphere;
    private final long area;

    Continent(boolean isNorthHemisphere, long area){
        this.isNorthHemisphere = isNorthHemisphere;
        this.area = area;
    }

    public boolean isNorthHemisphere() {
        return isNorthHemisphere;
    }

    public long getArea() {
        return area;
    }

    public  static Optional<Continent> of (String continentName){
        return Stream.of(values())
                .filter(val -> val.name().equalsIgnoreCase(continentName))
                .findFirst();
    }
}
