package pl.przydan._1_SimpleCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._1_SimpleCRUD.model.Student;

public class DeleteStudentDemo {

    public static void main(String[] args) {

        // create session factory
        // create session
        // use the session object to save Java object
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory()) {
            Session session;
            int studentId = 1;
            // start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student student = session.get(Student.class, studentId);

            session.delete(student);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> done!");
        }


    }
}
