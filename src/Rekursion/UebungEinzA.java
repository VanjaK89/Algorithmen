package Rekursion;

public class UebungEinzA {
    public static void main(String[] args) {

             recursiveFunctionA(1);
       
    }


    public static void recursiveFunctionA ( int num){
        System.out.println("%d\n" + num);

        if (num >= 4)
            return;
        else
            recursiveFunctionA(num + 1);
    }
}