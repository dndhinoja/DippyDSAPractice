package com.dn.application.extra;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.aa(1);
        BB bb = new BBB();
        bb.bb();
    }

}
class AA{
    public void aa(int a){
        System.out.println("Inside AA with one parameter..");
    }
    public void aa(){
        System.out.println("Inside AA..");
    }
}
class BB{
    public void bb(){
        System.out.println("Inside BB..");
    }
}
class BBB extends BB{
    public void bb(){
        System.out.println("Inside BB and BBB");
    }
}

/*
CREATE Procedure Dippy(salary In Integer)
As
begin
Update Employee SET eno = eno;
commit;
select slaary into up_sal from Employee where eno = eno;
end;
create trigger Dippy
before Insert
on Employee
for each rows
set average = sub1+sub2/2;
*/