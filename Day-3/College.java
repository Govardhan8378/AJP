public class College{
    String collegecode;
    String collegename;
    String address;
    Long phonenumber;
    static String affilate="JNTUH";
    void Details(){
        System.out.println("------------------------------------");
        System.out.println("COLLEGE DETAILES");
        System.out.println("------------------------------------");
        System.out.println("Collegecode = "+collegecode);
        System.out.println("CollegeName = "+collegename);
        System.out.println("CollegeAddress = "+address);
        System.out.println("Affilatedto = "+affilate);
        System.out.println("PhoneNumber = "+phonenumber);
    }
    public static void main(String[] args) {
        College c=new College();
        c.collegecode="AVIH";
        c.collegename="Avanthi";
        c.address="Gunthapally";
        c.phonenumber=234543233l;
        c.Details();
        
        College c2=new College();
        c2.collegecode="BBB";
        c2.collegename="Brill";
        c2.address="Rangareddy";
        c2.affilate="Autonomous";
        c2.phonenumber=9934543233l;
        c2.Details();

        System.out.println("------------------------------------");
    System.out.println("FEE DETAILES");
    Fee f=new Fee();
        f.Name="Govardhan";
        f.Rollno="2265A632";
        f.money=2000;
        f.jntuhfee=true;
        f.Tutionfee=true;
        f.CRTfee=false;
        f.Feestructure();
}
}