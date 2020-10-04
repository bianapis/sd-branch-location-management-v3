package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonUpdateInputModel
 */
public class BQCustomerLiaisonUpdateInputModel   {
  private String branchLocationManagementPlanInstanceReference = null;

  private String customerLiaisonInstanceReference = null;

  private Object customerLiaisonUpdateActionTaskRecord = null;

  private String customerLiaisonUpdateActionRequest = null;

  private String productandServicePlanningPreconditions = null;

  private String productandServicePlanningBusinessUnitEmployeeReference = null;

  private String productandServicePlanningWorkSchedule = null;

  private String productandServicePlanning = null;

  private String productandServicePlanningPostconditions = null;

  private String productandServicePlanningProductandServicePlanningServiceType = null;

  private String productandServicePlanningProductandServicePlanningServiceDescription = null;

  private String productandServicePlanningProductandServicePlanningServiceInputsandOuputs = null;

  private String productandServicePlanningProductandServicePlanningServiceWorkProduct = null;

  private String productandServicePlanningProductandServicePlanningServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Branch Location Management Plan instance 
   * @return branchLocationManagementPlanInstanceReference
  **/

  public String getBranchLocationManagementPlanInstanceReference() {
    return branchLocationManagementPlanInstanceReference;
  }

  public void setBranchLocationManagementPlanInstanceReference(String branchLocationManagementPlanInstanceReference) {
    this.branchLocationManagementPlanInstanceReference = branchLocationManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Liaison instance 
   * @return customerLiaisonInstanceReference
  **/

  public String getCustomerLiaisonInstanceReference() {
    return customerLiaisonInstanceReference;
  }

  public void setCustomerLiaisonInstanceReference(String customerLiaisonInstanceReference) {
    this.customerLiaisonInstanceReference = customerLiaisonInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerLiaisonUpdateActionTaskRecord
  **/

  public Object getCustomerLiaisonUpdateActionTaskRecord() {
    return customerLiaisonUpdateActionTaskRecord;
  }

  public void setCustomerLiaisonUpdateActionTaskRecord(Object customerLiaisonUpdateActionTaskRecord) {
    this.customerLiaisonUpdateActionTaskRecord = customerLiaisonUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return customerLiaisonUpdateActionRequest
  **/

  public String getCustomerLiaisonUpdateActionRequest() {
    return customerLiaisonUpdateActionRequest;
  }

  public void setCustomerLiaisonUpdateActionRequest(String customerLiaisonUpdateActionRequest) {
    this.customerLiaisonUpdateActionRequest = customerLiaisonUpdateActionRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return productandServicePlanningPreconditions
  **/

  public String getProductandServicePlanningPreconditions() {
    return productandServicePlanningPreconditions;
  }

  public void setProductandServicePlanningPreconditions(String productandServicePlanningPreconditions) {
    this.productandServicePlanningPreconditions = productandServicePlanningPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return productandServicePlanningBusinessUnitEmployeeReference
  **/

  public String getProductandServicePlanningBusinessUnitEmployeeReference() {
    return productandServicePlanningBusinessUnitEmployeeReference;
  }

  public void setProductandServicePlanningBusinessUnitEmployeeReference(String productandServicePlanningBusinessUnitEmployeeReference) {
    this.productandServicePlanningBusinessUnitEmployeeReference = productandServicePlanningBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return productandServicePlanningWorkSchedule
  **/

  public String getProductandServicePlanningWorkSchedule() {
    return productandServicePlanningWorkSchedule;
  }

  public void setProductandServicePlanningWorkSchedule(String productandServicePlanningWorkSchedule) {
    this.productandServicePlanningWorkSchedule = productandServicePlanningWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Branch Location Management Plan specific Business Service 
   * @return productandServicePlanning
  **/

  public String getProductandServicePlanning() {
    return productandServicePlanning;
  }

  public void setProductandServicePlanning(String productandServicePlanning) {
    this.productandServicePlanning = productandServicePlanning;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return productandServicePlanningPostconditions
  **/

  public String getProductandServicePlanningPostconditions() {
    return productandServicePlanningPostconditions;
  }

  public void setProductandServicePlanningPostconditions(String productandServicePlanningPostconditions) {
    this.productandServicePlanningPostconditions = productandServicePlanningPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productandServicePlanningProductandServicePlanningServiceType
  **/

  public String getProductandServicePlanningProductandServicePlanningServiceType() {
    return productandServicePlanningProductandServicePlanningServiceType;
  }

  public void setProductandServicePlanningProductandServicePlanningServiceType(String productandServicePlanningProductandServicePlanningServiceType) {
    this.productandServicePlanningProductandServicePlanningServiceType = productandServicePlanningProductandServicePlanningServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productandServicePlanningProductandServicePlanningServiceDescription
  **/

  public String getProductandServicePlanningProductandServicePlanningServiceDescription() {
    return productandServicePlanningProductandServicePlanningServiceDescription;
  }

  public void setProductandServicePlanningProductandServicePlanningServiceDescription(String productandServicePlanningProductandServicePlanningServiceDescription) {
    this.productandServicePlanningProductandServicePlanningServiceDescription = productandServicePlanningProductandServicePlanningServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productandServicePlanningProductandServicePlanningServiceInputsandOuputs
  **/

  public String getProductandServicePlanningProductandServicePlanningServiceInputsandOuputs() {
    return productandServicePlanningProductandServicePlanningServiceInputsandOuputs;
  }

  public void setProductandServicePlanningProductandServicePlanningServiceInputsandOuputs(String productandServicePlanningProductandServicePlanningServiceInputsandOuputs) {
    this.productandServicePlanningProductandServicePlanningServiceInputsandOuputs = productandServicePlanningProductandServicePlanningServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productandServicePlanningProductandServicePlanningServiceWorkProduct
  **/

  public String getProductandServicePlanningProductandServicePlanningServiceWorkProduct() {
    return productandServicePlanningProductandServicePlanningServiceWorkProduct;
  }

  public void setProductandServicePlanningProductandServicePlanningServiceWorkProduct(String productandServicePlanningProductandServicePlanningServiceWorkProduct) {
    this.productandServicePlanningProductandServicePlanningServiceWorkProduct = productandServicePlanningProductandServicePlanningServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return productandServicePlanningProductandServicePlanningServiceName
  **/

  public String getProductandServicePlanningProductandServicePlanningServiceName() {
    return productandServicePlanningProductandServicePlanningServiceName;
  }

  public void setProductandServicePlanningProductandServicePlanningServiceName(String productandServicePlanningProductandServicePlanningServiceName) {
    this.productandServicePlanningProductandServicePlanningServiceName = productandServicePlanningProductandServicePlanningServiceName;
  }


}

