package com.mraphaelpy.IvenTrack.Controllers.Report;

import com.mraphaelpy.IvenTrack.Interfaces.IReport;

public class ReportController implements IReport {
    @Override
    public String generateReport() {
        return "Report Gerado";
    }
}
