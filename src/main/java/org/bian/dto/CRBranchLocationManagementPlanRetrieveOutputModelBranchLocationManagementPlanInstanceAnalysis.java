package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis
 */
public class CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis   {
  private String branchLocationManagementPlanInstanceAnalysisData = null;

  private String branchLocationManagementPlanInstanceAnalysisReportType = null;

  private Object branchLocationManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return branchLocationManagementPlanInstanceAnalysisData
  **/

  public String getBranchLocationManagementPlanInstanceAnalysisData() {
    return branchLocationManagementPlanInstanceAnalysisData;
  }

  public void setBranchLocationManagementPlanInstanceAnalysisData(String branchLocationManagementPlanInstanceAnalysisData) {
    this.branchLocationManagementPlanInstanceAnalysisData = branchLocationManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return branchLocationManagementPlanInstanceAnalysisReportType
  **/

  public String getBranchLocationManagementPlanInstanceAnalysisReportType() {
    return branchLocationManagementPlanInstanceAnalysisReportType;
  }

  public void setBranchLocationManagementPlanInstanceAnalysisReportType(String branchLocationManagementPlanInstanceAnalysisReportType) {
    this.branchLocationManagementPlanInstanceAnalysisReportType = branchLocationManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return branchLocationManagementPlanInstanceAnalysisReport
  **/

  public Object getBranchLocationManagementPlanInstanceAnalysisReport() {
    return branchLocationManagementPlanInstanceAnalysisReport;
  }

  public void setBranchLocationManagementPlanInstanceAnalysisReport(Object branchLocationManagementPlanInstanceAnalysisReport) {
    this.branchLocationManagementPlanInstanceAnalysisReport = branchLocationManagementPlanInstanceAnalysisReport;
  }


}

