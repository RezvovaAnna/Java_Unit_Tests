package Test.seminar06;

import Seminar06.Main;
import Seminar06.UserTextInterface;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserTextInterfaceTest {



   @Test
   public void testTextInterface() {
//
//       Вариант 2
//       int[] expectedArray = {1, 2, 3, 4, 5};
//       UserTextInterface userTextInterface = new UserTextInterface();
//
//       PrintStream saveStdout = System.out;
//       InputStream saveStdin = System.in;
//
//      try {
//          ByteArrayInputStream stdin = new ByteArrayInputStream("1 2 3 4 5".getBytes());
//           ByteArrayOutputStream stdout = new ByteArrayOutputStream();
//           System.setIn(stdin);
//           System.setOut(new PrintStream(stdout));
//          userTextInterface.scanner = new Scanner(stdout.toString());
//       } finally {
//           System.setOut(saveStdout);
//           System.setIn(saveStdin);
//       }
//
//       int[] actualArray = userTextInterface.getInputArray(5);
//       assertArrayEquals(expectedArray, actualArray);

// Вариант 1
       UserTextInterface userTextInterface = new UserTextInterface();
       int[] expectedArray = {1, 2, 3, 4, 5};

       InputStream inputStream = new ByteArrayInputStream("1 2 3 4 5".getBytes());
       userTextInterface.scanner = new Scanner(inputStream);

       int[] actualArray = userTextInterface.getInputArray(5);
       assertArrayEquals(expectedArray, actualArray);


   }
//Вариант 3 с использованием библиотек System Rules и Commons IO
//    @Rule
//    public final TextFromStandardInputStream systemInMock
//            = emptyStandardInputStream();
//
//    @Test
//    public void testTextInterface() {
//        systemInMock.provideLines("1 2 3 4 5");
//        UserTextInterface userTextInterface = new UserTextInterface();
//        int[] expectedArray = {1, 2, 3, 4, 5};
//        systemInMock.provideLines("1 2 3 4 5");
//        int[] actualArray = userTextInterface.getInputArray(5);
//        assertArrayEquals(expectedArray, actualArray);
//    }


}
