import java.util.Deque;
import java.util.LinkedList;

public class Solution0071 {
    public String simplifyPath(String path){
        StringBuilder res = new StringBuilder("");
//        String res = "";
        Deque<String> stack = new LinkedList<>();
        for(String item : path.split("/")){
            if(item.equals("..")){
                if(! stack.isEmpty()) stack.pop();
            }else if(!item.isEmpty() && !item.equals(".")){
                stack.push(item);
            }

        }
        int len = stack.size();
        for(int i = 0; i < len; i ++){
            String s = stack.removeLast();
            res.append("/");
            res.append(s);
        }
//        for(String s : stack){
//            res = "/" + s + res;
//        }
        return res.toString().isEmpty()? "/" : res.toString();
    }
}
