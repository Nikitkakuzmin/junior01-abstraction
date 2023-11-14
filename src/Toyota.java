public class Toyota extends Car {
    private String manufacturer;

    public Toyota (){};

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }




    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public void ride() {
        System.out.println("NAME: " + name + " MODEL: " + model + " MAXSPEED: " + maxSpeed + " YEAR: " + year + " VOLUME: " + volume +
                " MANUFACTURER: " + manufacturer +" is ridding");
    }
}
