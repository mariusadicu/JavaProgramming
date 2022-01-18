package day39_Recap.studentTask;

public class CydeoStuden extends Student{


    private int batchNumber;
    private int groupNumber;
    private String programingLanguage;


    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Invalid number! "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid number! "+groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (programingLanguage.isEmpty() || programingLanguage.isBlank()){
            System.err.println("Invalid programing language! "+programingLanguage);
        }
        this.programingLanguage = programingLanguage;
    }


    public CydeoStuden(String name, int age, char gender, int studentID, String fieldOfStudy, char grade
                       , int batchNumber, int groupNumber, String programingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, "Cydeo");
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgramingLanguage(programingLanguage);
    }


    @Override
    public void eat() {
        System.out.println(getStudentID()+" is eating");
    }

    @Override
    public void drink() {
        System.out.println(getStudentID() +" is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(getStudentID()+" is sleeping");
    }

    @Override
    public void study() {
        System.out.println(getStudentID()+" is studying");
    }


    @Override
    public String toString() {
        return "CydeoStuden{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }




}






/*
3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included

 */