import javax.swing.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {


    private final String numberPassport;
    private String lastName;
    private String firstName;
    private String secondName;
    private final LocalDate birthYear;


    public Passport(String numberPassport, String lastName, String firstName,
                    String secondName, LocalDate birthYear) {
        this.numberPassport = numberPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
    }


    public String getNumberPassport() {
        return numberPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        if (numberPassport.equals(passport.numberPassport)) {
            throw new RuntimeException("Номера должны быть уникальными");
        }
        return numberPassport.equals(passport.numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport, lastName, firstName, secondName, birthYear);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberPassport=" + numberPassport +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void check(Passport... passports) {
        String s = (JOptionPane.showInputDialog(null, "Введите номер"));
        for (Passport pasport : passports) {
            if (s.equals(pasport.getNumberPassport())) {
                JOptionPane.showMessageDialog(null, "паспорт " + pasport.getFirstName() +
                        pasport.getLastName() + "Дата рождения - " + pasport.getBirthYear());
            }
        }

    }

    public static void addPassport(Passport... passports) {
        Set<Passport> passport = new HashSet<>();
        for (int i = 0; i < passports.length; i++) {
            passport.add(passports[i]);
            System.out.println(((HashSet<?>) passport).size());

        }
    }

}