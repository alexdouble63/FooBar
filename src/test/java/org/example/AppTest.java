package org.example;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest
{

    private static final String EXPECTEDOUTPUT = "1\n2\nFoo\n4\nBar\nFoo\n7\n8\nFoo\nBar\n11\nFoo\n13\n14\nFooBar\n16\n17\nFoo\n19\nBar\nFoo\n22\n23\nFoo\nBar\n26\nFoo\n28\n29\nFooBar\n";
    

    @Test
    public void testPrintDigits(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.printDigits(30);
        assertThat(outContent.toString()).isEqualToIgnoringWhitespace(EXPECTEDOUTPUT);
    }

    @Test
    public void testPrintDigits1(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.printDigits1(30);
        assertThat(outContent.toString()).isEqualToIgnoringWhitespace(EXPECTEDOUTPUT);
    }

    @Test
    public void testPrintDigits2(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.printDigits2(30);
        assertThat(outContent.toString()).isEqualToIgnoringWhitespace(EXPECTEDOUTPUT);
    }

    @Test
    public void testPrintDigits3(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.printDigits3(30);
        assertThat(outContent.toString()).isEqualToIgnoringWhitespace(EXPECTEDOUTPUT);
    }

    @Test
    public void testPrintDigits4(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.printDigits4(30);
        assertThat(outContent.toString()).isEqualToIgnoringWhitespace(EXPECTEDOUTPUT);
    }


}
