public class Property {
  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private final String name;
  private final double area;
  private final String owner;

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name,
                  double area, String owner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.owner = owner;
  }

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, double area,
                  String owner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = "";
    this.area = area;
    this.owner = owner;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public String getOwner() {
    return owner;
  }

  public String toString() {
    return municipalityNumber + " : " + municipalityName + " : " + lotNumber + " : " + sectionNumber + " : " + name +
        " : " + area + " : " + owner;
  }
}
