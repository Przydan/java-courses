package pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Course;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb00_eager_vs_lazy.entity.InstructorDetail;

public class CreateInstructorDemo {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            // create the objects
            Instructor instructor =
                    new Instructor("Patrick", "Codeman", "pcode@dot.at");
            InstructorDetail detail =
                    new InstructorDetail("www.yt.com/code", "hardCode");


            //            Instructor instructor =
            //                    new Instructor("Dan", "Oldman", "oldman@dot.at");
            //            InstructorDetail detail =
            //                    new InstructorDetail("www.yt.co/demovies", "decodding");


            // associated the objects
            instructor.setInstructorDetail(detail);

            // begin transaction
            session.beginTransaction();

            // save the instructor
            session.save(instructor);

            // commit transaction
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("w catchu");
            ex.printStackTrace();
        }

    }
}
