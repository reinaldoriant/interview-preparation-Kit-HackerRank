import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Ruang Aldo.
 */

class countWord {
    public static void CountOperation(String userInput) {
        String input = userInput.toUpperCase();
        int i, j;
        int[] alphabetArray = new int[26];
        for (i = 0; i <= 25; i++) alphabetArray[i] = 0;
        for (i = 0; i < userInput.length(); i++)
            for (j = 'A'; j <= 'Z'; j++) {
                char ch = input.charAt(i);
                if ((int) ch == j) {
                    alphabetArray[j - 65]++;
                }
            }

        for (j = 'A'; j <= 'Z'; j++) {
            char az = (char) j;
            System.out.println(az + "  : " + alphabetArray[j - 65]);
        }
    }

    public static void main(String[] args) {
        /*Input with more lines*/
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(in)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] tokens = line.split(" ");
                CountOperation(Arrays.toString(tokens));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*data is declared*/
        /* String dataInput = "Perjalanan penuh kisah milik bangsa Indonesia dan dunia dalam kurun waktu setengah abad ini telah terabadikan. Pada 28 Juni 2015, usia 50 tahun dicapai oleh harian umum yang didirikan PK Ojong (1920â€“1980) dan Jakob Oetama ini. Usia emas menjadi pertanda harian ini mampu terus hadir menemani langkah-langkah Indonesia untuk terus menginspirasi dan menjadi Amanat Hati Nurani Rakyat.\n" +
                "\n" +
                "Dalam rangka merayakan usia 50 tahun ini, Kompas mengadakan acara Inspira(k)si. Acara ini mencakup berbagai macam program, yaitu Inspi Baca, Inspi Kendara, Inspi Sinema, Inspi Rasa, Inspi Rehat, dan Inspi Vision. Untuk dapat turut serta dalam program-program tersebut, pembaca Kompas bisa memanfaatkan kupon-kupon yang ada di koran ini pada edisi 28 Juni.\n" +
                "\n" +
                "Berbagai promosi menarik di tiap Inspi dapat dinikmati dengan menyertakan koran Kompas dan memiliki kartu Flazz BCA atau Mandiri e-money. Inspi Baca mempersembahkan potongan harga senilai Rp 50.000. Inspi Rasa, Inspi Rehat, dan Inspi Vision menghadirkan diskon 50 persen. Sementara itu, pembaca Kompas juga dapat menikmati Inspi Kendara naik Transjakarta serta Inspi Cinema dengan menonton film Terminator dan Minions di beberapa studio Bioskop XXI hanya dengan Rp 50.\n" +
                "\n";
        CountOperation(dataInput);*/
    }
}