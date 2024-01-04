import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] pertanyaan = {
                "Siapakah presiden pertama Indonesia? (Tulis nama lengkap)",
                "Berapakah hasil dari 10 + 5?",
                "Apa ibukota Jepang?"
        };
        String[] jawaban = {
                "Soekarno",
                "15",
                "Tokyo"
        };

        int totalPertanyaan = pertanyaan.length;
        int skor = 100/3;

        System.out.println("Selamat datang di kuis! Jawablah pertanyaan-pertanyaan berikut.");

        for (int i = 0; i < totalPertanyaan; i++) {
            System.out.println("\nPertanyaan " + (i + 1) + ": " + pertanyaan[i]);
            System.out.print("Jawaban Anda: ");
            String jawabanPengguna = input.nextLine();

            if (jawabanPengguna.equalsIgnoreCase(jawaban[i])) {
                System.out.println("Jawaban Anda benar!");
                skor++;
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawaban[i]);
            }
        }

        System.out.println("\nKuis selesai!");
        System.out.println("Skor Anda: " + skor + " dari " + totalPertanyaan);

        input.close();
    }
}
