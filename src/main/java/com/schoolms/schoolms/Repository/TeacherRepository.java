package com.schoolms.schoolms.Repository;

import com.schoolms.schoolms.Models.Teachers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeacherRepository {

    List<Teachers> teachers= new ArrayList<>();

    public TeacherRepository() {
        teachers.add(new Teachers(1, "Amit", "Sharma", "Mathematics", 10,
                "M.Sc Mathematics", "9876543210", "amit.sharma@school.com"));

        teachers.add(new Teachers(2, "Priya", "Patil", "Science", 8,
                "M.Sc Physics", "9876543211", "priya.patil@school.com"));

        teachers.add(new Teachers(3, "Rahul", "Verma", "English", 6,
                "M.A English", "9876543212", "rahul.verma@school.com"));

        teachers.add(new Teachers(4, "Sneha", "Kulkarni", "History", 12,
                "M.A History", "9876543213", "sneha.kulkarni@school.com"));

        teachers.add(new Teachers(5, "Vikram", "Singh", "Geography", 9,
                "M.A Geography", "9876543214", "vikram.singh@school.com"));

        teachers.add(new Teachers(6, "Anjali", "Joshi", "Computer Science", 7,
                "MCA", "9876543215", "anjali.joshi@school.com"));

        teachers.add(new Teachers(7, "Rohit", "Gupta", "Physics", 11,
                "M.Sc Physics", "9876543216", "rohit.gupta@school.com"));

        teachers.add(new Teachers(8, "Meera", "Desai", "Chemistry", 5,
                "M.Sc Chemistry", "9876543217", "meera.desai@school.com"));

        teachers.add(new Teachers(9, "Karan", "Mehta", "Biology", 13,
                "M.Sc Biology", "9876543218", "karan.mehta@school.com"));

        teachers.add(new Teachers(10, "Pooja", "Nair", "Hindi", 8,
                "M.A Hindi", "9876543219", "pooja.nair@school.com"));

        teachers.add(new Teachers(11, "Suresh", "Yadav", "Marathi", 15,
                "M.A Marathi", "9876543220", "suresh.yadav@school.com"));

        teachers.add(new Teachers(12, "Neha", "Jain", "Economics", 6,
                "M.A Economics", "9876543221", "neha.jain@school.com"));

        teachers.add(new Teachers(13, "Arjun", "Reddy", "Political Science", 10,
                "M.A Political Science", "9876543222", "arjun.reddy@school.com"));

        teachers.add(new Teachers(14, "Kavita", "Mishra", "Sanskrit", 14,
                "M.A Sanskrit", "9876543223", "kavita.mishra@school.com"));

        teachers.add(new Teachers(15, "Nitin", "Chavan", "Physical Education", 9,
                "M.P.Ed", "9876543224", "nitin.chavan@school.com"));

        teachers.add(new Teachers(16, "Shweta", "Roy", "Art", 4,
                "BFA", "9876543225", "shweta.roy@school.com"));

        teachers.add(new Teachers(17, "Deepak", "Kumar", "Music", 7,
                "M.Mus", "9876543226", "deepak.kumar@school.com"));

        teachers.add(new Teachers(18, "Asha", "Tiwari", "Mathematics", 16,
                "M.Sc Mathematics", "9876543227", "asha.tiwari@school.com"));

        teachers.add(new Teachers(19, "Manoj", "Pawar", "Science", 10,
                "M.Sc Chemistry", "9876543228", "manoj.pawar@school.com"));

        teachers.add(new Teachers(20, "Rekha", "Shinde", "English", 12,
                "M.A English", "9876543229", "rekha.shinde@school.com"));
    }

    public List<Teachers> giveteacherlist(){
        return teachers;
    }

    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }
}
