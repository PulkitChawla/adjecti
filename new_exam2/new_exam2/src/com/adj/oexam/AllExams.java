package com.adj.oexam;

import java.util.ArrayList;
import java.util.List;

public class AllExams implements ExamRepository{
	private static List<Exam> examlist = new ArrayList<Exam>();
	private static int curId=0;
	public int addExam(Exam exams) {
		int id=getNextId();
		exams.setId(id);
		examlist.add(exams);
		return id;

	}

	private int getNextId() {
		curId= curId+1;
		return curId;
	}
	public List<Exam> getExamList() {
		return examlist;

	}
	public void deleteById(Exam id) {
		examlist.remove(id);
		
	}
	public Exam getExamById(int examId) {

		for (Exam detail : examlist) {
			if (examId == detail.getId()) {
				return detail;
			}
		}
		return null;
	}
	public List<Exam> getExamByName(String examName) {
		List<Exam> searchList = new ArrayList<Exam>();

		for (Exam e : examlist) {
			if (examName.equals(e.getEname())) {
				searchList.add(e);
			}
		}

		return searchList;
	}

}
