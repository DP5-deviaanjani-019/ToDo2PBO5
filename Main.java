import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] namaTumbuhan = {"Anggrek", "Pohon Bambu", "Mawar", "Paku", "Beringin", "Toge"};

        Random rand = new Random();
        String namaRandom = namaTumbuhan[rand.nextInt(namaTumbuhan.length)];
        String jenisRandom = "Angiosperma"; 
        int tinggiRandom = rand.nextInt(500); 

        Tumbuhan tumbuhan1 = new Tumbuhan(namaRandom, jenisRandom, tinggiRandom);

        tumbuhan1.info();
        tumbuhan1.tumbuh(5); 
    }
}
