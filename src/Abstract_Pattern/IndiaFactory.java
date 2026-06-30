package Abstract_Pattern;

public class IndiaFactory {
    public static PaymentGateway createPG(String gatewaytype){
        switch (gatewaytype.toLowerCase()){
            case "razorpay":
                return new Razorpay();
            case "payu":
                return new PayUGateway();
            default:
                return null;
        }
    }

    public static Invoice createInvoice(){
        return new GSTInvoice();
    }
}
