package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementFeedbackOutputModelBranchLocationManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementFeedbackOutputModel
 */
public class SDBranchLocationManagementFeedbackOutputModel   {
  private String branchLocationManagementFeedbackActionTaskReference = null;

  private Object branchLocationManagementFeedbackActionTaskRecord = null;

  private SDBranchLocationManagementFeedbackOutputModelBranchLocationManagementFeedbackActionRecord branchLocationManagementFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return branchLocationManagementFeedbackActionTaskReference
  **/

  public String getBranchLocationManagementFeedbackActionTaskReference() {
    return branchLocationManagementFeedbackActionTaskReference;
  }

  public void setBranchLocationManagementFeedbackActionTaskReference(String branchLocationManagementFeedbackActionTaskReference) {
    this.branchLocationManagementFeedbackActionTaskReference = branchLocationManagementFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return branchLocationManagementFeedbackActionTaskRecord
  **/

  public Object getBranchLocationManagementFeedbackActionTaskRecord() {
    return branchLocationManagementFeedbackActionTaskRecord;
  }

  public void setBranchLocationManagementFeedbackActionTaskRecord(Object branchLocationManagementFeedbackActionTaskRecord) {
    this.branchLocationManagementFeedbackActionTaskRecord = branchLocationManagementFeedbackActionTaskRecord;
  }


  /**
   * Get branchLocationManagementFeedbackActionRecord
   * @return branchLocationManagementFeedbackActionRecord
  **/

  public SDBranchLocationManagementFeedbackOutputModelBranchLocationManagementFeedbackActionRecord getBranchLocationManagementFeedbackActionRecord() {
    return branchLocationManagementFeedbackActionRecord;
  }

  public void setBranchLocationManagementFeedbackActionRecord(SDBranchLocationManagementFeedbackOutputModelBranchLocationManagementFeedbackActionRecord branchLocationManagementFeedbackActionRecord) {
    this.branchLocationManagementFeedbackActionRecord = branchLocationManagementFeedbackActionRecord;
  }


}

