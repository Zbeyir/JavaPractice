package day33_Practice;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Haci",33,'M',22,'A',8,17);
        CydeoStudent cydeoStudent2 = new CydeoStudent("MurO", 38,'M',88,'B',8,17);

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);

        cydeoStudent1.schoolName();
        cydeoStudent2.schoolName();

        cydeoStudent1.printProgramLanguage();
        cydeoStudent2.printProgramLanguage();









    }
}
