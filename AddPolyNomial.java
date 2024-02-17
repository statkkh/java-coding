import java.util.Scanner;

public class AddPolyNomial {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));
    }

    public static String solution(String polynomial){

        int xNum = 0, num = 0;

        for(String s : polynomial.split("")){
            if(s.contains("x"))
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x" , ""));
            else if(!s.equals("+"))
                num += Integer.parseInt(s);    
        }

        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "" )
            + (num != 0 ? (xNum > 0 ? " + "  : "" )
            + num : xNum == 0 ? "0" : "");
    }    
}


class Solution{

    public static String solution(String polynomial){

        int xNum = 0, num = 0;

        for(String s : polynomial.split("")){
            if(s.contains("x"))
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x" , ""));
            else if(!s.equals("+"))
                num += Integer.parseInt(s);    
        }

        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "" )
            + (num != 0 ? (xNum > 0 ? " + "  : "" )
            + num : xNum == 0 ? "0" : "");
    }
}