package com.hebut.student.report;

import java.util.List;

import javax.inject.Inject;

import com.hebut.student.dto.StudentExcelDto;
import org.springframework.stereotype.Service;

@Service("reportService")
public class ReportService implements IReportService{
	private IReportDao reportDao;
	public IReportDao getReportDao() {
		return reportDao;
	}
	@Inject
	public void setReportDao(IReportDao reportDao) {
		this.reportDao = reportDao;
	}

	@Override
	public List<StudentExcelDto> getReportStus() {
		return reportDao.getReportStus();
	}
}
