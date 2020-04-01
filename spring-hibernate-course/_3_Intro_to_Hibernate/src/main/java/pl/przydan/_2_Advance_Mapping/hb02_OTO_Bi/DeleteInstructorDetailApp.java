package pl.przydan._2_Advance_Mapping.hb02_OTO_Bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity.Instructor;
import pl.przydan._2_Advance_Mapping.hb02_OTO_Bi.entity.InstructorDetail;

public class DeleteInstructorDetailApp {
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

            // get the instructor detail object
            int theId = 4;
            InstructorDetail detail =
                    session.get(InstructorDetail.class, theId);

            // sout the instructor detail
            // sout the associated instructor
            System.out.println("detail: " + detail);
            System.out.println("instructor associated: " + detail.getInstructor());

            // delete instructorDetail
            // remove the associated object reference
            // break bi-directional link
            detail.getInstructor().setInstructorDetail(null);

            session.delete(detail);

            // commit transaction
            session.getTransaction().commit();
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
