package 常见题型;


import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:中缀表达式抓后缀表达式 中缀表达式a+b*c+(d*e+f)*g,其转换成后缀表达式则为abc*+de*f+g*+
 * @program:summary
 * @author:peicc
 * @create:2019-07-23 20:11:59
 **/
public class MidToPost {
    //基本规则
    /*1）如果遇到操作数，我们就直接将其输出。
    2）如果遇到操作符，则我们将其放入到栈中，遇到左括号时我们也将其放入栈中。
    3）如果遇到一个右括号，则将栈元素弹出，将弹出的操作符输出直到遇到左括号为止。注意，左括号只弹出并不输出。
    4）如果遇到任何其他的操作符，如（“+”， “*”，“（”）等，从栈中弹出元素直到遇到发现更低优先级的元素(或者栈为空)为止。
      弹出完这些元素后，才将遇到的操作符压入到栈中。有一点需要注意，只有在遇到" ) "的情况下我们才弹出" ( "，其他情况我们都不会弹出" ( "。
    5）如果我们读到了输入的末尾，则将栈中所有元素依次弹出。*/
    public static String midToPost(String str){
        int length=str.length();
        Stack<Character> st1=new Stack<Character>();//存储操作符
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            char temp=str.charAt(i);
            switch (temp){
                case '(':
                    st1.push(temp);//左括号直接入栈
                    break;
                case ')'://右括号直接出栈，直至左括号
                    while(!st1.empty()&&(st1.peek()!='(')){
                        sb.append(st1.pop());
                    }
                    st1.pop();//左括号弹出
                    break;
                case '+':
                case '-':
                    while(!st1.empty()&&st1.peek()!='('){//+-优先级较低，弹出直至遇到左括号
                        sb.append(st1.pop());
                    }
                    st1.push(temp);
                    break;
                case '*':
                case '/':
                    while(!st1.empty()&&(st1.peek().equals("*")||st1.peek().equals("/"))){
                        sb.append(st1.pop());
                    }
                    st1.push(temp);
                    break;
                default:
                    sb.append(temp);//数字直接输出
            }
        }
        while(!st1.isEmpty()){
            sb.append(st1.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String result=midToPost(str);
        System.out.println(result);

    }

}
