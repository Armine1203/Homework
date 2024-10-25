package hw11_Classes.Problem1;

public class Computer {
    private int id = 1;
    private int memory;
    private int ram;
    private static final int MAX_MEMORY = 2000;//2 TB -> 2000 GB
    private static final int MIN_MEMORY = 128;//128GB

    private static final int MIN_RAM = 4;//4 GB
    private static final int MAX_RAM = 64;//64 GB

    public Computer() {
    }

    public Computer(int memory, int ram) {
        if (memory > MAX_MEMORY) {
            System.out.println("Maximum memory is " + MAX_MEMORY + ". Please try again!");
            System.exit(5);
        } else if (memory < MIN_MEMORY) {
            System.out.println("Minimum memory is " + MIN_MEMORY + ". Please try again!");
            System.exit(5);
        }
        if (ram > MAX_RAM) {
            System.out.println("Maximum ram is " + MAX_RAM + ". Please try again!");
            System.exit(5);
        } else if (ram < MIN_RAM) {
            System.out.println("Minimum ram is " + MIN_RAM + ". Please try again!");
            System.exit(5);
        }
        this.setId(id++);
        this.setMemory(memory);
        this.setRam(ram);
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Computer generateMegaComputer(int memory, int ram) {
        Computer computer = new Computer();
        computer.setMemory(memory);
        computer.setRam(ram);
        return computer;
    }
}
