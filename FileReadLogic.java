	package sbProject3;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.List;
	
	public class FileReadLogic {
		
		public List<String> FileReadLogic(List<String> fileList) throws IOException{
	
			// テキストファイルの呼び出し
			File file = new File("C:\\Users\\tomio\\Desktop\\SB学習\\testReadFile001.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str = br.readLine();
			// 配列にファイル要素を格納
			while (str != null) {
				fileList.add(str);
				str = br.readLine();
			}
			br.close();
			return fileList;
			
		}
	
	}
