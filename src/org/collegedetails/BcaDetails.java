package org.collegedetails;
import org.fee.BoysHostel;
import org.fee.CollegeFee;
import org.fee.GirlsHostel;
public class BcaDetails extends StaffLogin implements BoysHostel, CollegeFee,GirlsHostel {
public void collegeName() {
	System.out.println("The American College");
	this.computercience();
	this.commerce();
	super.Bca();
	super.Bcom();
	super.userName();
	this.password();
	super.salaryMax();
	super.salaryMin();
	this.commDeptSalary();
	this.csDeptSalary();
	this.bcomDept();
	this.bcaDept();
	this.depositFee();
	this.messfee();
	this.boysDepositFee();
    this.boysmessfee();
	}
public void collegeLocation(){
	System.out.println("Goripalayam,Madurai");

}
@Override
public void boysDepositFee() {
System.out.println("boys hostel deposit fee 15000");
}
@Override
public void boysmessfee() {
	System.out.println("mess fee monthly 2999");
}
@Override
public void bcaDept() {
	System.out.println("BCA fee Yearly 40000");
	
}
@Override
public void bcomDept() {
	System.out.println("B.Com fee Yearly 40000");
	
}
@Override
public void depositFee() {
	System.out.println("Girls hostel deposit fee 15000");
	
}
@Override
public void messfee() {
	System.out.println("Girls Hostel mess fee monthly 2999");	
}
@Override
public void password() {
	System.out.println("staff login password is Aa@123");
}
@Override
public void commDeptSalary() {
	System.out.println("commerce dept salary is 40000");
	
}
@Override
public void csDeptSalary() {
	System.out.println("CS dept salary is 30000");
}
public static void main(String [] args) {
BcaDetails a=new BcaDetails();
a.collegeName();
a.collegeLocation();
}
}

