package Abstract_Pattern;

public class CheckoutService {
    private String gatwaytype;
    private String countrycode;
    public CheckoutService(String gatwaytype,String countrycode){
        this.countrycode=countrycode;
        this.gatwaytype=gatwaytype;
    }
    public void checkout(double amount){
        if(countrycode=="INDIA"){
            PaymentGateway pg=IndiaFactory.createPG(gatwaytype);
            pg.process(amount);
            Invoice invoice=IndiaFactory.createInvoice();
            invoice.generateInvoice();
        }
        else{

        }
    }
}
