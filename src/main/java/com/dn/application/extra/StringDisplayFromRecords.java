package com.dn.application.extra;

public class StringDisplayFromRecords {

    public String[] recordsMatched(String[] records){
        String str = "abc";
        String[] newRecords = new String[records.length];
        int k = 0;
        int max = 0;

        for(int l = 0; l < records.length; l++){
            if(records[l].length()>max){
                max = records[l].length();
            }
        }

        for(int i = 0; i<max-2; i++){
            for(int j = 0; j< records.length; j++) {
                //String ss = records[j].substring(i,i+(str.length()));
                //boolean b = str.equals(ss);
                if(records[j].length()>i+str.length()-1) {

                    if (str.equals(records[j].substring(i, i + str.length()))) {
                        newRecords[k] = records[j];
                        k++;
                    }
                }
            }
        }
        return newRecords;
    }

    public static void main(String[] args) {
        StringDisplayFromRecords stringDisplayFromRecords = new StringDisplayFromRecords();
        String[] records = {"fabcdfe","asdfabc","abcjgiu","afgdfuywnabc","dgabc"};
        String[] newRecords = stringDisplayFromRecords.recordsMatched(records);
        System.out.println("Hi");
    }
}
