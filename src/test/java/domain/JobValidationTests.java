package domain;

import com.careersforyou.jobservice.domain.Job;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;

import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

public class JobValidationTests {
    private static Validator validator;
    @BeforeAll
     static void setUp(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Test
    void whenAllFieldsCorrectThenValidationSucceeds(){
        var job = new Job("9", "Software Engineer", "Big Name Company", "Java Software Engineer", "Java", "Spring Boot");
        Set<ConstraintViolation<Job>> violations = validator.validate(job);
        assertThat(violations).isEmpty();
    }
@Test
    void whenSkill1IsNotDefinedThenValidationFails() {
        var job = new Job("8", "Software Engineer", "Big Name Company", "Java Software Engineer", "", "Sprinh Boot");
        Set<ConstraintViolation<Job>> violations = validator.validate(job);
        assertThat(violations).hasSize(1);
        assertThat(violations.iterator().next().getMessage())
                .isEqualTo("The job skill1 must be defined.");
    }

}
