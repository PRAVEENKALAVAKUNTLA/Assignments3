package Mainprojects;
import java.util.ArrayList;
import java.util.Scanner;

class Userd {
    String fname;
    String email;
    String lname;
    String address;
    String country;
    String phnumber;

    public Userd(String email, String fname, String lname, String address, String country, String phnumber) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.country = country;
        this.phnumber=phnumber;
    }
}


public class Users {
    public static void main(String[] args) {
        Userd u1=new Userd("H@Gmail.com","Hemanth","R","Tenali","India","9581986516");
        Userd u2=new Userd("p@gmail.com","Praveen","K","Rajamundry","India","1111111111");
        Userd u3=new Userd("s@gmail.com","preetham","P","Hyderabad","India","2222222222");
        Userd u4=new Userd("m@gmail.com","sravani","M","Bapatla","India","3333333333");
        Userd u5=new Userd("t@gmail.com","Sneha","T","Tenali","India","4444444444");
        Userd u6=new Userd("a@gmail.com","Akanksha","R","Gudavalli","India","5555555555");
        Userd u7=new Userd("c@gmail.com","Priya","M","Gudavalli","India","6666666666");
        Userd u8=new Userd("n@gmail.com","Naresh","A","Tenali","India","7777777777");
        Userd u9=new Userd("rt@gmail.com","Teja","R","Tenali","India","8888888888");
        Userd u10=new Userd("mm@gmail.com","Madhavi","R","Tenali","India","9999999999");


        ArrayList<Userd> userlist=new ArrayList<>();
        userlist.add(u1);
        userlist.add(u2);
        userlist.add(u3);
        userlist.add(u4);
        userlist.add(u5);
        userlist.add(u6);
        userlist.add(u7);
        userlist.add(u8);
        userlist.add(u9);
        userlist.add(u10);
        Users u=new Users();
        u.printUsers(userlist);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the phone Number or Email");
        String a=sc.next();
        u.byEmailorPhone(userlist,a);


    }


    public void  printUsers(ArrayList<Userd>userlist)
    {
        for (Userd i:userlist)
        {
            System.out.println(i.fname+" "+i.lname+" "+i.email+" "+i.address+" "+i.country+" "+i.phnumber);
        }
    }

    public void byEmailorPhone(ArrayList<Userd>userlist,String a)
    {
        for(Userd j:userlist)
        {
            if (((a).equals(j.phnumber))||(a).equals(j.email))
            {
                System.out.println(" the details of user     "+j.fname+" "+j.lname+" "+j.email+" "+j.address+" "+j.country+" "+j.phnumber);
            }
        }
    }
}

