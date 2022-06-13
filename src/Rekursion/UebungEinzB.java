package Rekursion;

public class UebungEinzB {
    public static void main(String[] args) {

        recursiveFunctionB(1);

    }
    public static void recursiveFunctionB(int num){

        if(num >= 4)
            return;
        else
            recursiveFunctionB(num + 1);

        System.out.println("%d\n" + num);
    }
}
