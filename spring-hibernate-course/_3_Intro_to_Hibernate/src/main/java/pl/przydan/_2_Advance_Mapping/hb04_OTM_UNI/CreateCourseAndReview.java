package pl.przydan._2_Advance_Mapping.hb04_OTM_UNI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Course;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.InstructorDetail;
import pl.przydan._2_Advance_Mapping.hb04_OTM_UNI.entity.Review;

public class CreateCourseAndReview {
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

            //create a course
            Course tempCourse = new Course("How to create app for Android.");

            //add some reviews
            tempCourse.add(new Review("Great course ! "));
            tempCourse.add(new Review("Great course ! loveit "));
            tempCourse.add(new Review("What a dump course, you are an idiot!"));
            tempCourse.add(new Review("Great course ! :) "));
            tempCourse.add(new Review("Great course ! ^_^"));

            //save the course ... and leverage the cascade all
            System.out.println(">> Saving the course");
            System.out.println(">>" + tempCourse);
            System.out.println(">>" + tempCourse.getReviews());
            session.save(tempCourse);

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