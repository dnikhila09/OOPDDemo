class Bike{
 final int SPEED_LIMIT=90;//final variable
 void run(){
  //speedlimit=400;
     System.out.println("speed limit of the bike is:"+SPEED_LIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}