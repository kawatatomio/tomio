	package sbProject3;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.List;
	
	public class FileReadLogic {
		
		public List<String> FileReadLogic(List<String> fileList) throws IOException{
	
			// �e�L�X�g�t�@�C���̌Ăяo��
			File file = new File("C:\\Users\\tomio\\Desktop\\SB�w�K\\testReadFile001.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str = br.readLine();
			// �z��Ƀt�@�C���v�f���i�[
			while (str != null) {
				fileList.add(str);
				str = br.readLine();
			}
			br.close();
			return fileList;
			
		}
	
	}
