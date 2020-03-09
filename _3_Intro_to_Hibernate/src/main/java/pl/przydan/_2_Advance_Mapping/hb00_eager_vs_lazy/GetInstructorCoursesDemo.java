package pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Course;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.InstructorDetail;

public class GetInstructorCoursesDemo {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            // begin transaction
            session.beginTransaction();

            // get instructor drom db
            int theId = 1;
            Instructor instructor = session.get(Instructor.class, theId);

            System.out.println("Instructor: " + instructor);

            // retrieve courses
            System.out.println("Courses: " + instructor.getCourses());

            // commit transaction
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("w catchu");
            ex.printStackTrace();
        } finally {
            System.out.println("done!");
        }

    }

}


