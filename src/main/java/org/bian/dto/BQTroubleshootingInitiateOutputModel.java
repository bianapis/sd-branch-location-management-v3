package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingInitiateOutputModel
 */
public class BQTroubleshootingInitiateOutputModel   {
  private String troubleshootingInstanceReference = null;

  private String troubleshootingInitiateActionReference = null;

  private Object troubleshootingInitiateActionRecord = null;

  private String troubleshootingInstanceStatus = null;

  private String troubleshootingPreconditions = null;

  private String troubleshootingBusinessUnitEmployeeReference = null;

  private String troubleshootingWorkSchedule = null;

  private String businessService = null;

  private String troubleshootingPostconditions = null;

  private String troubleshootingServiceType = null;

  private String troubleshootingServiceDescription = null;

  private String troubleshootingServiceInputsandOuputs = null;

  private String troubleshootingServiceWorkProduct = null;

  private String troubleshootingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Troubleshooting instance 
   * @return troubleshootingInstanceReference
  **/

  public String getTroubleshootingInstanceReference() {
    return troubleshootingInstanceReference;
  }

  public void setTroubleshootingInstanceReference(String troubleshootingInstanceReference) {
    this.troubleshootingInstanceReference = troubleshootingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return troubleshootingInitiateActionReference
  **/

  public String getTroubleshootingInitiateActionReference() {
    return troubleshootingInitiateActionReference;
  }

  public void setTroubleshootingInitiateActionReference(String troubleshootingInitiateActionReference) {
    this.troubleshootingInitiateActionReference = troubleshootingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootingInitiateActionRecord
  **/

  public Object getTroubleshootingInitiateActionRecord() {
    return troubleshootingInitiateActionRecord;
  }

  public void setTroubleshootingInitiateActionRecord(Object troubleshootingInitiateActionRecord) {
    this.troubleshootingInitiateActionRecord = troubleshootingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Troubleshooting instance (e.g. initialised, pending, active) 
   * @return troubleshootingInstanceStatus
  **/

  public String getTroubleshootingInstanceStatus() {
    return troubleshootingInstanceStatus;
  }

  public void setTroubleshootingInstanceStatus(String troubleshootingInstanceStatus) {
    this.troubleshootingInstanceStatus = troubleshootingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return troubleshootingPreconditions
  **/

  public String getTroubleshootingPreconditions() {
    return troubleshootingPreconditions;
  }

  public void setTroubleshootingPreconditions(String troubleshootingPreconditions) {
    this.troubleshootingPreconditions = troubleshootingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return troubleshootingBusinessUnitEmployeeReference
  **/

  public String getTroubleshootingBusinessUnitEmployeeReference() {
    return troubleshootingBusinessUnitEmployeeReference;
  }

  public void setTroubleshootingBusinessUnitEmployeeReference(String troubleshootingBusinessUnitEmployeeReference) {
    this.troubleshootingBusinessUnitEmployeeReference = troubleshootingBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return troubleshootingWorkSchedule
  **/

  public String getTroubleshootingWorkSchedule() {
    return troubleshootingWorkSchedule;
  }

  public void setTroubleshootingWorkSchedule(String troubleshootingWorkSchedule) {
    this.troubleshootingWorkSchedule = troubleshootingWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Branch Location Management Plan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return troubleshootingPostconditions
  **/

  public String getTroubleshootingPostconditions() {
    return troubleshootingPostconditions;
  }

  public void setTroubleshootingPostconditions(String troubleshootingPostconditions) {
    this.troubleshootingPostconditions = troubleshootingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return troubleshootingServiceType
  **/

  public String getTroubleshootingServiceType() {
    return troubleshootingServiceType;
  }

  public void setTroubleshootingServiceType(String troubleshootingServiceType) {
    this.troubleshootingServiceType = troubleshootingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return troubleshootingServiceDescription
  **/

  public String getTroubleshootingServiceDescription() {
    return troubleshootingServiceDescription;
  }

  public void setTroubleshootingServiceDescription(String troubleshootingServiceDescription) {
    this.troubleshootingServiceDescription = troubleshootingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return troubleshootingServiceInputsandOuputs
  **/

  public String getTroubleshootingServiceInputsandOuputs() {
    return troubleshootingServiceInputsandOuputs;
  }

  public void setTroubleshootingServiceInputsandOuputs(String troubleshootingServiceInputsandOuputs) {
    this.troubleshootingServiceInputsandOuputs = troubleshootingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return troubleshootingServiceWorkProduct
  **/

  public String getTroubleshootingServiceWorkProduct() {
    return troubleshootingServiceWorkProduct;
  }

  public void setTroubleshootingServiceWorkProduct(String troubleshootingServiceWorkProduct) {
    this.troubleshootingServiceWorkProduct = troubleshootingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return troubleshootingServiceName
  **/

  public String getTroubleshootingServiceName() {
    return troubleshootingServiceName;
  }

  public void setTroubleshootingServiceName(String troubleshootingServiceName) {
    this.troubleshootingServiceName = troubleshootingServiceName;
  }


}

