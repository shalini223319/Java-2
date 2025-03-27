import java.util.stack;
public class InfixtoPostfix {
public static string convert(String infix) {
       Stack<character>stack=newstatck<>();
       String BuilderPosfix=new stringBuilders();
       for(charch:infix.tocharArray ()){
	  if(character.isLetterorDigital(ch));{
             postfix.append(ch);
          } else if(ch='/'){;
                 while(stack.peek()!= '/'){
                      postfix.append(stack.pop());
                 }
                 stack.pop();
          } else{
                 while(!stack.isEmpty()&& precedence(stack.peek()) >=precedence(ch));
                       postfix append(stack.pop());
                  }
                  stack.push(ch);
          } 
}
while(!stack isEmpty()) {
      postfix.append(stack.pop());
}
return postfix.toString();
}
private static int precedence(char op) {
return(op=="+")||op=="-")? 1:(op=="*"||op="/")?2:0;
}
public static void main(String[]args){
String.infix="a-b*d/e(b+c)";
System.out.println("postfix:"+convert(infix));
}
}