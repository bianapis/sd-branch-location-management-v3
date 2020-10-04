package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord
 */
public class CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord   {
  private String branchLocationManagementPlanInstanceReportData = null;

  private String branchLocationManagementPlanInstanceReportType = null;

  private Object branchLocationManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return branchLocationManagementPlanInstanceReportData
  **/

  public String getBranchLocationManagementPlanInstanceReportData() {
    return branchLocationManagementPlanInstanceReportData;
  }

  public void setBranchLocationManagementPlanInstanceReportData(String branchLocationManagementPlanInstanceReportData) {
    this.branchLocationManagementPlanInstanceReportData = branchLocationManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return branchLocationManagementPlanInstanceReport
  **/

  public Object getBranchLocationManagementPlanInstanceReport() {
    return branchLocationManagementPlanInstanceReport;
  }

  public void setBranchLocationManagementPlanInstanceReport(Object branchLocationManagementPlanInstanceReport) {
    this.branchLocationManagementPlanInstanceReport = branchLocationManagementPlanInstanceReport;
  }


}

