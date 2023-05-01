package org.mikhailov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatReturner {



    public float floatInput() {
        try {
            return returnFloat();
        }
        catch (InputMismatchException e) {
            System.out.println("некорректный ввод. введите число float. целая и дробная часть должны разделяться символом ','");
            return floatInput();
        }
    }

    public float returnFloat()throws InputMismatchException{
            Scanner in = new Scanner(System.in);
            System.out.print("Input a float: ");
            float num = in.nextFloat();
            return num;
        }
    }



