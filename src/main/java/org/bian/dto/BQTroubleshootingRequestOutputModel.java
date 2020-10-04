package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingRequestOutputModel
 */
public class BQTroubleshootingRequestOutputModel   {
  private String troubleshootingRequestActionTaskReference = null;

  private Object troubleshootingRequestActionTaskRecord = null;

  private String troubleshootingRequestRecordReference = null;

  private Object requestResponseRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Troubleshooting instance request service call 
   * @return troubleshootingRequestActionTaskReference
  **/

  public String getTroubleshootingRequestActionTaskReference() {
    return troubleshootingRequestActionTaskReference;
  }

  public void setTroubleshootingRequestActionTaskReference(String troubleshootingRequestActionTaskReference) {
    this.troubleshootingRequestActionTaskReference = troubleshootingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return troubleshootingRequestActionTaskRecord
  **/

  public Object getTroubleshootingRequestActionTaskRecord() {
    return troubleshootingRequestActionTaskRecord;
  }

  public void setTroubleshootingRequestActionTaskRecord(Object troubleshootingRequestActionTaskRecord) {
    this.troubleshootingRequestActionTaskRecord = troubleshootingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting service request record 
   * @return troubleshootingRequestRecordReference
  **/

  public String getTroubleshootingRequestRecordReference() {
    return troubleshootingRequestRecordReference;
  }

  public void setTroubleshootingRequestRecordReference(String troubleshootingRequestRecordReference) {
    this.troubleshootingRequestRecordReference = troubleshootingRequestRecordReference;
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

