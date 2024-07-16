import java.io.*;
import java.util.Scanner;


public class InvoiceTest{
  public  static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter part of number: " );
  String partnumber = scanner.nextLine();
  System.out.println("Enter part description: " );
  String partdescription = scanner.nextLine();
  System.out.println("Enter quantity: " );
  int quantity = scanner.nextInt();
  System.out.println("Enter priceperitem: " );
  double priceperitem = scanner.nextDouble();

Invoice invoice = new Invoice( partnumber , partdescription, quantity, priceperitem);

  System.out.println("\nInvoice Deatils: " ); 
  System.out.println("Enter part of number: "+ invoice.getpartnumber() );
  System.out.println("Enter part description: "+ invoice.getpartdescription() );
  System.out.println("Enter quantity: " + invoice.getquantity());
  System.out.println("Enter priceperitem: " + invoice.getpriceperitem());
  scanner.nextLine();
  System.out.println("Invoice Amount: " );

scanner.close();
}
}
 
class Invoice{


 String partnumber;
 String partdescription;
 int quantity;
 double priceperitem;

 public Invoice( String partnumber ,String partdescription,int quantity,double priceperitem){

  this.partnumber = partnumber;
  this.partdescription =partdescription;
 this.quantity  =  quantity ;
 this.priceperitem = priceperitem ;

}
public String getpartnumber(){

return partnumber ;
}

public void setpartnumber(String partnumber){
this.partnumber =partnumber;
}

public String getpartdescription(){

return partdescription ;
}

public void setpartdescription(String partdescription){
this.partdescription = partdescription;
}
public int getquantity(){

return quantity ;
}

public void setquantity(int quantity){
if(quantity > 0 ){
this.quantity = quantity;
}else{
this.quantity = 0;
}
}
public double getpriceperitem(){

return priceperitem ;
}
public void setpriceperitem(double priceperitem){
if(priceperitem > 0){
this.priceperitem =priceperitem;
}else{this.priceperitem = 0.0 ;}
}
public double getInvoiceamount(){
 return quantity * priceperitem;
}
}