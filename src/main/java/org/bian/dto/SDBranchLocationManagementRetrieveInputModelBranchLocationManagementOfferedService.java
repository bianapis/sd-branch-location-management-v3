package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService
 */
public class SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService   {
  private String branchLocationManagementServiceReference = null;

  private SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord branchLocationManagementServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return branchLocationManagementServiceReference
  **/

  public String getBranchLocationManagementServiceReference() {
    return branchLocationManagementServiceReference;
  }

  public void setBranchLocationManagementServiceReference(String branchLocationManagementServiceReference) {
    this.branchLocationManagementServiceReference = branchLocationManagementServiceReference;
  }


  /**
   * Get branchLocationManagementServiceRecord
   * @return branchLocationManagementServiceRecord
  **/

  public SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord getBranchLocationManagementServiceRecord() {
    return branchLocationManagementServiceRecord;
  }

  public void setBranchLocationManagementServiceRecord(SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord branchLocationManagementServiceRecord) {
    this.branchLocationManagementServiceRecord = branchLocationManagementServiceRecord;
  }


}

