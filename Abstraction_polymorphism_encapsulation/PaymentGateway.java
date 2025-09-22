//Abstract class - Abstraction
abstract class Gateway{
    public abstract void pay(double amount);

}
//Concrete class - Card Card Payment 
class CreditCard extends Gateway{
    String Cardnumber;
    String cardHolder;
    String cvv;
    public CreditCard(String Cardnumber,String cardHolder,String cvv){
        this.Cardnumber=Cardnumber;
        this.cardHolder=cardHolder;
        this.cvv=cvv;

    }
    @Override
    public void pay(double  amount){
        System.out.println("Processing credit card payment of ₹" + amount + 
                           " for " + cardHolder);

    } 
}
class PayPal extends  Gateway{
    String email;
    String password;
    public PayPal(String email,String password){
        this.email=email;
        this.password=password;
    }
    @Override
    public void pay(double amount){
        System.out.println("Processing Paypal Payment of "+ amount + "by"+ email);
    }
}
class UpiPayment extends Gateway{
    String upi_id;
    public UpiPayment(String upi_id){
        this.upi_id=upi_id;
    }
    @Override 
    public void pay(double amount){
        System.out.println("Precessing of Upi Payment of"+amount + "by "+upi_id);

    }

}
public class PaymentGateway{
    public static void main(String[] args) {
        CreditCard card1= new CreditCard("12345","Parul","2025");
        PayPal p1= new PayPal("parul@gmail.com","36389");
        UpiPayment u1= new UpiPayment("par@gpay");
        card1.pay(200);
        p1.pay(300);
        u1.pay(500);
    }


}
