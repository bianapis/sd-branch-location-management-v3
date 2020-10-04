package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffandLocationPlanningRetrieveOutputModelStaffandLocationPlanningInstanceReport
 */
public class BQStaffandLocationPlanningRetrieveOutputModelStaffandLocationPlanningInstanceReport   {
  private Object staffandLocationPlanningInstanceReportRecord = null;

  private String staffandLocationPlanningInstanceReportType = null;

  private String staffandLocationPlanningInstanceReportParameters = null;

  private Object staffandLocationPlanningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return staffandLocationPlanningInstanceReportRecord
  **/

  public Object getStaffandLocationPlanningInstanceReportRecord() {
    return staffandLocationPlanningInstanceReportRecord;
  }

  public void setStaffandLocationPlanningInstanceReportRecord(Object staffandLocationPlanningInstanceReportRecord) {
    this.staffandLocationPlanningInstanceReportRecord = staffandLocationPlanningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return staffandLocationPlanningInstanceReportType
  **/

  public String getStaffandLocationPlanningInstanceReportType() {
    return staffandLocationPlanningInstanceReportType;
  }

  public void setStaffandLocationPlanningInstanceReportType(String staffandLocationPlanningInstanceReportType) {
    this.staffandLocationPlanningInstanceReportType = staffandLocationPlanningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return staffandLocationPlanningInstanceReportParameters
  **/

  public String getStaffandLocationPlanningInstanceReportParameters() {
    return staffandLocationPlanningInstanceReportParameters;
  }

  public void setStaffandLocationPlanningInstanceReportParameters(String staffandLocationPlanningInstanceReportParameters) {
    this.staffandLocationPlanningInstanceReportParameters = staffandLocationPlanningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return staffandLocationPlanningInstanceReport
  **/

  public Object getStaffandLocationPlanningInstanceReport() {
    return staffandLocationPlanningInstanceReport;
  }

  public void setStaffandLocationPlanningInstanceReport(Object staffandLocationPlanningInstanceReport) {
    this.staffandLocationPlanningInstanceReport = staffandLocationPlanningInstanceReport;
  }


}

