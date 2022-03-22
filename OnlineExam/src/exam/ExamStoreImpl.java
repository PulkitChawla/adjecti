package exam;

import java.util.ArrayList;
import java.util.List;

public class ExamStoreImpl  {

	private static List<Exam> storeList = new ArrayList<Exam>();

	
	public void addExam(Exam e) {

		storeList.add(e);
	}

	public List<Exam> getList() {

		return storeList;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		for (int i = (storeList.size() - 1); i >= 0; i--) {
			Exam exam = storeList.get(i);
			if (id == exam.getId()) {
				storeList.remove(i);
			}
		}
	}

	public List<Exam> deleteByName(String name) {
		List<Exam> list = new ArrayList<Exam>();
		for (int i = 0; i < storeList.size(); i++) {
			Exam e = storeList.get(i);
			if (name.equals(e.getName())) {
				list.remove(e);
			}
		}
		return list;
	}

	public Exam searchById(int Id) {
		for (int i = 0; i < storeList.size(); i++) {
			Exam e = storeList.get(i);
			if (Id == e.getId()) {
				return e;
			}
		}
		return null;
	}
	
	public Exam updateExam(int id) {
		for(int i=0;i<storeList.size();i++) {
			Exam e=storeList.get(i);
			if(id==e.getId()) {
				e.setId(id);
				//e.setName(name);
				//e.setDesc(desc);
			}
		}
		return null;
		
	}
}