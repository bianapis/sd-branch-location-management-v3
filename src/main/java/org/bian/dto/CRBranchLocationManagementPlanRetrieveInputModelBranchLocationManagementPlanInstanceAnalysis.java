package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis
 */
public class CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis   {
  private String branchLocationManagementPlanInstanceAnalysisReference = null;

  private String branchLocationManagementPlanInstanceAnalysisReportType = null;

  private String branchLocationManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return branchLocationManagementPlanInstanceAnalysisReference
  **/

  public String getBranchLocationManagementPlanInstanceAnalysisReference() {
    return branchLocationManagementPlanInstanceAnalysisReference;
  }

  public void setBranchLocationManagementPlanInstanceAnalysisReference(String branchLocationManagementPlanInstanceAnalysisReference) {
    this.branchLocationManagementPlanInstanceAnalysisReference = branchLocationManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return branchLocationManagementPlanInstanceAnalysisParameters
  **/

  public String getBranchLocationManagementPlanInstanceAnalysisParameters() {
    return branchLocationManagementPlanInstanceAnalysisParameters;
  }

  public void setBranchLocationManagementPlanInstanceAnalysisParameters(String branchLocationManagementPlanInstanceAnalysisParameters) {
    this.branchLocationManagementPlanInstanceAnalysisParameters = branchLocationManagementPlanInstanceAnalysisParameters;
  }


}

