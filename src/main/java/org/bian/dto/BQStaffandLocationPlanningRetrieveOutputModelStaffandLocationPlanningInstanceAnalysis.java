package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffandLocationPlanningRetrieveOutputModelStaffandLocationPlanningInstanceAnalysis
 */
public class BQStaffandLocationPlanningRetrieveOutputModelStaffandLocationPlanningInstanceAnalysis   {
  private Object staffandLocationPlanningInstanceAnalysisRecord = null;

  private String staffandLocationPlanningInstanceAnalysisReportType = null;

  private String staffandLocationPlanningInstanceAnalysisParameters = null;

  private Object staffandLocationPlanningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return staffandLocationPlanningInstanceAnalysisRecord
  **/

  public Object getStaffandLocationPlanningInstanceAnalysisRecord() {
    return staffandLocationPlanningInstanceAnalysisRecord;
  }

  public void setStaffandLocationPlanningInstanceAnalysisRecord(Object staffandLocationPlanningInstanceAnalysisRecord) {
    this.staffandLocationPlanningInstanceAnalysisRecord = staffandLocationPlanningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return staffandLocationPlanningInstanceAnalysisReportType
  **/

  public String getStaffandLocationPlanningInstanceAnalysisReportType() {
    return staffandLocationPlanningInstanceAnalysisReportType;
  }

  public void setStaffandLocationPlanningInstanceAnalysisReportType(String staffandLocationPlanningInstanceAnalysisReportType) {
    this.staffandLocationPlanningInstanceAnalysisReportType = staffandLocationPlanningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return staffandLocationPlanningInstanceAnalysisParameters
  **/

  public String getStaffandLocationPlanningInstanceAnalysisParameters() {
    return staffandLocationPlanningInstanceAnalysisParameters;
  }

  public void setStaffandLocationPlanningInstanceAnalysisParameters(String staffandLocationPlanningInstanceAnalysisParameters) {
    this.staffandLocationPlanningInstanceAnalysisParameters = staffandLocationPlanningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return staffandLocationPlanningInstanceAnalysisReport
  **/

  public Object getStaffandLocationPlanningInstanceAnalysisReport() {
    return staffandLocationPlanningInstanceAnalysisReport;
  }

  public void setStaffandLocationPlanningInstanceAnalysisReport(Object staffandLocationPlanningInstanceAnalysisReport) {
    this.staffandLocationPlanningInstanceAnalysisReport = staffandLocationPlanningInstanceAnalysisReport;
  }


}

