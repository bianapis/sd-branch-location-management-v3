package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanControlOutputModel
 */
public class CRBranchLocationManagementPlanControlOutputModel   {
  private String branchLocationManagementPlanBudgetType = null;

  private String branchLocationManagementPlanAssignment = null;

  private String branchLocationManagementPlanPlan = null;

  private String branchLocationManagementPlanControlActionTaskReference = null;

  private Object branchLocationManagementPlanControlActionTaskRecord = null;

  private String branchLocationManagementPlanControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Management Plan instance control processing service call 
   * @return branchLocationManagementPlanControlActionTaskReference
  **/

  public String getBranchLocationManagementPlanControlActionTaskReference() {
    return branchLocationManagementPlanControlActionTaskReference;
  }

  public void setBranchLocationManagementPlanControlActionTaskReference(String branchLocationManagementPlanControlActionTaskReference) {
    this.branchLocationManagementPlanControlActionTaskReference = branchLocationManagementPlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return branchLocationManagementPlanControlActionTaskRecord
  **/

  public Object getBranchLocationManagementPlanControlActionTaskRecord() {
    return branchLocationManagementPlanControlActionTaskRecord;
  }

  public void setBranchLocationManagementPlanControlActionTaskRecord(Object branchLocationManagementPlanControlActionTaskRecord) {
    this.branchLocationManagementPlanControlActionTaskRecord = branchLocationManagementPlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return branchLocationManagementPlanControlActionResponse
  **/

  public String getBranchLocationManagementPlanControlActionResponse() {
    return branchLocationManagementPlanControlActionResponse;
  }

  public void setBranchLocationManagementPlanControlActionResponse(String branchLocationManagementPlanControlActionResponse) {
    this.branchLocationManagementPlanControlActionResponse = branchLocationManagementPlanControlActionResponse;
  }


}

