package Assignment2.ControlCoupling;

import java.util.ArrayList;

public class Student {
    String Name;
    ArrayList<Double> GPA = new ArrayList<>();
    String Grade;

    Double calculateCGPA(ArrayList <Double> GPA) {
        Double ans = 0.0;
        for(var gpa : GPA) ans += gpa;

        ans = ans / (GPA.size());
        return ans;
    }

    void CalculateGrade()
    {
        Double CGPA = calculateCGPA(this.GPA);
        if(CGPA == 4) this.Grade = "A+";
        else if(CGPA >= 3.75) this.Grade = "A";
        else if(CGPA >= 3.5) this.Grade = "A-";
        else if(CGPA >= 3.25) this.Grade = "B+";
        else if(CGPA >= 3.00) this.Grade = "B";
        else if(CGPA >= 2.75) this.Grade = "B-1";
        else if(CGPA >= 2.50) this.Grade = "C";
        else if(CGPA >= 2) this.Grade = "D";
        else this.Grade = "F";
    }
}

//Here the CalculateGrade's output is depended on the CGPA value, which is controlled
//by calculateCGPA method