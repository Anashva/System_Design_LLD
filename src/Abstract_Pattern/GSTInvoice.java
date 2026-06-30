package Abstract_Pattern;

public class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("generating gst invoice for india");
    }
}
