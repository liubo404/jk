public class CastTest {
    public static void main(String[] args) {
        Man m = new Man();
        Person p =  m;

        Person person = new Person();
        Man m2 = (Man)person;

        System.out.println();
    }
}
