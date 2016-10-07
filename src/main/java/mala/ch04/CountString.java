package mala.ch04;

public class CountString {

    /**
     * How many String objects here? 5
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String summer = new String("Summer"); // String object in heap ==1
        String summer2 = "Summer"; // String object in String constant pool ==2
        System.out.println("Summer"); // reuses the "Summber" object in String constant pool
        System.out.println("autumn"); // create new String object with the value "autumn",and places
                                      // it in the String constant pool ==3
        System.out.println("summer" == "autumn"); // reuses the "autumn" String object,and create
                                                  // new String object "summer" ==4
        String autumn = new String("Summber"); // new Stirng object "Summber" ==5

    }

}
