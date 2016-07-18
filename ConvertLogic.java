package sbProject3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ConvertLogic {

	public List<String> ConvertLogic(List<String> fileList,List<String> conList)throws IOException{

		// テキストファイルの呼び出し
		File fileCon = new File("C:\\Users\\tomio\\Desktop\\SB学習\\testReadFile002.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileCon));

		String str = br.readLine();
		// 配列にファイル要素を格納
		while (str != null) {
			conList.add(str);
			str = br.readLine();
		}
		// 格納されている要素数だけ文字数チェックを行う
		for(int i =0; i < conList.size(); i++ ){

			// 配列の要素数をシャッフルする
			Collections.shuffle(fileList);
			
			// 文字数が2文字以上の時、末尾2文字をランダムに置き替える
			if(conList.get(i).length() >= 2){
				String s = conList.get(i);
				s = s.substring(0, s.length()-2);
				s = s + fileList.get(0);
				conList.set(i,s);
			}else {
				continue;
			}
			
		}
		br.close();
		return conList;
	}
	
}
