package ohtu;

import java.util.ArrayList;

public class Submission {
    private long id;
    private String student_number;
    private String last_name;
    private String first_name;
    private int week;
    private int points;
    private String identifier;
    private int hours;
    private String comments; 
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;
    


    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return "viikko "+week+": tehtyjä tehtäviä yhteensä: "+points+a1+a2;
    }
    
}