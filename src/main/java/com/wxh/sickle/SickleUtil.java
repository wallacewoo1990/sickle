package main.java.com.wxh.sickle;

import java.util.ArrayList;
import java.util.Scanner;

public class SickleUtil {
	public static void convertToInParams(){
		//scanner对象监控系统输入
		Scanner scanner = new Scanner(System.in);
		
		//存放字符串数组
		ArrayList<String> arrayList = new ArrayList<String>();
		String string = "";
		
		while(!"/".equals((string=scanner.nextLine()))){
			arrayList.add(string);
		}
		
		StringBuffer resultBuffer = new StringBuffer("('");
		for (int i = 0; i < arrayList.size(); i++) {
			if(i==arrayList.size()-1||arrayList.size()==1){
				resultBuffer.append(arrayList.get(i));
			}else{
				resultBuffer.append(arrayList.get(i)).append("','");
			}
		}
		resultBuffer.append("')");

		System.out.println(resultBuffer.toString());
	}
}
