package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BVNVerification {
    String bvnNames = "";
    String bvnDOB = "";
    public boolean checkNames(String firstname, String lastname, String middlename, String DOB) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Date a = simpleDateFormat.parse(bvnDOB);
        Date b = simpleDateFormat.parse(DOB);

        String[] names = {firstname, lastname, middlename};
        int count = 0;

        for (int i = 0; i < names.length; i++){
            if (bvnNames.toLowerCase().contains(names[i].toLowerCase())){
                count++;
            }
        }

        if (count >= 2 && a.equals(b)){
            return true;
        } else {
            return false;
        }

    }
}
