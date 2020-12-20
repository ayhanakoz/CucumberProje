package database_stepdefinitions;
import io.cucumber.java.en.Given;
public class DbCreateStepDef {
    @Given("kullanici yeni bir hotel olusturur")
    public void kullanici_yeni_bir_hotel_olusturur() {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser) VALUES (value1, value2, value3, ...)";
    }
}