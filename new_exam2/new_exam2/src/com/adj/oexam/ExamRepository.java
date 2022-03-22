package com.adj.oexam;

import java.util.List;

public interface ExamRepository {
	public int addExam(Exam exams);
	public List<Exam> getExamList();
	public void deleteById(Exam id);
	public Exam getExamById(int examId);
	public List<Exam> getExamByName(String examName);
}
