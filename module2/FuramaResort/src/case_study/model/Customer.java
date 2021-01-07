package case_study.model;

import case_study.manager.CustomerManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Customer implements Comparator {
    private String nameCustomer;
    private String dob;
    private String gender;
    private int idCard;
    private int phone;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;
//    private String serviceID;

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer() {
    }

//    public String getServiceID() {
//        return serviceID;
//    }
//
//    public void setServiceID(String serviceID) {
//        this.serviceID = serviceID;
//    }

    public Customer(String nameCustomer, String dob, String gender, int idCard, int phone,
                    String email, String typeCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.dob = dob;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
//        this.serviceID = serviceID;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "NameCustomer='" + nameCustomer + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard=" + idCard +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void showInfor(){
        System.out.println(toString());
    }

    @Override
    public int compare(Object o1, Object o2) {
        Customer customer1 = (Customer) o1;
        Customer customer2 = (Customer) o2;
        if (!customer1.nameCustomer.equals(customer2.nameCustomer)) return customer1.nameCustomer.compareTo(customer2.nameCustomer);
        else{
            try {
                Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(customer1.getDob());
                Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(customer2.getDob());
                if (date1.getTime()<date2.getTime())
                    return -1;
                else if (date1.getTime()>date2.getTime())
                    return 1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
