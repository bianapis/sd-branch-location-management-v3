package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord
 */
public class SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedServiceBranchLocationManagementServiceRecord   {
  private String branchLocationManagementServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return branchLocationManagementServiceVersion
  **/

  public String getBranchLocationManagementServiceVersion() {
    return branchLocationManagementServiceVersion;
  }

  public void setBranchLocationManagementServiceVersion(String branchLocationManagementServiceVersion) {
    this.branchLocationManagementServiceVersion = branchLocationManagementServiceVersion;
  }


}

