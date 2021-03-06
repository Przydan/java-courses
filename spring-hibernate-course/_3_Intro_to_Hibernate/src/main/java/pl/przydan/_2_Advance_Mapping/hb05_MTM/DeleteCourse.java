package pl.przydan._2_Advance_Mapping.hb05_MTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb05_MTM.entity.*;

public class DeleteCourse {
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

            // delete the course
            int id = 10;
            Course tempCourse = session.get(Course.class, id);

            session.delete(tempCourse);

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