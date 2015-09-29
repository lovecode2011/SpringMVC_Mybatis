package test;

import java.text.SimpleDateFormat;

public class DateTest {
public static void main(String[] args) {
	
	long milliseconds = 1443449270166L;
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
    System.out.println("直接格式化毫秒值输出:"+sdf.format(milliseconds));
}
}
