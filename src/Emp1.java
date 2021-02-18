class EmpDetails{
    String name;
    int yearOfJoining;
    String address;

 


    EmpDetails(String name,int yearOfJoining,String address){
        this.name=name.toUpperCase();
        this.yearOfJoining=yearOfJoining;
        this.address=address.toUpperCase();
    

 

    }
    void displayAllDetails() {
        
        System.out.println(name+"\t"+yearOfJoining+"\t"+address);

 

    }
}

 

public class Emp1 {

 

    public static void main(String[] args) {
        EmpDetails obj = new EmpDetails("Robert",1994,"wallstreet");
        EmpDetails obj1 = new EmpDetails("sam",2000,"Wallstreet");
        EmpDetails obj2 = new EmpDetails("john",2005,"Wallstreet");
        System.out.println("NAME"+"\t"+"Doj"+"\t"+"ADDRESS");
        System.out.println(" ");
        //System.out.println();
        obj.displayAllDetails();
        obj1.displayAllDetails();
        obj2.displayAllDetails();

 

 

    }

 

}
 