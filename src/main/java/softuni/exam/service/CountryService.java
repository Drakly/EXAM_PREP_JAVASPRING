package softuni.exam.service;



import java.io.IOException;



public interface CountryService{

    boolean areImported();

    String readCountriesFromFile() throws IOException;

    String importCountries() throws IOException;

//    Optional<Country> getCountryById(Long countryId);
//
//    void saveAddedVolcanoInCountry(Country country);
}
