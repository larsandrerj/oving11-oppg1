import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("ØVING 11 OPPGAVE 1");
    Register register = new Register();
    register.addProperty(new Property(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen"));
    register.addProperty(new Property(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));

    boolean exit = false;
    while (!exit) {
      menu();
      int userInput = getUserInputInt("");
      switch (userInput) {
        case (1):
          int municipalityNumber = getUserInputInt("Kommunenummer: ");
          String municipalityName = getUserInputString("Kommunenavn: ");
          int lotNumber = getUserInputInt("Gårdsnummer: ");
          int sectionNumber = getUserInputInt("Bruksnummer: ");
          String name = getUserInputString("Navn: ");
          double area = getUserInputInt("Areal: ");
          String owner = getUserInputString("Eier: ");
          register.addProperty(new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber, name, area, owner));
          break;
        case (2):
          int municipalityNumberSearch = getUserInputInt("Kommunenummer: ");
          int lotNumberSearch = getUserInputInt("Gårdsnummer: ");
          int sectionNumberSearch = getUserInputInt("Bruksnummer: ");
          String key = municipalityNumberSearch + "-" + lotNumberSearch + "/" + sectionNumberSearch;
          Property property = register.getProperty(key);
          if (property != null) {
            System.out.println(property);
          } else {
            System.out.println("Fant ingen eiendom med gitt nøkkel");
          }
          break;
        case (3):
          register.getProperties().forEach(p -> System.out.println(p.toString()));
          break;
        case (4):
          System.out.println(register.getAverageArea());
          break;
        default:
          exit = true;
          break;
      }
      System.out.println();

    }
    System.out.println("Avslutter programmet");
  }
  public static void menu() {
    System.out.println("[1] Registrer eiendom");
    System.out.println("[2] Finn eiendom");
    System.out.println("[3] Skriv ut alle eiendommer");
    System.out.println("[4] Gjennomsnitsareal");
    System.out.println("[5] Avslutt");
  }
  public static int getUserInputInt(String message) {
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    return Integer.parseInt(scanner.nextLine());
  }
  public static String getUserInputString(String message) {
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}