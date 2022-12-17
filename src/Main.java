import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Passport passport0 = new Passport("14512456375", "Масалов ",
                "Иван ", null, LocalDate.of(1965, 11, 10));
        Passport passport1 = new Passport("7743263854", "Ильин ",
                "Артём ", null, LocalDate.of(1990, 25, 1));

        Passport[] passports = {passport0, passport1};
        Passport.addPassport(passports);
        Passport.check(passports);
    }
}