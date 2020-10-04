package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductandServicePlanningCaptureOutputModel
 */
public class BQProductandServicePlanningCaptureOutputModel   {
  private String staffandLocationPlanningPreconditions = null;

  private String staffandLocationPlanningBusinessUnitEmployeeReference = null;

  private String staffandLocationPlanningWorkSchedule = null;

  private String staffandLocationPlanning = null;

  private String staffandLocationPlanningPostconditions = null;

  private String staffandLocationPlanningStaffandLocationPlanningServiceType = null;

  private String staffandLocationPlanningStaffandLocationPlanningServiceDescription = null;

  private String staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs = null;

  private String staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct = null;

  private String productandServicePlanningCaptureActionTaskReference = null;

  private Object productandServicePlanningCaptureActionTaskRecord = null;

  private String productandServicePlanningCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return staffandLocationPlanningPreconditions
  **/

  public String getStaffandLocationPlanningPreconditions() {
    return staffandLocationPlanningPreconditions;
  }

  public void setStaffandLocationPlanningPreconditions(String staffandLocationPlanningPreconditions) {
    this.staffandLocationPlanningPreconditions = staffandLocationPlanningPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return staffandLocationPlanningBusinessUnitEmployeeReference
  **/

  public String getStaffandLocationPlanningBusinessUnitEmployeeReference() {
    return staffandLocationPlanningBusinessUnitEmployeeReference;
  }

  public void setStaffandLocationPlanningBusinessUnitEmployeeReference(String staffandLocationPlanningBusinessUnitEmployeeReference) {
    this.staffandLocationPlanningBusinessUnitEmployeeReference = staffandLocationPlanningBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return staffandLocationPlanningWorkSchedule
  **/

  public String getStaffandLocationPlanningWorkSchedule() {
    return staffandLocationPlanningWorkSchedule;
  }

  public void setStaffandLocationPlanningWorkSchedule(String staffandLocationPlanningWorkSchedule) {
    this.staffandLocationPlanningWorkSchedule = staffandLocationPlanningWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Branch Location Management Plan specific Business Service 
   * @return staffandLocationPlanning
  **/

  public String getStaffandLocationPlanning() {
    return staffandLocationPlanning;
  }

  public void setStaffandLocationPlanning(String staffandLocationPlanning) {
    this.staffandLocationPlanning = staffandLocationPlanning;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return staffandLocationPlanningPostconditions
  **/

  public String getStaffandLocationPlanningPostconditions() {
    return staffandLocationPlanningPostconditions;
  }

  public void setStaffandLocationPlanningPostconditions(String staffandLocationPlanningPostconditions) {
    this.staffandLocationPlanningPostconditions = staffandLocationPlanningPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return staffandLocationPlanningStaffandLocationPlanningServiceType
  **/

  public String getStaffandLocationPlanningStaffandLocationPlanningServiceType() {
    return staffandLocationPlanningStaffandLocationPlanningServiceType;
  }

  public void setStaffandLocationPlanningStaffandLocationPlanningServiceType(String staffandLocationPlanningStaffandLocationPlanningServiceType) {
    this.staffandLocationPlanningStaffandLocationPlanningServiceType = staffandLocationPlanningStaffandLocationPlanningServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return staffandLocationPlanningStaffandLocationPlanningServiceDescription
  **/

  public String getStaffandLocationPlanningStaffandLocationPlanningServiceDescription() {
    return staffandLocationPlanningStaffandLocationPlanningServiceDescription;
  }

  public void setStaffandLocationPlanningStaffandLocationPlanningServiceDescription(String staffandLocationPlanningStaffandLocationPlanningServiceDescription) {
    this.staffandLocationPlanningStaffandLocationPlanningServiceDescription = staffandLocationPlanningStaffandLocationPlanningServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs
  **/

  public String getStaffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs() {
    return staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs;
  }

  public void setStaffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs(String staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs) {
    this.staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs = staffandLocationPlanningStaffandLocationPlanningServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct
  **/

  public String getStaffandLocationPlanningStaffandLocationPlanningServiceWorkProduct() {
    return staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct;
  }

  public void setStaffandLocationPlanningStaffandLocationPlanningServiceWorkProduct(String staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct) {
    this.staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct = staffandLocationPlanningStaffandLocationPlanningServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product and Service Planning instance capture service call 
   * @return productandServicePlanningCaptureActionTaskReference
  **/

  public String getProductandServicePlanningCaptureActionTaskReference() {
    return productandServicePlanningCaptureActionTaskReference;
  }

  public void setProductandServicePlanningCaptureActionTaskReference(String productandServicePlanningCaptureActionTaskReference) {
    this.productandServicePlanningCaptureActionTaskReference = productandServicePlanningCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return productandServicePlanningCaptureActionTaskRecord
  **/

  public Object getProductandServicePlanningCaptureActionTaskRecord() {
    return productandServicePlanningCaptureActionTaskRecord;
  }

  public void setProductandServicePlanningCaptureActionTaskRecord(Object productandServicePlanningCaptureActionTaskRecord) {
    this.productandServicePlanningCaptureActionTaskRecord = productandServicePlanningCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product and Service Planning structured input transaction/record 
   * @return productandServicePlanningCaptureRecordReference
  **/

  public String getProductandServicePlanningCaptureRecordReference() {
    return productandServicePlanningCaptureRecordReference;
  }

  public void setProductandServicePlanningCaptureRecordReference(String productandServicePlanningCaptureRecordReference) {
    this.productandServicePlanningCaptureRecordReference = productandServicePlanningCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

