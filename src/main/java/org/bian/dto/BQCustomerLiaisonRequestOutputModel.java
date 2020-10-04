package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerLiaisonRequestOutputModel
 */
public class BQCustomerLiaisonRequestOutputModel   {
  private String customerLiaisonRequestActionTaskReference = null;

  private Object customerLiaisonRequestActionTaskRecord = null;

  private String customerLiaisonRequestRecordReference = null;

  private Object requestResponseRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Liaison instance request service call 
   * @return customerLiaisonRequestActionTaskReference
  **/

  public String getCustomerLiaisonRequestActionTaskReference() {
    return customerLiaisonRequestActionTaskReference;
  }

  public void setCustomerLiaisonRequestActionTaskReference(String customerLiaisonRequestActionTaskReference) {
    this.customerLiaisonRequestActionTaskReference = customerLiaisonRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerLiaisonRequestActionTaskRecord
  **/

  public Object getCustomerLiaisonRequestActionTaskRecord() {
    return customerLiaisonRequestActionTaskRecord;
  }

  public void setCustomerLiaisonRequestActionTaskRecord(Object customerLiaisonRequestActionTaskRecord) {
    this.customerLiaisonRequestActionTaskRecord = customerLiaisonRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Liaison service request record 
   * @return customerLiaisonRequestRecordReference
  **/

  public String getCustomerLiaisonRequestRecordReference() {
    return customerLiaisonRequestRecordReference;
  }

  public void setCustomerLiaisonRequestRecordReference(String customerLiaisonRequestRecordReference) {
    this.customerLiaisonRequestRecordReference = customerLiaisonRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
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

