package nhom12.uth.ccm.mapper;

import javax.annotation.processing.Generated;
import nhom12.uth.ccm.dto.request.EvProfileRequest;
import nhom12.uth.ccm.dto.response.EvProfileResponse;
import nhom12.uth.ccm.model.EVProfile;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-24T02:33:16+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class EvProfileMapperImpl implements EvProfileMapper {

    @Override
    public EVProfile toEvProfile(EvProfileRequest evProfileRequest) {
        if ( evProfileRequest == null ) {
            return null;
        }

        EVProfile eVProfile = new EVProfile();

        eVProfile.setBatteryCapacityKwh( evProfileRequest.getBatteryCapacityKwh() );
        eVProfile.setLicensePlate( evProfileRequest.getLicensePlate() );
        eVProfile.setRegistrationDate( evProfileRequest.getRegistrationDate() );
        eVProfile.setVehicleModel( evProfileRequest.getVehicleModel() );
        eVProfile.setVerificationDocumentUrl( evProfileRequest.getVerificationDocumentUrl() );

        return eVProfile;
    }

    @Override
    public EvProfileResponse toEvProfileResponse(EVProfile evProfile) {
        if ( evProfile == null ) {
            return null;
        }

        EvProfileResponse.EvProfileResponseBuilder evProfileResponse = EvProfileResponse.builder();

        evProfileResponse.batteryCapacityKwh( evProfile.getBatteryCapacityKwh() );
        evProfileResponse.evProfileId( evProfile.getEvProfileId() );
        evProfileResponse.licensePlate( evProfile.getLicensePlate() );
        evProfileResponse.registrationDate( evProfile.getRegistrationDate() );
        evProfileResponse.vehicleModel( evProfile.getVehicleModel() );
        evProfileResponse.verificationDocumentUrl( evProfile.getVerificationDocumentUrl() );
        evProfileResponse.verificationStatus( evProfile.getVerificationStatus() );

        return evProfileResponse.build();
    }

    @Override
    public void updateEvProfile(EVProfile evProfile, EvProfileRequest evProfileRequest) {
        if ( evProfileRequest == null ) {
            return;
        }

        evProfile.setBatteryCapacityKwh( evProfileRequest.getBatteryCapacityKwh() );
        evProfile.setLicensePlate( evProfileRequest.getLicensePlate() );
        evProfile.setRegistrationDate( evProfileRequest.getRegistrationDate() );
        evProfile.setVehicleModel( evProfileRequest.getVehicleModel() );
        evProfile.setVerificationDocumentUrl( evProfileRequest.getVerificationDocumentUrl() );
    }
}
