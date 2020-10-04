package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationManagementPlanControlInputModelBranchLocationManagementPlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRBranchLocationManagementPlanControlInputModel
 */
public class CRBranchLocationManagementPlanControlInputModel   {
  private String branchLocationManagementServicingSessionReference = null;

  private String branchLocationManagementPlanInstanceReference = null;

  private String branchLocationManagementPlanType = null;

  private String branchLocationManagementPlanReference = null;

  private String branchLocationManagementPlanBudgetType = null;

  private String branchLocationManagementPlanAssignment = null;

  private String branchLocationManagementPlanPlan = null;

  private String branchLocationManagementPlanDescription = null;

  private Object branchLocationManagementPlanControlActionTaskRecord = null;

  private CRBranchLocationManagementPlanControlInputModelBranchLocationManagementPlanControlActionRequest branchLocationManagementPlanControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchLocationManagementServicingSessionReference
  **/

  public String getBranchLocationManagementServicingSessionReference() {
    return branchLocationManagementServicingSessionReference;
  }

  public void setBranchLocationManagementServicingSessionReference(String branchLocationManagementServicingSessionReference) {
    this.branchLocationManagementServicingSessionReference = branchLocationManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Branch Location Management Plan instance 
   * @return branchLocationManagementPlanInstanceReference
  **/

  public String getBranchLocationManagementPlanInstanceReference() {
    return branchLocationManagementPlanInstanceReference;
  }

  public void setBranchLocationManagementPlanInstanceReference(String branchLocationManagementPlanInstanceReference) {
    this.branchLocationManagementPlanInstanceReference = branchLocationManagementPlanInstanceReference;
  }


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
   * Get branchLocationManagementPlanControlActionRequest
   * @return branchLocationManagementPlanControlActionRequest
  **/

  public CRBranchLocationManagementPlanControlInputModelBranchLocationManagementPlanControlActionRequest getBranchLocationManagementPlanControlActionRequest() {
    return branchLocationManagementPlanControlActionRequest;
  }

  public void setBranchLocationManagementPlanControlActionRequest(CRBranchLocationManagementPlanControlInputModelBranchLocationManagementPlanControlActionRequest branchLocationManagementPlanControlActionRequest) {
    this.branchLocationManagementPlanControlActionRequest = branchLocationManagementPlanControlActionRequest;
  }


}

