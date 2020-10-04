/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BranchLocationManagementApiService {

	SDBranchLocationManagementActivateOutputModel activate(SDBranchLocationManagementActivateInputModel request);
	
	BQCustomerLiaisonCaptureOutputModel captureCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonCaptureInputModel request);
	
	BQProductandServicePlanningCaptureOutputModel captureProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningCaptureInputModel request);
	
	BQStaffandLocationPlanningCaptureOutputModel captureStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningCaptureInputModel request);
	
	BQTroubleshootingCaptureOutputModel captureTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingCaptureInputModel request);
	
	CRBranchLocationManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanCaptureInputModel request);
	
	SDBranchLocationManagementConfigureOutputModel configure(String sdReferenceId, SDBranchLocationManagementConfigureInputModel request);
	
	BQProductandServicePlanningControlOutputModel controlProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningControlInputModel request);
	
	CRBranchLocationManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanControlInputModel request);
	
	CRBranchLocationManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanExchangeInputModel request);
	
	SDBranchLocationManagementFeedbackOutputModel feedback(String sdReferenceId, SDBranchLocationManagementFeedbackInputModel request);
	
	CRBranchLocationManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanGrantInputModel request);
	
	CRBranchLocationManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRBranchLocationManagementPlanInitiateInputModel request);
	
	BQCustomerLiaisonInitiateOutputModel initiateCustomerliaison(String sdReferenceId, String crReferenceId, BQCustomerLiaisonInitiateInputModel request);
	
	BQTroubleshootingInitiateOutputModel initiateTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingInitiateInputModel request);
	
	BQCustomerLiaisonRequestOutputModel requestCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonRequestInputModel request);
	
	BQProductandServicePlanningRequestOutputModel requestProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningRequestInputModel request);
	
	BQStaffandLocationPlanningRequestOutputModel requestStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRBranchLocationManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanRequestInputModel request);
	
	CRBranchLocationManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQCustomerLiaisonRetrieveOutputModel retrieveCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductandServicePlanningRetrieveOutputModel retrieveProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStaffandLocationPlanningRetrieveOutputModel retrieveStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDBranchLocationManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBranchLocationManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanUpdateInputModel request);
	
	BQCustomerLiaisonUpdateOutputModel updateCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonUpdateInputModel request);
	
	BQProductandServicePlanningUpdateOutputModel updateProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningUpdateInputModel request);
	
	BQStaffandLocationPlanningUpdateOutputModel updateStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
