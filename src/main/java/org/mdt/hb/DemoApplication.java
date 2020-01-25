package org.mdt.hb;

import org.mdt.hb.model.Course;
import org.mdt.hb.model.Student;
import org.mdt.hb.repository.CourseRepository;
import org.mdt.hb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication implements CommandLineRunner {

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private CourseRepository courseRepository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    actsSeeder();
  }

  public void actsSeeder() {
    // Cleanup the tables
    studentRepository.deleteAllInBatch();
    courseRepository.deleteAllInBatch();

    Student s1 = new Student("Vijaya Aditya", "Tadepalli", "vatadepalli@hotmail.com");
    Student s2 = new Student("Venkatesh", "Ransing", "vransing@hotmail.com");

    Course c1 = new Course("DSA");
    Course c2 = new Course("C++");

  }

}
