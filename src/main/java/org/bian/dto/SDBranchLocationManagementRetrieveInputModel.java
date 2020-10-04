package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService;
import org.bian.dto.SDBranchLocationManagementRetrieveInputModelBranchLocationManagementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationManagementRetrieveInputModel
 */
public class SDBranchLocationManagementRetrieveInputModel   {
  private Object branchLocationManagementRetrieveActionTaskRecord = null;

  private String branchLocationManagementRetrieveActionRequest = null;

  private SDBranchLocationManagementRetrieveInputModelBranchLocationManagementRetrieveActionRecord branchLocationManagementRetrieveActionRecord = null;

  private SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService branchLocationManagementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationManagementRetrieveActionTaskRecord
  **/

  public Object getBranchLocationManagementRetrieveActionTaskRecord() {
    return branchLocationManagementRetrieveActionTaskRecord;
  }

  public void setBranchLocationManagementRetrieveActionTaskRecord(Object branchLocationManagementRetrieveActionTaskRecord) {
    this.branchLocationManagementRetrieveActionTaskRecord = branchLocationManagementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchLocationManagementRetrieveActionRequest
  **/

  public String getBranchLocationManagementRetrieveActionRequest() {
    return branchLocationManagementRetrieveActionRequest;
  }

  public void setBranchLocationManagementRetrieveActionRequest(String branchLocationManagementRetrieveActionRequest) {
    this.branchLocationManagementRetrieveActionRequest = branchLocationManagementRetrieveActionRequest;
  }


  /**
   * Get branchLocationManagementRetrieveActionRecord
   * @return branchLocationManagementRetrieveActionRecord
  **/

  public SDBranchLocationManagementRetrieveInputModelBranchLocationManagementRetrieveActionRecord getBranchLocationManagementRetrieveActionRecord() {
    return branchLocationManagementRetrieveActionRecord;
  }

  public void setBranchLocationManagementRetrieveActionRecord(SDBranchLocationManagementRetrieveInputModelBranchLocationManagementRetrieveActionRecord branchLocationManagementRetrieveActionRecord) {
    this.branchLocationManagementRetrieveActionRecord = branchLocationManagementRetrieveActionRecord;
  }


  /**
   * Get branchLocationManagementOfferedService
   * @return branchLocationManagementOfferedService
  **/

  public SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService getBranchLocationManagementOfferedService() {
    return branchLocationManagementOfferedService;
  }

  public void setBranchLocationManagementOfferedService(SDBranchLocationManagementRetrieveInputModelBranchLocationManagementOfferedService branchLocationManagementOfferedService) {
    this.branchLocationManagementOfferedService = branchLocationManagementOfferedService;
  }


}

