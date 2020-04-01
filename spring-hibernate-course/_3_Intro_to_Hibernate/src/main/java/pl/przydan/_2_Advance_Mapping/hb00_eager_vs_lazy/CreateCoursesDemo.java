package pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Course;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.InstructorDetail;

public class CreateCoursesDemo {
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

            // create some courses
//            Course course1 = new Course("Java - learn to code in one moon time");
//            Course course2 = new Course("MongoDB - The Ultimate course");
            Course course1 = new Course("Easy Python course");
            Course course2 = new Course("Easy C++ course");

            // add courses to Instructor
            instructor.add(course1);
            instructor.add(course2);

            // save the courses
            session.save(course1);
            session.save(course2);

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


