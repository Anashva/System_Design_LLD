package Abstract_Pattern;

public class RupeeInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("rupee invoice");
    }
}
