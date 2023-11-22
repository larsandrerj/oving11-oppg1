import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.OptionalDouble;

public class Register {
  private final HashMap<String, Property> properties;

  public Register(HashMap<String, Property> properties) {
    this.properties = properties;
  }
  public Register() {
    properties = new HashMap<String, Property>();
  }
  public Property getProperty(String key) {
    return properties.get(key);
  }
  public void addProperty(Property property) {
    String key = property.getMunicipalityNumber() + "-" + property.getLotNumber() + "/" + property.getSectionNumber();
    properties.put(key, property);
  }
  public Collection<Property> getProperties() {
    return properties.values();
  }
  public OptionalDouble getAverageArea() {
    //Collection<Property> temp = properties.values();
    return properties.values().stream().mapToDouble(Property::getArea).average();
  }
}
