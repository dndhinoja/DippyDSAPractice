package com.dn.application.extra;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class AddDay {

    public static void main(String[] args) {
        String oldDays = "2022-03-10";
        System.out.println(oldDays);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c  = Calendar.getInstance();

        try {
            c.setTime(simpleDateFormat.parse(oldDays));
        }catch (Exception e){
            e.printStackTrace();
        }
        c.add(Calendar.DAY_OF_MONTH,5);
        String newDate = simpleDateFormat.format(c.getTime());
        System.out.println(newDate);
        LocalDateTime.now().plusDays(4);
        System.out.println(LocalDateTime.now().plusDays(4));
    }
}
