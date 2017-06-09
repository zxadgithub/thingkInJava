package zxa.io.dir;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DirList {
	public static void main(String[] args){
		System.out.println("输入文件目录");
		Scanner scanner = new Scanner(System.in);
		
		String file = scanner.next();
		File path = new File("/usr/local/apache-tomcat-8.0.27/lib/");
		String[] list;
//		System.out.println("输入搜索文件名");
//		String pa = scanner.next();
//		if(pa.length() == 0){
			list = path.list();
//		}else{
//			list = path.list(new DirFilter(pa));
//		}
//		list = path.list(new DirFilter("ca"));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list){
			System.out.println(dirItem);
		}
		if(scanner!=null)
		scanner.close();
			System.out.println("测试");
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	@Override
	public boolean accept(File arg0, String arg1) {
		// TODO Auto-generated method stub
		return pattern.matcher(arg1).matches();
	}
	
}


