package first.zptc.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ydkf051 on 2017/12/27.
 */

public class NewActivity extends AppCompatActivity implements View.OnClickListener{

        Button btn_0;
        Button btn_1;
        Button btn_2;
        Button btn_3;
        Button btn_4;
        Button btn_5;
        Button btn_6;
        Button btn_7;
        Button btn_8;
        Button btn_9;
        Button btn_point; //小数点
        Button btn_clear; //清除
        Button btn_del;   //删除
        Button btn_plus;
        Button btn_minus;
        Button btn_multiply;
        Button btn_divide;
        Button btn_equal;
        Button btn_left;
        Button btn_right;
        private TextView et_input;
        private StringBuilder pending = new StringBuilder();
        boolean flage=true;
        private void initView() {
            btn_0 = (Button) findViewById(R.id.btn_0);
            btn_1 = (Button) findViewById(R.id.btn_1);
            btn_2 = (Button) findViewById(R.id.btn_2);
            btn_3 = (Button) findViewById(R.id.btn_3);
            btn_4 = (Button) findViewById(R.id.btn_4);
            btn_5 = (Button) findViewById(R.id.btn_5);
            btn_6 = (Button) findViewById(R.id.btn_6);
            btn_7 = (Button) findViewById(R.id.btn_7);
            btn_8 = (Button) findViewById(R.id.btn_8);
            btn_9 = (Button) findViewById(R.id.btn_9);
            btn_point = (Button) findViewById(R.id.btn_point);
            btn_clear = (Button) findViewById(R.id.btn_clear);
            btn_del = (Button) findViewById(R.id.btn_del);
            btn_plus = (Button) findViewById(R.id.btn_plus);
            btn_minus = (Button) findViewById(R.id.btn_minus);
            btn_multiply = (Button) findViewById(R.id.btn_multiply);
            btn_divide = (Button) findViewById(R.id.btn_divide);
            btn_equal = (Button) findViewById(R.id.btn_equal);
            et_input = (TextView) findViewById(R.id.et_input);


            btn_0.setOnClickListener(this);
            btn_1.setOnClickListener(this);
            btn_2.setOnClickListener(this);
            btn_3.setOnClickListener(this);
            btn_4.setOnClickListener(this);
            btn_5.setOnClickListener(this);
            btn_6.setOnClickListener(this);
            btn_7.setOnClickListener(this);
            btn_8.setOnClickListener(this);
            btn_9.setOnClickListener(this);
            btn_point.setOnClickListener(this);
            btn_plus.setOnClickListener(this);
            btn_equal.setOnClickListener(this);
            btn_minus.setOnClickListener(this);
            btn_multiply.setOnClickListener(this);
            btn_del.setOnClickListener(this);
            btn_divide.setOnClickListener(this);
            btn_clear.setOnClickListener(this);
            btn_divide.setOnClickListener(this);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newtest);
    initView();
    }
    @Override
    public void onClick(View v) {

        int last = 0;
        if(pending.length()!=0)
        {
            last = pending.codePointAt(pending.length()-1);

        }
        switch (v.getId()) {
            case R.id.btn_0:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                pending = pending.append("0");
                et_input.setText(pending);


                break;
            case R.id.btn_1:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("1");
                    et_input.setText(pending);


                break;
            case R.id.btn_2:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("2");
                    et_input.setText(pending);

                break;
            case R.id.btn_3:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("3");
                    et_input.setText(pending);

                break;
            case R.id.btn_4:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("4");
                    et_input.setText(pending);

                break;
            case R.id.btn_5:
                if (flage){
                    pending = pending.append("5");
                    et_input.setText(pending);}
                else et_input.setText("5");
                break;
            case R.id.btn_6:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("6");
                    et_input.setText(pending);

                break;
            case R.id.btn_7:
                if (flage){
                    pending = pending.append("7");
                    et_input.setText(pending);}
                else et_input.setText("7");
                flage=true;
                break;
            case R.id.btn_8:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("8");
                    et_input.setText(pending);

                break;
            case R.id.btn_9:
                if (!flage){
                    pending = new StringBuilder();
                    flage=true;
                }
                    pending = pending.append("9");
                    et_input.setText(pending);

                break;
            case R.id.btn_plus:
                //if (last >= '0' && last <= '9' ) {
                pending = pending.append("+");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_minus:
                //if (last >= '0' && last <= '9') {
                pending = pending.append("-");
                //  }
                et_input.setText(pending);
                break;
            case R.id.btn_multiply:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("*");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_divide:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("/");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_point:
                if (judje1()) {
                    pending = pending.append(".");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                et_input.setText(pending);
                break;
            case R.id.btn_equal: // =等于
                if ((pending.length() > 1)) {
                    flage=false;
                    InfixInToDuffix inf = new InfixInToDuffix();
                    String jieguo;
                    try {
                        String a = inf.toSuffix(pending);
                        jieguo = inf.dealEquation(a);

                    } catch (Exception ex) {
                        jieguo = "出错";
                    }
                    et_input.setText(pending + "=" + jieguo);
                    pending = pending.delete(0, pending.length());
                    if (Character.isDigit(jieguo.charAt(0))) {
                        pending = pending.append(jieguo);
                    }
                }
                break;
            default:
                break;
        }
    }

    private boolean judje1() {
        String a = "+-*/.";
        int[] b = new int[a.length()];
        int max;
        for (int i = 0; i < a.length(); i++) {
            String c = "" + a.charAt(i);
            b[i] = pending.lastIndexOf(c);
        }
        Arrays.sort(b);
        if (b[a.length() - 1] == -1) {
            max = 0;
        } else {
            max = b[a.length() - 1];
        }
        if (pending.indexOf(".", max) == -1) {
            return true;
        } else {
            return false;
        }
    }
    private int judje2(){
        int a=0,b=0;
        for(int i = 0 ; i < pending.length() ;i++){
            if(pending.charAt(i)=='(' ) {
                a++;
            }
            if(pending.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
            return 1;
        return 2;
    }


    private static class InfixInToDuffix {
        private static final Map<Character,Integer> basic =new HashMap<Character, Integer>();
        static {
            basic.put('-',1);
            basic.put('+', 1);
            basic.put('*', 2);
            basic.put('/', 2);
            basic.put('(', 0);//在运算中  （）的优先级最高，但是此处因程序中需要 故设置为0
        }



        public String toSuffix(StringBuilder pending) {
            List<String> queue = new ArrayList<String>();                                    //定义队列  用于存储 数字  以及最后的  后缀表达式
            List<Character> stack = new ArrayList<Character>();                             //定义栈    用于存储  运算符  最后stack中会被 弹空

            char[] charArr = pending.substring(0,pending.length()).trim().toCharArray();                                    //字符数组  用于拆分数字或符号
            String standard = "*/+-()";                                                        //判定标准 将表达式中会出现的运算符写出来
            char ch = '&';                                                                    //在循环中用来保存 字符数组的当前循环变量的  这里仅仅是初始化一个值  没有意义
            int len = 0;                                                                    //用于记录字符长度 【例如100*2,则记录的len为3 到时候截取字符串的前三位就是数字】
            for (int i = 0; i < charArr.length; i++) {                                        //开始迭代

                ch = charArr[i];                                                            //保存当前迭代变量
                if(Character.isDigit(ch)) {                                                    //如果当前变量为 数字
                    len++;
                }else if(ch == '.'){                                                        //如果当前变量为  .  会出现在小数里面
                    len++;
                }else if(standard.indexOf(ch) != -1) {                                        //如果是上面标准中的 任意一个符号
                    if(len > 0) {                                                            //长度也有
                        queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len, i)));    //说明符号之前的可以截取下来做数字
                        len = 0;                                                            //长度置空
                    }
                    if(ch == '(') {                                                            //如果是左括号
                        stack.add(ch);                                                        //将左括号 放入栈中
                        continue;                                                            //跳出本次循环  继续找下一个位置
                    }
                    if (!stack.isEmpty()) {                                                    //如果栈不为empty
                        int size = stack.size() - 1;                                        //获取栈的大小-1  即代表栈最后一个元素的下标
                        boolean flag = false;                                                //设置标志位
                        while (size >= 0 && ch == ')' && stack.get(size) != '(') {            //若当前ch为右括号，则 栈里元素从栈顶一直弹出，直到弹出到 左括号
                            queue.add(String.valueOf(stack.remove(size)));                    //注意此处条件：ch并未入栈，所以并未插入队列中；同样直到找到左括号的时候，循环结束了，所以左括号也不会放入队列中【也就是：后缀表达式中不会出现括号】
                            size--;                                                            //size-- 保证下标永远在栈最后一个元素【栈中概念：指针永远指在栈顶元素】
                            flag = true;                                                    //设置标志位为true  表明一直在取（）中的元素
                        }
                        if(ch==')'&&stack.get(size) == '('){
                            flag = true;
                        }
                        while (size >= 0 && !flag && basic.get(stack.get(size)) >= basic.get(ch)) {    //若取得不是（）内的元素，并且当前栈顶元素的优先级>=对比元素 那就出栈插入队列
                            queue.add(String.valueOf(stack.remove(size)));                    //同样  此处也是remove()方法，既能得到要获取的元素，也能将栈中元素移除掉
                            size--;
                        }
                    }
                    if(ch != ')') {                                                            //若当前元素不是右括号
                        stack.add(ch);                                                        //就要保证这个符号 入栈
                    } else {                                                                //否则就要出栈 栈内符号
                        stack.remove(stack.size() - 1);
                    }
                }
                if(i == charArr.length - 1) {                                                //如果已经走到了  中缀表达式的最后一位
                    if(len > 0) {                                                            //如果len>0  就截取数字
                        queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len+1, i+1)));
                    }
                    int size = stack.size() - 1;                                            //size表示栈内最后一个元素下标
                    while (size >= 0) {                                                        //一直将栈内  符号全部出栈 并且加入队列中  【最终的后缀表达式是存放在队列中的，而栈内最后会被弹空】
                        queue.add(String.valueOf(stack.remove(size)));
                        size--;
                    }
                }

            }
            String a = queue.toString();
            return a.substring(1,a.length()-1);
        }

        public String dealEquation(String equation) {
            String [] arr = equation.split(", ");                                    //根据, 拆分字符串
            List<String> list = new ArrayList<String>();                            //用于计算时  存储运算过程的集合【例如list中当前放置  100   20  5  /  则取出20/5 最终将结果4存入list   此时list中结果为  100  4 】


            for (int i = 0; i < arr.length; i++) {                                    //此处就是上面说的运算过程， 因为list.remove的缘故，所以取出最后一个数个最后两个数  都是size-2
                int size = list.size();
                switch (arr[i]) {
                    case "+": double a = Double.parseDouble(list.remove(size-2))+ Double.parseDouble(list.remove(size-2)); list.add(String.valueOf(a));     break;
                    case "-": double b = Double.parseDouble(list.remove(size-2))- Double.parseDouble(list.remove(size-2)); list.add(String.valueOf(b));     break;
                    case "*": double c = Double.parseDouble(list.remove(size-2))* Double.parseDouble(list.remove(size-2)); list.add(String.valueOf(c));     break;
                    case "/": double d = Double.parseDouble(list.remove(size-2))/ Double.parseDouble(list.remove(size-2)); list.add(String.valueOf(d));       break;
                    default: list.add(arr[i]);     break;                                    //如果是数字  直接放进list中
                }
            }

            return list.size()


                    == 1 ? list.get(0) : "运算失败" ;                    //最终list中仅有一个结果，否则就是算错了
        }
    }
}
