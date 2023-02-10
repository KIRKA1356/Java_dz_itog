public class Laptops {
    public String model;
    public int price;
    public String colour;
    public String operatingSystem;
    public int ram_capacity;
    public int hardDiskCapacity;

    //для создания конструктора исполльзовать alt+insert - Constructor() - Выделить нужное.
    public Laptops(String model, int price, String colour, String operatingSystem, int ram_capacity, int hardDiskCapacity) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.operatingSystem = operatingSystem;
        this.ram_capacity = ram_capacity;
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public Laptops(){
    }

    //public String serch(int price2, String colour2, int ram_capacity2, int hardDiskCapacity2){
    //    if () return
    //}




    //для создания исполльзовать alt+insert - ToString() - Выделить нужное.
    @Override
    public String toString() {
        return "Laptops{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ram_capacity=" + ram_capacity +
                ", hardDiskCapacity=" + hardDiskCapacity +
                '}';
    }
//для создания исполльзовать alt+insert - Getter and Setter - Выделить нужное.

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam_capacity() {
        return ram_capacity;
    }

    public void setRam_capacity(int ram_capacity) {
        this.ram_capacity = ram_capacity;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }
}
