public class Mercedes extends Car {
    private String classType;

    public Mercedes(){};

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


    @Override
    public void ride() {
        System.out.println("NAME: " + name + " MODEL: " + model + " MAXSPEED: " + maxSpeed + " YEAR: " + year + " VOLUME: " + volume +
                " CLASSTYPE " + classType +" is ridding");
    }
}
