package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonInitiateOutputModel
 */
public class BQCustomerLiaisonInitiateOutputModel   {
  private String customerLiaisonInstanceReference = null;

  private String customerLiaisonInitiateActionReference = null;

  private Object customerLiaisonInitiateActionRecord = null;

  private String customerLiaisonInstanceStatus = null;

  private String customerLiaisonPreconditions = null;

  private String customerLiaisonBusinessUnitEmployeeReference = null;

  private String customerLiaisonWorkSchedule = null;

  private String customerLiaisonPostconditions = null;

  private String customerLiaisonCustomerLiaisonServiceType = null;

  private String customerLiaisonCustomerLiaisonServiceDescription = null;

  private String customerLiaisonCustomerLiaisonServiceInputsandOuputs = null;

  private String customerLiaisonCustomerLiaisonServiceWorkProduct = null;

  private String customerLiaisonCustomerLiaisonServiceName = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerLiaisonInitiateActionReference
  **/

  public String getCustomerLiaisonInitiateActionReference() {
    return customerLiaisonInitiateActionReference;
  }

  public void setCustomerLiaisonInitiateActionReference(String customerLiaisonInitiateActionReference) {
    this.customerLiaisonInitiateActionReference = customerLiaisonInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerLiaisonInitiateActionRecord
  **/

  public Object getCustomerLiaisonInitiateActionRecord() {
    return customerLiaisonInitiateActionRecord;
  }

  public void setCustomerLiaisonInitiateActionRecord(Object customerLiaisonInitiateActionRecord) {
    this.customerLiaisonInitiateActionRecord = customerLiaisonInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Liaison instance (e.g. initialised, pending, active) 
   * @return customerLiaisonInstanceStatus
  **/

  public String getCustomerLiaisonInstanceStatus() {
    return customerLiaisonInstanceStatus;
  }

  public void setCustomerLiaisonInstanceStatus(String customerLiaisonInstanceStatus) {
    this.customerLiaisonInstanceStatus = customerLiaisonInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return customerLiaisonPreconditions
  **/

  public String getCustomerLiaisonPreconditions() {
    return customerLiaisonPreconditions;
  }

  public void setCustomerLiaisonPreconditions(String customerLiaisonPreconditions) {
    this.customerLiaisonPreconditions = customerLiaisonPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return customerLiaisonBusinessUnitEmployeeReference
  **/

  public String getCustomerLiaisonBusinessUnitEmployeeReference() {
    return customerLiaisonBusinessUnitEmployeeReference;
  }

  public void setCustomerLiaisonBusinessUnitEmployeeReference(String customerLiaisonBusinessUnitEmployeeReference) {
    this.customerLiaisonBusinessUnitEmployeeReference = customerLiaisonBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return customerLiaisonWorkSchedule
  **/

  public String getCustomerLiaisonWorkSchedule() {
    return customerLiaisonWorkSchedule;
  }

  public void setCustomerLiaisonWorkSchedule(String customerLiaisonWorkSchedule) {
    this.customerLiaisonWorkSchedule = customerLiaisonWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return customerLiaisonPostconditions
  **/

  public String getCustomerLiaisonPostconditions() {
    return customerLiaisonPostconditions;
  }

  public void setCustomerLiaisonPostconditions(String customerLiaisonPostconditions) {
    this.customerLiaisonPostconditions = customerLiaisonPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return customerLiaisonCustomerLiaisonServiceType
  **/

  public String getCustomerLiaisonCustomerLiaisonServiceType() {
    return customerLiaisonCustomerLiaisonServiceType;
  }

  public void setCustomerLiaisonCustomerLiaisonServiceType(String customerLiaisonCustomerLiaisonServiceType) {
    this.customerLiaisonCustomerLiaisonServiceType = customerLiaisonCustomerLiaisonServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return customerLiaisonCustomerLiaisonServiceDescription
  **/

  public String getCustomerLiaisonCustomerLiaisonServiceDescription() {
    return customerLiaisonCustomerLiaisonServiceDescription;
  }

  public void setCustomerLiaisonCustomerLiaisonServiceDescription(String customerLiaisonCustomerLiaisonServiceDescription) {
    this.customerLiaisonCustomerLiaisonServiceDescription = customerLiaisonCustomerLiaisonServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return customerLiaisonCustomerLiaisonServiceInputsandOuputs
  **/

  public String getCustomerLiaisonCustomerLiaisonServiceInputsandOuputs() {
    return customerLiaisonCustomerLiaisonServiceInputsandOuputs;
  }

  public void setCustomerLiaisonCustomerLiaisonServiceInputsandOuputs(String customerLiaisonCustomerLiaisonServiceInputsandOuputs) {
    this.customerLiaisonCustomerLiaisonServiceInputsandOuputs = customerLiaisonCustomerLiaisonServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return customerLiaisonCustomerLiaisonServiceWorkProduct
  **/

  public String getCustomerLiaisonCustomerLiaisonServiceWorkProduct() {
    return customerLiaisonCustomerLiaisonServiceWorkProduct;
  }

  public void setCustomerLiaisonCustomerLiaisonServiceWorkProduct(String customerLiaisonCustomerLiaisonServiceWorkProduct) {
    this.customerLiaisonCustomerLiaisonServiceWorkProduct = customerLiaisonCustomerLiaisonServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return customerLiaisonCustomerLiaisonServiceName
  **/

  public String getCustomerLiaisonCustomerLiaisonServiceName() {
    return customerLiaisonCustomerLiaisonServiceName;
  }

  public void setCustomerLiaisonCustomerLiaisonServiceName(String customerLiaisonCustomerLiaisonServiceName) {
    this.customerLiaisonCustomerLiaisonServiceName = customerLiaisonCustomerLiaisonServiceName;
  }


}

