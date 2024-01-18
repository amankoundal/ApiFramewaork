package pojo;

import java.util.List;

public class AddPlace {

        private Location Location;
        private int Accuracy;
        private String Name;
        private String Phone_number;
        private String Address;
        private String Website;
        private String Language;
        private List<String> Types;

    public pojo.Location getLocation() {
        return Location;
    }

    public void setLocation(pojo.Location location) {
        Location = location;
    }

    public int getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(int accuracy) {
        Accuracy = accuracy;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public List<String> getTypes() {
        return Types;
    }

    public void setTypes(List<String> types) {
        Types = types;
    }
}
