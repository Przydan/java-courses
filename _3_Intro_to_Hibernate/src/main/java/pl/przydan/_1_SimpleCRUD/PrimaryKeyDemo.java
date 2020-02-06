package pl.przydan._1_SimpleCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._1_SimpleCRUD.model.Student;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        // use the session object to save Java object
        try {
            // create students objects
            System.out.println(">> create new student object...");
            Student tempStudent = new Student("Patrick", "Strais", "paul@atdot.pl");
            Student tempStudent2 = new Student("Ben", "Newground", "benn@atdot.pl");
            Student tempStudent3 = new Student("Elize", "Oldboard", "eold@atdot.pl");

            // start a transaction
            session.beginTransaction();

            // save the students object
            System.out.println(">> saving the students");
            session.save(tempStudent);
            session.save(tempStudent2);
            session.save(tempStudent3);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> done!");
        } finally {
            factory.close();
        }


    }
}
