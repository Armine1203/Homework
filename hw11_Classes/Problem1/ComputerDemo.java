package hw11_Classes.Problem1;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(128,64);
        System.out.println(computer.getMemory());
        System.out.println(computer.getRam());

        Computer computer1 = new Computer(2000,30);
        System.out.println(computer.getMemory());
        System.out.println(computer.getRam());

        System.out.println(Computer.generateMegaComputer(1500,10000).getRam());
        System.out.println(Computer.generateMegaComputer(1500,10000).getMemory());

    }
}
