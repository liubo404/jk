package jvm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest 
{
    public static void main(String[] args) 
    {
        System.out.println(generateCheckoutBillno(3,45));
    }
    
    public static String generateCheckoutBillno(int moduel_id, int merchant_id) {
        DateFormat formatter = new SimpleDateFormat("YYYYMMddHHmmssSSS");
        return  String.format("%03d", moduel_id) + String.format("%06d", merchant_id) +formatter.format(new Date())   ;
    }
}

