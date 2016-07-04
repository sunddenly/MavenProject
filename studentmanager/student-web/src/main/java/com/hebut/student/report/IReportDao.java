package com.hebut.student.report;

import com.hebut.student.dto.StudentExcelDto;

import java.util.List;



public interface IReportDao {
	public List<StudentExcelDto> getReportStus();
}
