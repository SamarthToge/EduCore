package com.schoolms.schoolms.Repository;

import com.schoolms.schoolms.Models.Gender;
import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Services.Studentservice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Repository
public class StudentsRepository {

    public List<Student> givestdlist(){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aarav", "Sharma", LocalDate.of(2010, 5, 12), Gender.Male,
                "10", "A", "Rajesh Sharma", "9876543210", "Pune",
                LocalDate.of(2023, 6, 15), "DAV School", 95, "A"));

        students.add(new Student(2, "Ananya", "Patil", LocalDate.of(2011, 3, 8), Gender.Female,
                "9", "B", "Sunil Patil", "9876543211", "Mumbai",
                LocalDate.of(2024, 6, 10), "St. Mary's", 92, "A"));

        students.add(new Student(3, "Vihaan", "Joshi", LocalDate.of(2010, 8, 20), Gender.Male,
                "10", "C", "Mahesh Joshi", "9876543212", "Nashik",
                LocalDate.of(2023, 6, 18), "Podar School", 88, "B"));

        students.add(new Student(4, "Ishita", "Kulkarni", LocalDate.of(2012, 1, 25), Gender.Female,
                "8", "A", "Prakash Kulkarni", "9876543213", "Nagpur",
                LocalDate.of(2024, 6, 20), "Orchid School", 96, "A+"));

        students.add(new Student(5, "Aditya", "Deshmukh", LocalDate.of(2011, 7, 14), Gender.Male,
                "9", "A", "Ramesh Deshmukh", "9876543214", "Pune",
                LocalDate.of(2024, 6, 12), "Vidya Bhavan", 85, "B"));

        students.add(new Student(6, "Sai", "Jadhav", LocalDate.of(2010, 11, 3), Gender.Male,
                "10", "B", "Vijay Jadhav", "9876543215", "Kolhapur",
                LocalDate.of(2023, 6, 15), "New Era School", 90, "A"));

        students.add(new Student(7, "Pooja", "Pawar", LocalDate.of(2012, 4, 17), Gender.Female,
                "8", "C", "Santosh Pawar", "9876543216", "Satara",
                LocalDate.of(2024, 6, 11), "Modern School", 93, "A"));

        students.add(new Student(8, "Rohan", "More", LocalDate.of(2011, 2, 22), Gender.Male,
                "9", "C", "Ganesh More", "9876543217", "Aurangabad",
                LocalDate.of(2024, 6, 14), "Ryan School", 80, "C"));

        students.add(new Student(9, "Sneha", "Chavan", LocalDate.of(2010, 9, 5), Gender.Female,
                "10", "A", "Anil Chavan", "9876543218", "Pune",
                LocalDate.of(2023, 6, 15), "Kendriya Vidyalaya", 97, "A+"));

        students.add(new Student(10, "Om", "Shinde", LocalDate.of(2011, 6, 10), Gender.Male,
                "9", "B", "Suresh Shinde", "9876543219", "Solapur",
                LocalDate.of(2024, 6, 10), "Army Public School", 89, "B+"));

        students.add(new Student(11, "Kavya", "Mane", LocalDate.of(2012, 8, 28), Gender.Female,
                "8", "B", "Ajay Mane", "9876543220", "Pune",
                LocalDate.of(2024, 6, 15), "City International", 94, "A"));

        students.add(new Student(12, "Atharva", "Kadam", LocalDate.of(2010, 12, 19), Gender.Male,
                "10", "C", "Nitin Kadam", "9876543221", "Sangli",
                LocalDate.of(2023, 6, 16), "Bharati Vidyapeeth", 87, "B"));

        students.add(new Student(13, "Riya", "Gaikwad", LocalDate.of(2011, 10, 1), Gender.Female,
                "9", "A", "Sachin Gaikwad", "9876543222", "Thane",
                LocalDate.of(2024, 6, 13), "Euro School", 91, "A"));

        students.add(new Student(14, "Yash", "Patankar", LocalDate.of(2010, 5, 30), Gender.Male,
                "10", "B", "Rohit Patankar", "9876543223", "Pune",
                LocalDate.of(2023, 6, 15), "Delhi Public School", 84, "B"));

        students.add(new Student(15, "Tanvi", "Bhosale", LocalDate.of(2012, 3, 15), Gender.Female,
                "8", "A", "Vikas Bhosale", "9876543224", "Kolhapur",
                LocalDate.of(2024, 6, 12), "Little Flower", 98, "A+"));

        students.add(new Student(16, "Arjun", "Salunkhe", LocalDate.of(2011, 9, 7), Gender.Male,
                "9", "C", "Deepak Salunkhe", "9876543225", "Nagpur",
                LocalDate.of(2024, 6, 14), "Mount Carmel", 82, "C+"));

        students.add(new Student(17, "Meera", "Wagh", LocalDate.of(2010, 1, 18), Gender.Female,
                "10", "A", "Ravi Wagh", "9876543226", "Pune",
                LocalDate.of(2023, 6, 15), "Bishop's School", 95, "A"));

        students.add(new Student(18, "Krishna", "Raut", LocalDate.of(2011, 4, 11), Gender.Male,
                "9", "B", "Shyam Raut", "9876543227", "Nashik",
                LocalDate.of(2024, 6, 11), "St. Xavier's", 86, "B"));

        students.add(new Student(19, "Aditi", "Dhole", LocalDate.of(2012, 7, 21), Gender.Female,
                "8", "C", "Mohan Dhole", "9876543228", "Amravati",
                LocalDate.of(2024, 6, 13), "Holy Cross", 90, "A"));

        students.add(new Student(20, "Vedant", "Thorat", LocalDate.of(2010, 2, 9), Gender.Male,
                "10", "A", "Kiran Thorat", "9876543229", "Pune",
                LocalDate.of(2023, 6, 15), "Wisdom High", 88, "B+"));
        return students;
    }
}
