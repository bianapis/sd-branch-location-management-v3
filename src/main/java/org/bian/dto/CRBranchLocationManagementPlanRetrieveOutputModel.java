package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis;
import org.bian.dto.CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanRetrieveOutputModel
 */
public class CRBranchLocationManagementPlanRetrieveOutputModel   {
  private String branchLocationManagementPlanType = null;

  private String branchLocationManagementPlanReference = null;

  private String branchLocationManagementPlanBudgetType = null;

  private String branchLocationManagementPlanAssignment = null;

  private String branchLocationManagementPlanPlan = null;

  private String branchLocationManagementPlanDescription = null;

  private String branchLocationManagementPlanRetrieveActionTaskReference = null;

  private Object branchLocationManagementPlanRetrieveActionTaskRecord = null;

  private String branchLocationManagementPlanRetrieveActionResponse = null;

  private CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord branchLocationManagementPlanInstanceReportRecord = null;

  private CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis branchLocationManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Branch Location Management Plan 
   * @return branchLocationManagementPlanType
  **/

  public String getBranchLocationManagementPlanType() {
    return branchLocationManagementPlanType;
  }

  public void setBranchLocationManagementPlanType(String branchLocationManagementPlanType) {
    this.branchLocationManagementPlanType = branchLocationManagementPlanType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Branch Location Management Plan 
   * @return branchLocationManagementPlanReference
  **/

  public String getBranchLocationManagementPlanReference() {
    return branchLocationManagementPlanReference;
  }

  public void setBranchLocationManagementPlanReference(String branchLocationManagementPlanReference) {
    this.branchLocationManagementPlanReference = branchLocationManagementPlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Branch Location Management Plan according to the type of resource and/or activity that is budgetted 
   * @return branchLocationManagementPlanBudgetType
  **/

  public String getBranchLocationManagementPlanBudgetType() {
    return branchLocationManagementPlanBudgetType;
  }

  public void setBranchLocationManagementPlanBudgetType(String branchLocationManagementPlanBudgetType) {
    this.branchLocationManagementPlanBudgetType = branchLocationManagementPlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Branch Location Management Plan 
   * @return branchLocationManagementPlanAssignment
  **/

  public String getBranchLocationManagementPlanAssignment() {
    return branchLocationManagementPlanAssignment;
  }

  public void setBranchLocationManagementPlanAssignment(String branchLocationManagementPlanAssignment) {
    this.branchLocationManagementPlanAssignment = branchLocationManagementPlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to Branch Location Management Plan  
   * @return branchLocationManagementPlanPlan
  **/

  public String getBranchLocationManagementPlanPlan() {
    return branchLocationManagementPlanPlan;
  }

  public void setBranchLocationManagementPlanPlan(String branchLocationManagementPlanPlan) {
    this.branchLocationManagementPlanPlan = branchLocationManagementPlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Branch Location Management Plan 
   * @return branchLocationManagementPlanDescription
  **/

  public String getBranchLocationManagementPlanDescription() {
    return branchLocationManagementPlanDescription;
  }

  public void setBranchLocationManagementPlanDescription(String branchLocationManagementPlanDescription) {
    this.branchLocationManagementPlanDescription = branchLocationManagementPlanDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Management Plan instance retrieve service call 
   * @return branchLocationManagementPlanRetrieveActionTaskReference
  **/

  public String getBranchLocationManagementPlanRetrieveActionTaskReference() {
    return branchLocationManagementPlanRetrieveActionTaskReference;
  }

  public void setBranchLocationManagementPlanRetrieveActionTaskReference(String branchLocationManagementPlanRetrieveActionTaskReference) {
    this.branchLocationManagementPlanRetrieveActionTaskReference = branchLocationManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchLocationManagementPlanRetrieveActionResponse
  **/

  public String getBranchLocationManagementPlanRetrieveActionResponse() {
    return branchLocationManagementPlanRetrieveActionResponse;
  }

  public void setBranchLocationManagementPlanRetrieveActionResponse(String branchLocationManagementPlanRetrieveActionResponse) {
    this.branchLocationManagementPlanRetrieveActionResponse = branchLocationManagementPlanRetrieveActionResponse;
  }


  /**
   * Get branchLocationManagementPlanInstanceReportRecord
   * @return branchLocationManagementPlanInstanceReportRecord
  **/

  public CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord getBranchLocationManagementPlanInstanceReportRecord() {
    return branchLocationManagementPlanInstanceReportRecord;
  }

  public void setBranchLocationManagementPlanInstanceReportRecord(CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceReportRecord branchLocationManagementPlanInstanceReportRecord) {
    this.branchLocationManagementPlanInstanceReportRecord = branchLocationManagementPlanInstanceReportRecord;
  }


  /**
   * Get branchLocationManagementPlanInstanceAnalysis
   * @return branchLocationManagementPlanInstanceAnalysis
  **/

  public CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis getBranchLocationManagementPlanInstanceAnalysis() {
    return branchLocationManagementPlanInstanceAnalysis;
  }

  public void setBranchLocationManagementPlanInstanceAnalysis(CRBranchLocationManagementPlanRetrieveOutputModelBranchLocationManagementPlanInstanceAnalysis branchLocationManagementPlanInstanceAnalysis) {
    this.branchLocationManagementPlanInstanceAnalysis = branchLocationManagementPlanInstanceAnalysis;
  }


}

