import java.io.*;

public class Files_InputAndOutput {

    public static void main(String args[]) {
        try {

            // WRITE TO A FILE
            BufferedWriter writer = new BufferedWriter(new FileWriter("basics/OUTPUT.txt"));
            writer.write("Try God and see his greatest made manifest in your life!");
            writer.write("\nHe is Magestic!\n");

            System.out.println("text successfully written...");

            String[] names = { "elijah", "moses", "david", "kb", "emma" };
            int num = 1;

            for (String name : names) {
                writer.write("\n" + num + ". " + name);
                num++;
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // READ FROM A FILE
        try {
            BufferedReader Reader = new BufferedReader(new FileReader("basics/OUTPUT.txt"));

            System.out.println("....Read From File....");
            System.out.println(Reader.readLine().length()); // only reads the first line of the file

            String line;
            while ((line = Reader.readLine()) != null) {
                System.out.println(line);
            }

            Reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter csvFileWriter = new BufferedWriter(new FileWriter("basics/OUTPUT.csv"));
            String[] names = { "elijah", "moses", "david", "elisha", "emma", "mary", "john" };
            String[] address = { "USA", "UK", "UK", "GERMANY", "USA", "USA", "SPAIN" };
            int[] age = { 29, 23, 25, 27, 31, 31, 17 };
            int num = 1;

            csvFileWriter.write("ID\t" + "NAME\t\t" + "AGE\t\t" + "ADDRESS\t\t\n");
            csvFileWriter.write("..........................................................\n");

            for (int i = 0; i < names.length; i++) {
                csvFileWriter.write(num + "\t" + names[i] + "\t\t" + age[i] + "\t\t" + address[i] + "\t\t\n");
                num += 1;
            }
            csvFileWriter.close();

            BufferedReader csvFileRead = new BufferedReader(new FileReader("basics/OUTPUT.csv"));

            String line;
            while ((line = csvFileRead.readLine()) != null) {
                System.out.println(line);
            }
            csvFileRead.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}