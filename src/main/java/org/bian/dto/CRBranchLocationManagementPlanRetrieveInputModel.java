package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis;
import org.bian.dto.CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveInputModel
 */
public class CRBranchLocationManagementPlanRetrieveInputModel   {
  private Object branchLocationManagementPlanRetrieveActionTaskRecord = null;

  private String branchLocationManagementPlanRetrieveActionRequest = null;

  private CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord branchLocationManagementPlanInstanceReportRecord = null;

  private CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis branchLocationManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationManagementPlanRetrieveActionTaskRecord
  **/

  public Object getBranchLocationManagementPlanRetrieveActionTaskRecord() {
    return branchLocationManagementPlanRetrieveActionTaskRecord;
  }

  public void setBranchLocationManagementPlanRetrieveActionTaskRecord(Object branchLocationManagementPlanRetrieveActionTaskRecord) {
    this.branchLocationManagementPlanRetrieveActionTaskRecord = branchLocationManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchLocationManagementPlanRetrieveActionRequest
  **/

  public String getBranchLocationManagementPlanRetrieveActionRequest() {
    return branchLocationManagementPlanRetrieveActionRequest;
  }

  public void setBranchLocationManagementPlanRetrieveActionRequest(String branchLocationManagementPlanRetrieveActionRequest) {
    this.branchLocationManagementPlanRetrieveActionRequest = branchLocationManagementPlanRetrieveActionRequest;
  }


  /**
   * Get branchLocationManagementPlanInstanceReportRecord
   * @return branchLocationManagementPlanInstanceReportRecord
  **/

  public CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord getBranchLocationManagementPlanInstanceReportRecord() {
    return branchLocationManagementPlanInstanceReportRecord;
  }

  public void setBranchLocationManagementPlanInstanceReportRecord(CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceReportRecord branchLocationManagementPlanInstanceReportRecord) {
    this.branchLocationManagementPlanInstanceReportRecord = branchLocationManagementPlanInstanceReportRecord;
  }


  /**
   * Get branchLocationManagementPlanInstanceAnalysis
   * @return branchLocationManagementPlanInstanceAnalysis
  **/

  public CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis getBranchLocationManagementPlanInstanceAnalysis() {
    return branchLocationManagementPlanInstanceAnalysis;
  }

  public void setBranchLocationManagementPlanInstanceAnalysis(CRBranchLocationManagementPlanRetrieveInputModelBranchLocationManagementPlanInstanceAnalysis branchLocationManagementPlanInstanceAnalysis) {
    this.branchLocationManagementPlanInstanceAnalysis = branchLocationManagementPlanInstanceAnalysis;
  }


}

