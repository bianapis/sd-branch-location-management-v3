package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanExchangeOutputModel
 */
public class CRBranchLocationManagementPlanExchangeOutputModel   {
  private String branchLocationManagementPlanBudgetType = null;

  private String branchLocationManagementPlanAssignment = null;

  private String branchLocationManagementPlanPlan = null;

  private String branchLocationManagementPlanExchangeActionTaskReference = null;

  private Object branchLocationManagementPlanExchangeActionTaskRecord = null;

  private String branchLocationManagementPlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Management Plan instance exchange service call 
   * @return branchLocationManagementPlanExchangeActionTaskReference
  **/

  public String getBranchLocationManagementPlanExchangeActionTaskReference() {
    return branchLocationManagementPlanExchangeActionTaskReference;
  }

  public void setBranchLocationManagementPlanExchangeActionTaskReference(String branchLocationManagementPlanExchangeActionTaskReference) {
    this.branchLocationManagementPlanExchangeActionTaskReference = branchLocationManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return branchLocationManagementPlanExchangeActionTaskRecord
  **/

  public Object getBranchLocationManagementPlanExchangeActionTaskRecord() {
    return branchLocationManagementPlanExchangeActionTaskRecord;
  }

  public void setBranchLocationManagementPlanExchangeActionTaskRecord(Object branchLocationManagementPlanExchangeActionTaskRecord) {
    this.branchLocationManagementPlanExchangeActionTaskRecord = branchLocationManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return branchLocationManagementPlanExchangeActionResponse
  **/

  public String getBranchLocationManagementPlanExchangeActionResponse() {
    return branchLocationManagementPlanExchangeActionResponse;
  }

  public void setBranchLocationManagementPlanExchangeActionResponse(String branchLocationManagementPlanExchangeActionResponse) {
    this.branchLocationManagementPlanExchangeActionResponse = branchLocationManagementPlanExchangeActionResponse;
  }


}

