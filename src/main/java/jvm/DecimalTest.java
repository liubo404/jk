package jvm;
import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringLitersOfPetrol = "123.00";
		System.out.println("string liters of petrol putting in preferences is "+stringLitersOfPetrol);
		Float litersOfPetrol=-1*Float.parseFloat(stringLitersOfPetrol);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		stringLitersOfPetrol = df.format(litersOfPetrol);
		System.out.println("liters of petrol before putting in editor : "+stringLitersOfPetrol);
	}

}
