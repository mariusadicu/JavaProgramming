package day10_NestedIf;
/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */
public class SalaryAfterTax {

    public static void main(String[] args) {

        int salary = 115_000;
        double salaryAfterTax;
        boolean isMaried = false;

        if(isMaried){

            if(salary >= 130_000){
                salaryAfterTax = salary - (salary * (35 - 5) / 100);
            }else if(salary >= 100_000){
                salaryAfterTax = salary - (salary * (30 - 5) / 100);
            }else if(salary >= 100_000){
                salaryAfterTax = salary - (salary * (25 - 5) / 100);
            }else{
                salaryAfterTax = salary - (salary * (20 - 5) / 100);
            }

        }else{

             if(salary >= 130_000){
            salaryAfterTax = salary - (salary * 35 / 100);
             }else if(salary >= 100_000){
            salaryAfterTax = salary - (salary * 30 / 100);
            }else if(salary >= 100_000){
            salaryAfterTax = salary - (salary * 25 / 100);
            }else{
            salaryAfterTax = salary - (salary * 20 / 100);
            }
        }

        System.out.println("Salary After Tax is: $" + salaryAfterTax);


        System.out.println("-----------------------------------------------------------------");


    }


}
