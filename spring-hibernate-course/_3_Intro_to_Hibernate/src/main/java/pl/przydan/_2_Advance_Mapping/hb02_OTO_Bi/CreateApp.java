package pl.przydan._2_Advance_Mapping.hb02_OTO_Bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity.InstructorDetail;

public class CreateApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)

                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // create the objects
//            Instructor instructor =
//                    new Instructor("Bob", "Treeman", "treeman@dot.at");
//            InstructorDetail detail =
//                    new InstructorDetail("www.yt.co/treeMovies", "treeing");

            Instructor instructor =
                    new Instructor("Dan", "Oldman", "oldman@dot.at");
            InstructorDetail detail =
                    new InstructorDetail("www.yt.co/demovies", "decodding");

            // associated the objects
            instructor.setInstructorDetail(detail);

            // begin transaction
            session.beginTransaction();

            // save the instructor
            session.save(instructor);

            // commit transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
