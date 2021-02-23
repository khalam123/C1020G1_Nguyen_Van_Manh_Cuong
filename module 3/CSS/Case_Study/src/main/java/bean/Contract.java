package bean;

public class Contract {
    private int contract_id;
    private String contract_start_day;
    private String contract_end_day;
    private double deposit;
    private double contract_total_money;
    private String employee_id;
    private String customer_id;
    private String service_id;

    public Contract() {
    }

    public Contract(int contract_id, String contract_start_day, String contract_end_day, double deposit,
                    double contract_total_money, String employee_id, String customer_id, String service_id) {
        this.contract_id = contract_id;
        this.contract_start_day = contract_start_day;
        this.contract_end_day = contract_end_day;
        this.deposit = deposit;
        this.contract_total_money = contract_total_money;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_start_day() {
        return contract_start_day;
    }

    public void setContract_start_day(String contract_start_day) {
        this.contract_start_day = contract_start_day;
    }

    public String getContract_end_day() {
        return contract_end_day;
    }

    public void setContract_end_day(String contract_end_day) {
        this.contract_end_day = contract_end_day;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }
}
