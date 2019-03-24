package e.idea.bvmattendance;

/** Created by Nisarg
 * patelnisarg0711@gmail.com
 * BVM_EC_419
 */

public class Attendance {
    String studentaddress; /**Pointer adddress*/
    String courseCode;
    String studentIDno;
    String Date;
    public Attendance(){

    }

    public Attendance(String Date_Today,String studentaddress, String STUDENT_ID, String COURSE_ID) {
        this.Date=Date_Today;
        this.studentaddress =studentaddress;
        this.studentIDno = STUDENT_ID;
        this.courseCode = COURSE_ID;
    }

    public String getDay() {
        return Date;
    }
    public String getStudentaddress() {
        return studentaddress;
    }

    public String getStudentIDno() {
        return studentIDno;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

