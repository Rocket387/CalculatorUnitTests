import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeTest {

    @Test
    public void determineLetterGradeATest(){
        Grade grade = new Grade();
        assertEquals("A", grade.determineLetterGrade(100));
        //assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void determineLetterGradeBTest(){
        Grade grade = new Grade();
        assertEquals("B", grade.determineLetterGrade(85));
        //assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void determineLetterGradeCTest(){
        Grade grade = new Grade();
        assertEquals("C", grade.determineLetterGrade(72));
        //assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void determineLetterGradeDTest(){
        Grade grade = new Grade();
        assertEquals("D", grade.determineLetterGrade(64));
        //assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void determineLetterGradeFTest(){
        Grade grade = new Grade();
        assertEquals("F", grade.determineLetterGrade(45));
        //assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void determineLetterGradeExceptionTest() {
        Grade grade = new Grade();
        assertThrows(IllegalArgumentException.class, () -> {
            grade.determineLetterGrade(-1);
        });


    }
}
