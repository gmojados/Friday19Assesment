package ComposeAPc;

public class Monitor {
    String model;
    String manufacturer;

    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.manufacturer = manufacturer;
        this. model = model;
        resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at" + x + y + "in color " + color);


  }

}
