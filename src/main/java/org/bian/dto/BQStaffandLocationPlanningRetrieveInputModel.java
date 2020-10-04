package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceAnalysis;
import org.bian.dto.BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStaffandLocationPlanningRetrieveInputModel
 */
public class BQStaffandLocationPlanningRetrieveInputModel   {
  private Object staffandLocationPlanningRetrieveActionTaskRecord = null;

  private String staffandLocationPlanningRetrieveActionRequest = null;

  private BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport staffandLocationPlanningInstanceReport = null;

  private BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceAnalysis staffandLocationPlanningInstanceAnalysis = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return staffandLocationPlanningRetrieveActionTaskRecord
  **/

  public Object getStaffandLocationPlanningRetrieveActionTaskRecord() {
    return staffandLocationPlanningRetrieveActionTaskRecord;
  }

  public void setStaffandLocationPlanningRetrieveActionTaskRecord(Object staffandLocationPlanningRetrieveActionTaskRecord) {
    this.staffandLocationPlanningRetrieveActionTaskRecord = staffandLocationPlanningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return staffandLocationPlanningRetrieveActionRequest
  **/

  public String getStaffandLocationPlanningRetrieveActionRequest() {
    return staffandLocationPlanningRetrieveActionRequest;
  }

  public void setStaffandLocationPlanningRetrieveActionRequest(String staffandLocationPlanningRetrieveActionRequest) {
    this.staffandLocationPlanningRetrieveActionRequest = staffandLocationPlanningRetrieveActionRequest;
  }


  /**
   * Get staffandLocationPlanningInstanceReport
   * @return staffandLocationPlanningInstanceReport
  **/

  public BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport getStaffandLocationPlanningInstanceReport() {
    return staffandLocationPlanningInstanceReport;
  }

  public void setStaffandLocationPlanningInstanceReport(BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport staffandLocationPlanningInstanceReport) {
    this.staffandLocationPlanningInstanceReport = staffandLocationPlanningInstanceReport;
  }


  /**
   * Get staffandLocationPlanningInstanceAnalysis
   * @return staffandLocationPlanningInstanceAnalysis
  **/

  public BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceAnalysis getStaffandLocationPlanningInstanceAnalysis() {
    return staffandLocationPlanningInstanceAnalysis;
  }

  public void setStaffandLocationPlanningInstanceAnalysis(BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceAnalysis staffandLocationPlanningInstanceAnalysis) {
    this.staffandLocationPlanningInstanceAnalysis = staffandLocationPlanningInstanceAnalysis;
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

