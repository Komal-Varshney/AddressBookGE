public class BusinessContact {
    String CompanyName;
    String EmployeeNAme;
    String OfficialMail;

    public BusinessContact(String companyName, String employeeNAme, String officialMail) {
        CompanyName = companyName;
        EmployeeNAme = employeeNAme;
        OfficialMail = officialMail;
    }

    @Override
    public String toString() {
        return "BussinessContact{" +
                "CompanyName='" + CompanyName + '\'' +
                ", EmployeeNAme='" + EmployeeNAme + '\'' +
                ", OfficialMail='" + OfficialMail + '\'' +
                '}';
    }
}
