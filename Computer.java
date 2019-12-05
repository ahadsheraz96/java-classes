public class Computer {

    public int ram;
    public int hd;
    public double cpuSpeed;
    public boolean on = false;

//    public Computer(int ram, int hd, double cpuSpeed) {
//        this.ram = ram;
//        this.hd = hd;
//        this.cpuSpeed = cpuSpeed;
//    }

    public void start() {

        if(on){
            System.out.println("It's already ON.");
        }
        else {
            System.out.println("Starting...");
            on = true;
        }
    }

    public void shutdown(){
        if(!on){
            System.out.println("It's already OFF.");
        }
        else {
            System.out.println("shutting down");
            on = false;
        }

    }
}
