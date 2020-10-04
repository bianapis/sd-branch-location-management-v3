package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord
 */
public class CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord   {
  private String branchLocationManagementPlanInstanceReportReference = null;

  private String branchLocationManagementPlanInstanceReportType = null;

  private String branchLocationManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return branchLocationManagementPlanInstanceReportReference
  **/

  public String getBranchLocationManagementPlanInstanceReportReference() {
    return branchLocationManagementPlanInstanceReportReference;
  }

  public void setBranchLocationManagementPlanInstanceReportReference(String branchLocationManagementPlanInstanceReportReference) {
    this.branchLocationManagementPlanInstanceReportReference = branchLocationManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return branchLocationManagementPlanInstanceReportType
  **/

  public String getBranchLocationManagementPlanInstanceReportType() {
    return branchLocationManagementPlanInstanceReportType;
  }

  public void setBranchLocationManagementPlanInstanceReportType(String branchLocationManagementPlanInstanceReportType) {
    this.branchLocationManagementPlanInstanceReportType = branchLocationManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return branchLocationManagementPlanInstanceReportParameters
  **/

  public String getBranchLocationManagementPlanInstanceReportParameters() {
    return branchLocationManagementPlanInstanceReportParameters;
  }

  public void setBranchLocationManagementPlanInstanceReportParameters(String branchLocationManagementPlanInstanceReportParameters) {
    this.branchLocationManagementPlanInstanceReportParameters = branchLocationManagementPlanInstanceReportParameters;
  }


}

