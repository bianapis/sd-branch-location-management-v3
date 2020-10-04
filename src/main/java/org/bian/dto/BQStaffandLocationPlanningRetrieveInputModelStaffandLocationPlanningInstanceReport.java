package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport
 */
public class BQStaffandLocationPlanningRetrieveInputModelStaffandLocationPlanningInstanceReport   {
  private String staffandLocationPlanningInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return staffandLocationPlanningInstanceReportReference
  **/

  public String getStaffandLocationPlanningInstanceReportReference() {
    return staffandLocationPlanningInstanceReportReference;
  }

  public void setStaffandLocationPlanningInstanceReportReference(String staffandLocationPlanningInstanceReportReference) {
    this.staffandLocationPlanningInstanceReportReference = staffandLocationPlanningInstanceReportReference;
  }


}

