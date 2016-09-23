package interview;

public class SwitchTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(switchInt(2));
    }
    
    public static int switchInt(int x){
        int j = 1;
        switch(x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            default:j++;
        }
        return j+x;
    }

}
