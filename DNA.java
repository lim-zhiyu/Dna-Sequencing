// Determines whether there is a protein in a strand of DNA.

public class DNA {
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;

    // System.out.println(dna.length());

    System.out.println(dna.indexOf("ATG"));
    System.out.println(dna.indexOf("TGA"));

    int nucleotidesStartIndex = dna.indexOf("ATG") + 3;
    int nucleotidesStopIndex = dna.indexOf("TGA");
    String nucleotides = dna.substring(nucleotidesStartIndex, nucleotidesStopIndex);

    int proteinStartIndex = dna.indexOf("ATG");
    int proteinStopIndex = dna.indexOf("TGA") + 3;

    if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && nucleotides.length() % 3 == 0) {
      String protein = dna.substring(proteinStartIndex, proteinStopIndex);
      System.out.println(protein);
    } else {
      System.out.println("No protein.");
    }
  }
}