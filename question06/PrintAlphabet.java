package question06;

import java.util.Scanner;

public class PrintAlphabet {  
    char alpha;
    
    public PrintAlphabet(char alpha) {
        this.alpha = alpha;
    }
    
    public void show() {
    	 for (char i = this.alpha; i >= 'a'; i--) { 
             for (char j = 'a'; j <= i; j++) {  
                 System.out.print(j);
             }
             System.out.println(); 
         }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        char ch = sc.next().charAt(0);
        
        if (ch < 'a' || ch > 'z') {  
            System.out.println("소문자만 입력하세요.");
        } else {
            PrintAlphabet PA = new PrintAlphabet(ch);
            PA.show();
        }
        
        sc.close();
    }
}
