package org.mikhailov;

import java.util.Scanner;

public class NoBlankspaceInputer {

    public void input(){
        try {
            blackspaceInputCheck();
        }
        catch (BlankspaceException e){
            System.out.println(e.getMessage());
        }
    }
    public void blackspaceInputCheck() throws BlankspaceException{
        Scanner in = new Scanner(System.in);
        System.out.print("Input message: ");
        String message = in.nextLine();
        if(message.isEmpty()){
            throw new BlankspaceException("Нельзя вводить пустые строки");
        }
    }

    class BlankspaceException extends Exception{
        public BlankspaceException(String message) {
            super(message);
        }
    }
}
