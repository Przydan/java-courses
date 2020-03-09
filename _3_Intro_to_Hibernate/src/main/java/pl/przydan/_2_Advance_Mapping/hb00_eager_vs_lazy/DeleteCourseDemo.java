package pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Course;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.InstructorDetail;

public class DeleteCourseDemo {
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

            // get course
            int theId = 10;
            Course course = session.get(Course.class, theId);

            System.out.println("Instructor: " + course);

            // delete course
            session.delete(course);

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


