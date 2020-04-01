package pl.przydan._2_Advance_Mapping.hb01_OTO_UNI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb01_OTO_UNI.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb01_OTO_UNI.entity.InstructorDetail;

public class DeleteApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)

                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin transaction
            session.beginTransaction();

            // get instructor by primary key / id
            int theID = 1;
            Instructor instructor = session.get(Instructor.class, theID);

            // delete the instructor

            if (instructor != null) {
                session.delete(instructor);
            }

            // commit transaction
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
