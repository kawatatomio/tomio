package sbProject3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ConvertLogic {

	public List<String> ConvertLogic(List<String> fileList,List<String> conList)throws IOException{

		// �e�L�X�g�t�@�C���̌Ăяo��
		File fileCon = new File("C:\\Users\\tomio\\Desktop\\SB�w�K\\testReadFile002.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileCon));

		String str = br.readLine();
		// �z��Ƀt�@�C���v�f���i�[
		while (str != null) {
			conList.add(str);
			str = br.readLine();
		}
		// �i�[����Ă���v�f�������������`�F�b�N���s��
		for(int i =0; i < conList.size(); i++ ){

			// �z��̗v�f�����V���b�t������
			Collections.shuffle(fileList);
			
			// ��������2�����ȏ�̎��A����2�����������_���ɒu���ւ���
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
