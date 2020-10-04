package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementFeedbackInputModelBranchLocationManagementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementFeedbackInputModel
 */
public class SDBranchLocationManagementFeedbackInputModel   {
  private Object branchLocationManagementFeedbackActionTaskRecord = null;

  private SDBranchLocationManagementFeedbackInputModelBranchLocationManagementFeedbackActionRecord branchLocationManagementFeedbackActionRecord = null;


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

  public SDBranchLocationManagementFeedbackInputModelBranchLocationManagementFeedbackActionRecord getBranchLocationManagementFeedbackActionRecord() {
    return branchLocationManagementFeedbackActionRecord;
  }

  public void setBranchLocationManagementFeedbackActionRecord(SDBranchLocationManagementFeedbackInputModelBranchLocationManagementFeedbackActionRecord branchLocationManagementFeedbackActionRecord) {
    this.branchLocationManagementFeedbackActionRecord = branchLocationManagementFeedbackActionRecord;
  }


}

