package ComposeAPc;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String program){
        System.out.println(program + " is now running");
    }
}
