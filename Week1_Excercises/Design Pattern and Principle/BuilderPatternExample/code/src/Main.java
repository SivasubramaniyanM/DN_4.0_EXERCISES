public class Main {
    public static void main(String[] args) {
        // Basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11 Pro")
                .build();

        // Developer Computer
        Computer devComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Ubuntu 22.04 LTS")
                .build();

        System.out.println("🖥️ Basic Computer:\n" + basicComputer);
        System.out.println("\n🎮 Gaming Computer:\n" + gamingComputer);
        System.out.println("\n💻 Developer Computer:\n" + devComputer);
    }
}
