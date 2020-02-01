package pl.przydan._1_Spring_MVC.model;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLang;
    private String[] OS;
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> langOptions;
    private LinkedHashMap<String, String> OS_options;


    public Student() {

        initOS_options();
        initLangOptions();
        initCountryOptions();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getLangOptions() {
        return langOptions;
    }

    public String getFavoriteLang() {
        return favoriteLang;
    }

    public void setFavoriteLang(String favoriteLang) {
        this.favoriteLang = favoriteLang;
    }

    public String[] getOS() {
        return OS;
    }

    public void setOS(String[] OS) {
        this.OS = OS;
    }

    public LinkedHashMap<String, String> getOS_options() {
        return OS_options;
    }

    private void initCountryOptions() {
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("PL", "Poland");
        countryOptions.put("DE", "Germany");
        countryOptions.put("US", "USA");
        countryOptions.put("FR", "France");
        countryOptions.put("ES", "Spain");
        countryOptions.put("EN", "England");
    }

    private void initLangOptions() {
        langOptions = new LinkedHashMap<>();

        langOptions.put("Java", "Java");
        langOptions.put("Python", "Python");
        langOptions.put("Ruby", "Ruby");
        langOptions.put("PHP", "PHP");
    }

    private void initOS_options() {
        OS_options = new LinkedHashMap<>();

        OS_options.put("Windows", "Windows");
        OS_options.put("Linux", "Linux");
        OS_options.put("Mac OS", "Mac OS");
    }

}
