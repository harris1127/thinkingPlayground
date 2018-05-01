package DesignPatterns.GangOfFour.Structural.Adapter;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String middleName;
    private String email;

    public EmployeeLdap(String cn, String surname, String middleName, String email) {
        this.cn = cn;
        this.surname = surname;
        this.middleName = middleName;
        this.email = email;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeLdap{" +
                "cn='" + cn + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
