package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup
 */
public class SDBranchLocationManagementActivateInputModelBranchLocationManagementServiceConfigurationRecordBranchLocationManagementServiceConfigurationSetup   {
  private String branchLocationManagementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return branchLocationManagementServiceConfigurationParameter
  **/

  public String getBranchLocationManagementServiceConfigurationParameter() {
    return branchLocationManagementServiceConfigurationParameter;
  }

  public void setBranchLocationManagementServiceConfigurationParameter(String branchLocationManagementServiceConfigurationParameter) {
    this.branchLocationManagementServiceConfigurationParameter = branchLocationManagementServiceConfigurationParameter;
  }


}

