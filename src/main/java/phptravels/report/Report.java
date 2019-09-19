package phptravels.report;

import core.utils.Log;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportI2Celectronica class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Report {
    /**
     * This method gets an instance of ReportI2Celectronica from getInstance.
     *
     * @return an instance ReportI2Celectronica.
     */
    public static Report getInstance() {
        return new Report();
    }

    /**
     * This method set up and create a report.
     */
    public void generateReport() {
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");
        final String projectName = "I2Celectronica";
        final boolean runWithJenkins = false;
        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // additional metadata presented on main page.
        configuration.addClassifications("Platform", "WINDOWS");
        configuration.addClassifications("Branch", "RELEASE/1.0");
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        // and here validate 'result' to decide what to do if report has failed.
        final Reportable result = reportBuilder.generateReports();
        Log.getInstance().getLog().info(result);
    }
}
