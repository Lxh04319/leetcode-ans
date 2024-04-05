class Solution {
    public String decodeString(String s) {
        StringBuilder res=new StringBuilder();
        Stack<Integer> numstack=new Stack<>();
        Stack<String> strstack=new Stack<>();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                //都入栈
                numstack.push(num);
                strstack.push(res.toString());
                num=0;
                res=new StringBuilder();
            }
            else if(s.charAt(i)==']'){
                StringBuilder pre=new StringBuilder(strstack.pop());
                int temp=numstack.pop();
                for(int j=0;j<temp;j++){
                    pre.append(res);
                }
                res=pre;
            }
            //多位数字
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num=num*10+s.charAt(i)-'0';
            }
            //字符
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}