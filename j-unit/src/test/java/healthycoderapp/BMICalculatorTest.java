package healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {


    @Test
    void should_ReturnTrue_When_DietRecommnded(){
        //given
        double weight = 89.0;
        double height = 1.72;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);
    }
    @Test
    void should_ReturnFalse_When_DietRecommnded(){
        //given
        double weight = 50.0;
        double height = 1.92;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //them
        assertFalse(recommended);
    }
    @Test
    void should_ReturnArithmaticException_When_HeightZero(){
        //given
        double weight = 89.0;
        double height = 0.0;

        //when
        Executable executable= ()-> BMICalculator.isDietRecommended(weight,height);

        //them
        assertThrows(ArithmeticException.class , executable);
    }
    @Test
    void should_RetureCoderTheWorstBMI_WhenCoderListisnotempty(){
        //given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,64.0));
         //when
        Coder codeWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
        //then
        assertAll(
                ()->assertEquals(1.82,codeWorstBMI.getHeight()),
                ()->assertEquals(98.0,codeWorstBMI.getWeight())
        );

    }
    @Test
    void should_RetureNullTheWorstBMI_WhenCoderListisnotempty(){
        List<Coder> coders = new ArrayList<>();

        //when
        Coder codeWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
        //then
       assertNull(codeWorstBMI);

    }
    @BeforeEach
    void beforeEach(){
        System.out.println("before each..");
    }
    @AfterEach
    void afterEach(){
        System.out.println("after each...");
    }

}