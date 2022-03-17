package principles.oop.PrincipleInterhance.Person;

public class MainInterhanceTest {
    public static void main(String [] args){
        Person person = new Person("Popescu Ion", "str.Chisinaului 5");
        System.out.println(" Data of the person:"+person);
        Student student=new Student("Esanu Maria", "str.Bucuresti 10 ","Tehnologii de programare",
                2, 6500);
        System.out.println("Data of the student:"+student);
        Staff staff=new Staff("Iliescu David", "str.M.Eminescu 11 ","Tekwil Academy",6000);
        System.out.println("Data of Staff:"+staff);
    }
}
