public class PersonTest {

 

    public static void main(String[] args) {
        Person objPerson=new Person();//default
        Person objPerson1=new Person("Nikhila",21);//parameterized
        Person objPerson2=new Person("Abc",21,"Hyderabad");
        
        objPerson.input();
        objPerson.print();

 

        objPerson1.print();
        objPerson2.print();
        
    }

 

}