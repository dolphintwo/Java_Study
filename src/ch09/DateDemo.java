package ch09;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date da = new Date();
		System.out.println(da);
		long msec = da.getTime();
		System.out.println("��1970��1��1��0ʱ�����ڹ��У�" + msec + "����");
	}
}
