/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;

/**
 *
 * @author Asus
 */
public class StudentRecord {
    String cid;
     String cname;
       String cemail;
       String caddress;

    // Constructor
    public StudentRecord(String Sid, String Sname, String Semail, String Saddress) {
        this.cid = Sid;
        this.cname = Sname;
        this.cemail = Semail;
        this.caddress = Saddress;
    }
}
