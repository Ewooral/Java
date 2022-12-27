
public class Str_FindDna {

    public static void main(String[] args) {

        testFindDnaString();
    }

    public static String findDNA(String DNA) {
        int startIdx = DNA.indexOf("ATG");
        int currIdx = DNA.indexOf("TAA", startIdx + 3);
        while (currIdx != -1) {
            if ((currIdx - startIdx) % 3 == 0) {
                return DNA.substring(startIdx, currIdx + 3);
            } else {
                currIdx = DNA.indexOf("TAA", currIdx + 1);
            }
        }
        return "";
    }

    public static void testFindDnaString() {
        System.out.println(".......Find DNA Genes......");

        String s = "AATGCGTAATTAATCG";
        System.out.println("DNA 1: " + findDNA(s));

        String s1 = "CGATGGTTGATAAGCCTAAGCTATAA";
        System.out.println("DNA 2: " + findDNA(s1));

        String s2 = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA 3: " + findDNA(s2));

        String s3 = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("DNA 4: " + findDNA(s3));
    }
}
