package sbProject3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Contoroller {	
	
	public static void main(String[] args) throws IOException{
		
		List<String> fileList = new ArrayList<String>();
		List<String> conList = new ArrayList<String>();
		FileReadLogic read = new FileReadLogic();
		ConvertLogic con = new ConvertLogic();
		
		// FileReadLogic呼び出し
		read.FileReadLogic(fileList);
		// ConvertLogic呼び出し
		con.ConvertLogic(fileList,conList);
		
		// 配列要素を表示
		for(int i = 0; i < conList.size(); i++){
			System.out.println(conList.get(i));
		}
	}
	
}
