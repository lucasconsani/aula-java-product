import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName()
                + " (used) $ "
                + String.format("%.2f", super.getPrice())
                + " (Manufacture date: "
                + df.format(manufactureDate)
                + ")";
    }

}

