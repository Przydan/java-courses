package pl.przydan._1_SimpleCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.przydan._1_SimpleCRUD.model.Student;

import java.util.List;

public class QueryingStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            //query students
            List from_student = session.createQuery("from Student").list();

            // display student list
            from_student.forEach(System.out::println);

            // query students: lastName= "Oldboard"
            List resultList = session.createQuery("from Student s where s.lastName='Oldboard'").getResultList();

            System.out.println(">>>");
            resultList.forEach(System.out::println);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> done!");
        } finally {
            factory.close();
        }
    }
}
