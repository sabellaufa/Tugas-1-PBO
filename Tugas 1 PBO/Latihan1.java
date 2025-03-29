import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        //jendela input untuk memasukkan nama mata kuliah
        String mataKuliah = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?", "input", JOptionPane.QUESTION_MESSAGE);

        //periksa jika pengguna menekan ok (tidak membatalkan)
        if (mataKuliah != null && !mataKuliah.isEmpty()) {
            //buat pesan yang akan ditampilkan 
            String pesan = "Belajar " + mataKuliah + "sangat mudah";

            //tampilkan pesan dalam jendela dialog
            JOptionPane.showConfirmDialog(null, pesan, "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "input dibatalkan.", "peringatan", JOptionPane.WARNING_MESSAGE);

        }
    }
    
}
