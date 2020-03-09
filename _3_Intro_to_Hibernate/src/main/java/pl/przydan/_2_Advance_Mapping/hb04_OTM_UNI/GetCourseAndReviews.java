package pl.przydan._2_Advance_Mapping.hb04_OTM_UNI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Course;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.InstructorDetail;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Review;

public class GetCourseAndReviews {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            // begin transaction
            session.beginTransaction();

            //get the course
            int theID = 10;
            Course tempCourse = session.get(Course.class, theID);

            // print the course and reviews
            System.out.println(">> " + tempCourse);
            System.out.println(">> " + tempCourse.getReviews());


            // commit transaction
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(">> in catch");
            ex.printStackTrace();
        } finally {
            System.out.println(">> done!");
        }
    }
}