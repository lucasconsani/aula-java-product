public class Account {

    private int acNumber;
    private String name;
    private double value;

    public Account() {

    }

    public Account(int acNumber, String name, double inicialDeposit) {
        this.acNumber = acNumber;
        this.name = name;
        depositValue(inicialDeposit);
    }

    public Account(int acNumber, String name) {
        this.acNumber = acNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositValue(double deposit) {
        this.value += deposit;
    }

    public void withdrawValue(double withdraw) {
        if (withdraw != 0) {
            this.value -= withdraw + 5.0;
        }
    }

    public String toString() {
        return "Account: "
                + acNumber
                + ", Holder: "
                + name
                + String.format(", Balance: $ %.2f", value);
    }


}
