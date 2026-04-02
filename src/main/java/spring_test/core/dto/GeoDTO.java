package spring_test.core.dto;

public class GeoDTO {
    private double lat;
    private double lng;

    public GeoDTO() {}

    public GeoDTO(double lat,
                  double lng)
    {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() 
    {
        return this.lat;
    }

    public double getLng() 
    {
        return this.lng;
    }
}
