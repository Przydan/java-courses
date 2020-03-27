package pl.przydan._2_Advance_Mapping.hb05_MTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb05_MTM.entity.*;

public class CreateCourseAndStudents {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            // begin transaction
            session.beginTransaction();

            // create and save the course
            Course tempCourse = new Course("Create simple android app1");
            Course tempCourse2 = new Course("Create simple android app2");

            // create the students and save them
            Student student1 = new Student("John", "Foo1", "foo1@dot.com");
            Student student2 = new Student("Johnny", "Foo2", "foo2@dot.com");
            Student student3 = new Student("Alice", "Foo3", "foo3@dot.com");

            session.save(student1);
            session.save(student2);
            session.save(student3);

            tempCourse.addStudent(student1);
            tempCourse.addStudent(student2);
            tempCourse.addStudent(student3);
            tempCourse2.addStudent(student3);
            tempCourse2.addStudent(student2);

            session.save(tempCourse);
            session.save(tempCourse2);

            // commit transaction
            session.getTransaction().commit();
        } catch (
                Exception ex) {
            System.out.println(">> in catch");
            ex.printStackTrace();
        } finally {
            System.out.println(">> done!");
        }
    }
}