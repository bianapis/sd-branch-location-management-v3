package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffandLocationPlanningRequestOutputModel
 */
public class BQStaffandLocationPlanningRequestOutputModel   {
  private String staffandLocationPlanningRequestActionTaskReference = null;

  private Object staffandLocationPlanningRequestActionTaskRecord = null;

  private String staffandLocationPlanningRequestRecordReference = null;

  private Object requestResponseRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Staff and Location Planning instance request service call 
   * @return staffandLocationPlanningRequestActionTaskReference
  **/

  public String getStaffandLocationPlanningRequestActionTaskReference() {
    return staffandLocationPlanningRequestActionTaskReference;
  }

  public void setStaffandLocationPlanningRequestActionTaskReference(String staffandLocationPlanningRequestActionTaskReference) {
    this.staffandLocationPlanningRequestActionTaskReference = staffandLocationPlanningRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return staffandLocationPlanningRequestActionTaskRecord
  **/

  public Object getStaffandLocationPlanningRequestActionTaskRecord() {
    return staffandLocationPlanningRequestActionTaskRecord;
  }

  public void setStaffandLocationPlanningRequestActionTaskRecord(Object staffandLocationPlanningRequestActionTaskRecord) {
    this.staffandLocationPlanningRequestActionTaskRecord = staffandLocationPlanningRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Staff and Location Planning service request record 
   * @return staffandLocationPlanningRequestRecordReference
  **/

  public String getStaffandLocationPlanningRequestRecordReference() {
    return staffandLocationPlanningRequestRecordReference;
  }

  public void setStaffandLocationPlanningRequestRecordReference(String staffandLocationPlanningRequestRecordReference) {
    this.staffandLocationPlanningRequestRecordReference = staffandLocationPlanningRequestRecordReference;
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

