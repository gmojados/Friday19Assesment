package ComposeAPc;

public class PC {
    MotherBoard motherBoard;
    Case pcCase;
    Monitor monitor;

    public PC(MotherBoard motherBoard,Case pcCase,Monitor monitor) {
        this.motherBoard = motherBoard;
        this.pcCase = pcCase;
        this.monitor = monitor;
    }

    private void drawLogo (int x, int y , String Color){

    }


    public void description(){
        System.out.println("Welcome to Worst Buy below is the description of the PC on sale today...");
    }
    public void powerUp(){

        drawLogo(10,  5, "Red");
    }




}
