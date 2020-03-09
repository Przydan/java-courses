package pl.przydan._1_SimpleCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._1_SimpleCRUD.model.Student;

public class CreateStudentDemo {

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
            // create a student object
            System.out.println(">> create new student object...");
            Student tempStudent = new Student("Paul", "Wall", "paul@atdot.pl");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println(">> saving the student");
            session.save(tempStudent);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> done!");
        } finally {
            factory.close();
        }


    }
}
