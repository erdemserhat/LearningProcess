import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// İlgili değişkenlerin bütün fonksiyonların içerisinde erişilebilir olması için
	// Sınıf altında tanımlanmış değikenler.
	static char[][] matrix = new char[20][20];
	static Scanner scan;
	static char[][] roadOutLine = new char[20][20];

	public static void main(String[] args) throws FileNotFoundException {

		// labirent.txt dosyasının diziye aktarılmasının gerçekleştirilmesi
		// Dosya yolunu bir alt satırdaki constructor'a parametre olarak giriniz.
		File file = new File(
				"C:\\development\\eclipse-java-2022-09-R-win32-x86_64\\eclipse\\workspace\\labyrinth\\src\\metin.txt");
		scan = new Scanner(file);
		String lineHolder = "";

		for (int i = 0; i < 20; i++) {

			scan.hasNextLine();
			lineHolder = scan.next();

			for (int j = 0; j < 20; j++) {

				matrix[i][j] = lineHolder.charAt(j);
			}
		}
		// Nihai yol için boş bir dizi oluşturulması.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {

				roadOutLine[i][j] = ' ';

			}

		}
		// Yol bulmak için ana fonksiyonların 0,0 indis değerleriyle çağırılması
		if (pathValidator(matrix, 0, 0)) {

			System.out.printf("%30s\n\n", "Labirent Cozuldu ! ");
		} else {

			System.out.printf("%30s\n\n", "Labirent Cozumsuz ! ");
			System.exit(0);
		}

		// Labirent çözüldüğü taktirde konsola yazdırılacak bilgi mesajları, ve yolu
		// görselize eden diziler...

		System.out.println(" Bilgi : Asagida izlenen yol hakkinda bilgi sahibi olmaniz icin bazi bilgileri verilmistir");
		System.out.println(" x = Ayak izlerini ( Denenmis Yollari ) karakterize eder");
		System.out.println(" . = 9 Numaraya Giden Yolu Karakterize Eder");
		System.out.println(" 1 = Kullanilmamis Yollari Karakterize Eder\n");
		System.out.printf("%38s \n", "Analiz Edilmis Labirent Haritasi");
		appearanceShaper(matrix);

		System.out.printf("%28s \n", " 9 Numaraya Giden Yol");
		appearanceShaper(roadOutLine);

	}

	/**
	 * Harita görünümünü daha okunaklı hale getiren fonksiyon.
	 * 
	 * @param matrix
	 */
	private static void appearanceShaper(char[][] matrix) {

		System.out.println("-------------------------------------------");
		for (int x = 0; x < 20; x++) {
			System.out.print("| ");
			for (int y = 0; y < 20; y++) {
				System.out.print(matrix[x][y] + " ");
			}

			System.out.println("|");
		}
		System.out.println("-------------------------------------------");

	}

	/**
	 * Aldığı paramatreler ile her indisin potansiyel bir geçiş kapısı olup
	 * olmadığını doğrulayan fonksiyon.
	 * 
	 * @param matrix
	 * @param row
	 * @param column
	 * @return
	 */

	public static boolean doorValidator(char[][] matrix, int row, int column) {

		if (row >= 0 && row < 20 && column >= 0 && column < 20 && matrix[row][column] == '9') {
			roadOutLine[row][column] = '9';
			return true;

		}
		if (row >= 0 && row < 20 && column >= 0 && column < 20 && matrix[row][column] == '1')
			return true;

		return false;

	}

	/**
	 * 9 Numaraya giden yolu özyinelemeli olarak çalışarak bulan fonksiyon.
	 * 
	 * @param matrix
	 * @param row
	 * @param column
	 * @return
	 */
	public static boolean pathValidator(char[][] matrix, int row, int column) {

		if (doorValidator(matrix, row, column)) {

			if (matrix[row][column] == '9') {
				return true;
			}

			// Ayak izi bırakılması.
			matrix[row][column] = 'x';

			/**
			 * alt kapı kontrolünün yapılması.
			 * 
			 * @DownDoorControl
			 * @Iteration
			 */

			boolean recursiveReturnValue = pathValidator(matrix, row + 1, column);

			/**
			 * Bir alt satırda kapı yok ise sağda kapı kontrolünün yapılması.
			 * 
			 * @RightDoorControl
			 * @Iteration
			 */

			if (recursiveReturnValue != true) {
				recursiveReturnValue = pathValidator(matrix, row, column + 1);

			}

			/**
			 * Altta ve sağda geçerli kapı yok ise yukarıda geçerli kapı kontrolünün
			 * yapılması..
			 * 
			 * @UpDoorControl
			 * @Iteration
			 */

			if (recursiveReturnValue != true) {
				recursiveReturnValue = pathValidator(matrix, row - 1, column);

			}

			/**
			 * Altta, sağda ve yukarıda geçerli kapı yok ise solda geçerli kapı kontrolünün
			 * yapılması.
			 * 
			 * @LeftDoorControl
			 * @Iteration
			 */

			if (recursiveReturnValue != true) {
				recursiveReturnValue = pathValidator(matrix, row, column - 1);

			}

			/**
			 * Aşağıdaki karar yapısı recursiveReturnValue değişkeninin değerinin true olduğu
			 * durumlarda faaliyet gösterir. Bu demektir ki, matrix dizisinin [row][column]
			 * indisindeki kapısının; yukarı, sağ, aşağı, yada solunda geçerli en az bir kapı
			 * vardır.
			 */

			if (recursiveReturnValue) {

				matrix[row][column] = '.';
				roadOutLine[row][column] = '1';

			}
			// recursiveReturnValue değeri true ise yolun bulunduğunu göstermek için true değeri döndürülmesi.

			return recursiveReturnValue;
		}
			// aşağıda, sağda, yukarıda ve solda geçerli kapı yok ise false değeri döner..
		return false;

	}
}
