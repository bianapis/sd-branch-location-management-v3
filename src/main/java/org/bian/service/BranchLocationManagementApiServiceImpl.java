/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BranchLocationManagementApiServiceImpl implements BranchLocationManagementApiService {

	public SDBranchLocationManagementActivateOutputModel activate(SDBranchLocationManagementActivateInputModel request){
		return JsonReader.read("activate-SDBranchLocationManagementActivateOutputModel.json",new TypeReference<SDBranchLocationManagementActivateOutputModel>(){});
	}
	
	public BQCustomerLiaisonCaptureOutputModel captureCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonCaptureInputModel request){
		return JsonReader.read("capture-BQCustomerLiaisonCaptureOutputModel.json",new TypeReference<BQCustomerLiaisonCaptureOutputModel>(){});
	}
	
	public BQProductandServicePlanningCaptureOutputModel captureProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningCaptureInputModel request){
		return JsonReader.read("capture-BQProductandServicePlanningCaptureOutputModel.json",new TypeReference<BQProductandServicePlanningCaptureOutputModel>(){});
	}
	
	public BQStaffandLocationPlanningCaptureOutputModel captureStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningCaptureInputModel request){
		return JsonReader.read("capture-BQStaffandLocationPlanningCaptureOutputModel.json",new TypeReference<BQStaffandLocationPlanningCaptureOutputModel>(){});
	}
	
	public BQTroubleshootingCaptureOutputModel captureTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingCaptureInputModel request){
		return JsonReader.read("capture-BQTroubleshootingCaptureOutputModel.json",new TypeReference<BQTroubleshootingCaptureOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanCaptureInputModel request){
		return JsonReader.read("capture-CRBranchLocationManagementPlanCaptureOutputModel.json",new TypeReference<CRBranchLocationManagementPlanCaptureOutputModel>(){});
	}
	
	public SDBranchLocationManagementConfigureOutputModel configure(String sdReferenceId, SDBranchLocationManagementConfigureInputModel request){
		return JsonReader.read("configure-SDBranchLocationManagementConfigureOutputModel.json",new TypeReference<SDBranchLocationManagementConfigureOutputModel>(){});
	}
	
	public BQProductandServicePlanningControlOutputModel controlProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningControlInputModel request){
		return JsonReader.read("control-BQProductandServicePlanningControlOutputModel.json",new TypeReference<BQProductandServicePlanningControlOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanControlInputModel request){
		return JsonReader.read("control-CRBranchLocationManagementPlanControlOutputModel.json",new TypeReference<CRBranchLocationManagementPlanControlOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRBranchLocationManagementPlanExchangeOutputModel.json",new TypeReference<CRBranchLocationManagementPlanExchangeOutputModel>(){});
	}
	
	public SDBranchLocationManagementFeedbackOutputModel feedback(String sdReferenceId, SDBranchLocationManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDBranchLocationManagementFeedbackOutputModel.json",new TypeReference<SDBranchLocationManagementFeedbackOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRBranchLocationManagementPlanGrantOutputModel.json",new TypeReference<CRBranchLocationManagementPlanGrantOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRBranchLocationManagementPlanInitiateInputModel request){
		return JsonReader.read("initiate-CRBranchLocationManagementPlanInitiateOutputModel.json",new TypeReference<CRBranchLocationManagementPlanInitiateOutputModel>(){});
	}
	
	public BQCustomerLiaisonInitiateOutputModel initiateCustomerliaison(String sdReferenceId, String crReferenceId, BQCustomerLiaisonInitiateInputModel request){
		return JsonReader.read("initiate-BQCustomerLiaisonInitiateOutputModel.json",new TypeReference<BQCustomerLiaisonInitiateOutputModel>(){});
	}
	
	public BQTroubleshootingInitiateOutputModel initiateTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingInitiateInputModel request){
		return JsonReader.read("initiate-BQTroubleshootingInitiateOutputModel.json",new TypeReference<BQTroubleshootingInitiateOutputModel>(){});
	}
	
	public BQCustomerLiaisonRequestOutputModel requestCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonRequestInputModel request){
		return JsonReader.read("request-BQCustomerLiaisonRequestOutputModel.json",new TypeReference<BQCustomerLiaisonRequestOutputModel>(){});
	}
	
	public BQProductandServicePlanningRequestOutputModel requestProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningRequestInputModel request){
		return JsonReader.read("request-BQProductandServicePlanningRequestOutputModel.json",new TypeReference<BQProductandServicePlanningRequestOutputModel>(){});
	}
	
	public BQStaffandLocationPlanningRequestOutputModel requestStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningRequestInputModel request){
		return JsonReader.read("request-BQStaffandLocationPlanningRequestOutputModel.json",new TypeReference<BQStaffandLocationPlanningRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRBranchLocationManagementPlanRequestOutputModel.json",new TypeReference<CRBranchLocationManagementPlanRequestOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBranchLocationManagementPlanRetrieveOutputModel.json",new TypeReference<CRBranchLocationManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCustomerLiaisonRetrieveOutputModel retrieveCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerLiaisonRetrieveOutputModel.json",new TypeReference<BQCustomerLiaisonRetrieveOutputModel>(){});
	}
	
	public BQProductandServicePlanningRetrieveOutputModel retrieveProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductandServicePlanningRetrieveOutputModel.json",new TypeReference<BQProductandServicePlanningRetrieveOutputModel>(){});
	}
	
	public BQStaffandLocationPlanningRetrieveOutputModel retrieveStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStaffandLocationPlanningRetrieveOutputModel.json",new TypeReference<BQStaffandLocationPlanningRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDBranchLocationManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBranchLocationManagementRetrieveOutputModel.json",new TypeReference<SDBranchLocationManagementRetrieveOutputModel>(){});
	}
	
	public CRBranchLocationManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBranchLocationManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRBranchLocationManagementPlanUpdateOutputModel.json",new TypeReference<CRBranchLocationManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCustomerLiaisonUpdateOutputModel updateCustomerliaison(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerLiaisonUpdateInputModel request){
		return JsonReader.read("update-BQCustomerLiaisonUpdateOutputModel.json",new TypeReference<BQCustomerLiaisonUpdateOutputModel>(){});
	}
	
	public BQProductandServicePlanningUpdateOutputModel updateProductandserviceplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductandServicePlanningUpdateInputModel request){
		return JsonReader.read("update-BQProductandServicePlanningUpdateOutputModel.json",new TypeReference<BQProductandServicePlanningUpdateOutputModel>(){});
	}
	
	public BQStaffandLocationPlanningUpdateOutputModel updateStaffandlocationplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStaffandLocationPlanningUpdateInputModel request){
		return JsonReader.read("update-BQStaffandLocationPlanningUpdateOutputModel.json",new TypeReference<BQStaffandLocationPlanningUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
