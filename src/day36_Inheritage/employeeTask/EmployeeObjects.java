package day36_Inheritage.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        /*
        2.7 Create a class named Employee Objects and test of the subclass' objects
         */

        Tester tester1 = new Tester();
        tester1.setInfo("Marius","QA",'M',34,69,169000);


        tester1.work();
        tester1.testing();
        tester1.creatingTicket();

        System.out.println(tester1);


        System.out.println("-------------------------------------------------------------");


        Developer developer1 = new Developer();
        developer1.setInfo("Marius","QA",'M',34,69,169000);

        developer1.work();
        developer1.coding();
        developer1.fixingBugs();

        System.out.println(developer1);


        System.out.println("---------------------------------------------------------------");


        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Marius","QA",'M',34,69,169000);

        teacher1.work();
        teacher1.teaching();

        System.out.println(teacher1);


        System.out.println("-----------------------------------------------------------------");


        Driver driver1 = new Driver();
        driver1.setInfo("Marius","QA",'M',34,69,169000);

        driver1.work();
        driver1.driving();

        System.out.println(driver1);



    }
}
